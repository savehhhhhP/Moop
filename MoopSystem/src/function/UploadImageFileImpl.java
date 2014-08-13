package function;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

import javax.imageio.ImageIO;

import org.apache.struts2.ServletActionContext;

public class UploadImageFileImpl implements UploadFile{

	

	private final static String UPLOADDIR = "upload";
	/*
	 * 上传图片 返回的是存储路径(non-Javadoc)
	 * @see function.UploadFile#uploadFile(java.lang.String, java.io.File, java.lang.String)
	 */
	@Override
	public String uploadFile(String email, File file, String fileName, int width, int height) {
		// TODO Auto-generated method stub
		
		
		//String dir = ServletActionContext.getRequest().getRealPath(UPLOADDIR);
		
		String webpath=ServletActionContext.getRequest().getSession().getServletContext().getRealPath("/");
		String dir = webpath + "/" + UPLOADDIR + "/" + email;
		File fileLocation = new File(dir);
		if(!fileLocation.exists()){
			if(!fileLocation.mkdirs()){
				return null;
			}
		}
		
		try {
			/*File newImage = new File(dir, fileName);
			BufferedImage bufferedImage = resizeImage(file, width, height);
			ImageIO.write(bufferedImage, fileName, newImage);*/
			InputStream in = new FileInputStream(file);
			int pos = fileName.indexOf(".");
			String fileContentType = fileName.substring(pos + 1);
			File uploadFile = new File(dir, fileName);
			OutputStream out = new FileOutputStream(uploadFile);
			byte[] buffer = new byte[1024 * 1024];
			int length;
			while ((length = in.read(buffer)) > 0) {
				out.write(buffer, 0, length);
			}
			in.close();
			out.close();

			BufferedImage bufferedImage = resizeImage(uploadFile, width, height); 
			ImageIO.write(bufferedImage, fileContentType, uploadFile); 
			String path = String.format("%s/%s/%s", UPLOADDIR, email, fileName);
			return path;

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException ex) {
			System.out.println("上传失败!");
			ex.printStackTrace();
		}
		
		return null;
	}

	public BufferedImage resizeImage(File file, int width, int height){
		try {
			BufferedImage image = ImageIO.read(file);
			BufferedImage newImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
			newImage.getGraphics().drawImage(image.getScaledInstance(width, height,Image.SCALE_SMOOTH), 0, 0, null);
			
			return newImage;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
}
