package action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import service.DocumentService;
import service.PatentService;
import service.ThesisService;

import com.opensymphony.xwork2.ActionSupport;

public class DeleteFileAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PatentService patentService;
	private ThesisService thesisService;
	private DocumentService documentService;
	
	
	
	public ThesisService getThesisService() {
		return thesisService;
	}

	public void setThesisService(ThesisService thesisService) {
		this.thesisService = thesisService;
	}

	public DocumentService getDocumentService() {
		return documentService;
	}

	public void setDocumentService(DocumentService documentService) {
		this.documentService = documentService;
	}

	public PatentService getPatentService() {
		return patentService;
	}

	public void setPatentService(PatentService patentService) {
		this.patentService = patentService;
	}

	public String execute(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String type = request.getParameter("type");
		String id = request.getParameter("id");
		int fileId = -1;
		if(!(id.equals(""))){
			fileId = Integer.parseInt(id);
		}
		
		if(type.equals("patent")){
			patentService.deleteById(fileId);
		}else if(type.equals("thesis")){
			thesisService.deleteById(fileId);
		}else if(type.equals("document")){
			documentService.deleteById(fileId);
		}
		
		return null;
	}
	
}
