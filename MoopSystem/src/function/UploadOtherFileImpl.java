package function;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.apache.struts2.ServletActionContext;

public class UploadOtherFileImpl implements UploadFile{

	

	private final static String UPLOADDIR = "upload";
	
	@Override
	public String uploadFile(String email, String projectId, File file,
			String fileName, int width, int height) {
		// TODO Auto-generated method stub
		
		String webpath=ServletActionContext.getRequest().getSession().getServletContext().getRealPath("/");
		String dir = webpath + UPLOADDIR + "\\" + email + "\\" + projectId;
		File fileLocation = new File(dir);
		if(!fileLocation.exists()){
			if(!fileLocation.mkdirs()){
				return null;
			}
		}
		
		try {
			InputStream in = new FileInputStream(file);
			int pos = fileName.indexOf(".") + 1;
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
			String path = String.format("%s/%s/%s/%s", UPLOADDIR, email, projectId, fileName);
			return path;
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch (IOException ex) {
			System.out.println("ÉÏ´«Ê§°Ü!");
			ex.printStackTrace();
		}
		
		
		
		return null;
	}

}
