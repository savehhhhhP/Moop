package action;

import java.io.InputStream;  
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;  
  
import com.opensymphony.xwork2.ActionSupport;  
  
public class downloadAction extends ActionSupport {  
      
    private InputStream fileInput;  
    private String fileName;  
    private String filePath;
    public String getFileName() { 
    	try {
			fileName = new String(fileName.getBytes(), "ISO8859-1");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return fileName;
    }  
  
    public void setFileName(String fileName) {  
        this.fileName = fileName;  
    }  
  
    public InputStream getFileInput() {  
        return fileInput;
    }  
  
    public void setFileInput(InputStream fileInput) {  
        this.fileInput = fileInput;  
    }  
    
    public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String execute() throws Exception{  
		HttpServletRequest request = ServletActionContext.getRequest();
		if(fileName.equals("")){
			fileName = request.getParameter("fileName");
		}
		if("filePath".equals("")){
			filePath = request.getParameter("filePath");
		}
    	fileInput=ServletActionContext.getServletContext().getResourceAsStream("/" + filePath);  
        return "success";  
    }  
}  
