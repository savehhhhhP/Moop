package action;

import java.io.InputStream;  

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;  
  
import com.opensymphony.xwork2.ActionSupport;  
  
public class downloadAction extends ActionSupport {  
      
    private InputStream fileInput;  
    private String fileName;  
    private String filePath;
  
    public String getFileName() {  
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
    	filePath = request.getParameter("filePath");
    	fileName = request.getParameter("fileName");
    	fileInput=ServletActionContext.getServletContext().getResourceAsStream("/" + filePath);  
        return "success";  
    }  
}  
