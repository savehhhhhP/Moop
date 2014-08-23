package action;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import service.DocumentService;
import service.PatentService;
import service.ProjectService;
import service.ReProjectUserService;
import service.ThesisService;
import service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Document;
import domain.Patent;
import domain.ProjectInfo;
import domain.ReProjectUser;
import domain.Thesis;
import domain.UserInfo;

public class GetManageProjectInfoAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ProjectInfo projectInfo;
	private List<ReProjectUser> reProjectUser;
	
	private ProjectService projectService;
	private ReProjectUserService reProjectUserService;
	
	private UserService userService;
	private ThesisService thesisService;
	private DocumentService documentService;
	private PatentService patentService;
	private List<Patent> patentList;
	private List<Thesis> thesisList;
	private List<Document> documentList;
	private String userEmail;
	
	
	
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

	public List<Thesis> getThesisList() {
		return thesisList;
	}

	public void setThesisList(List<Thesis> thesisList) {
		this.thesisList = thesisList;
	}

	public List<Document> getDocumentList() {
		return documentList;
	}

	public void setDocumentList(List<Document> documentList) {
		this.documentList = documentList;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public List<Patent> getPatentList() {
		return patentList;
	}

	public void setPatentList(List<Patent> patentList) {
		this.patentList = patentList;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public PatentService getPatentService() {
		return patentService;
	}

	public void setPatentService(PatentService patentService) {
		this.patentService = patentService;
	}

	public ReProjectUserService getReProjectUserService() {
		return reProjectUserService;
	}

	public void setReProjectUserService(ReProjectUserService reProjectUserService) {
		this.reProjectUserService = reProjectUserService;
	}

	public ProjectService getProjectService() {
		return projectService;
	}

	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}

	public ProjectInfo getProjectInfo() {
		return projectInfo;
	}

	public void setProjectInfo(ProjectInfo projectInfo) {
		this.projectInfo = projectInfo;
	}
	


	public List<ReProjectUser> getReProjectUser() {
		return reProjectUser;
	}

	public void setReProjectUser(List<ReProjectUser> reProjectUser) {
		this.reProjectUser = reProjectUser;
	}

	public String execute(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String s = request.getParameter("projectId");
		int id = Integer.parseInt(s);
		
		Map session = ActionContext.getContext().getSession();
		UserInfo userInfo = null;
		if(session.containsKey("userEmail") && id > 0){
			userEmail = session.get("userEmail").toString().trim();
			userInfo = userService.findByEmail(userEmail);
			patentList = patentService.selectByProjectId(id);
			thesisList = thesisService.selectByProjectId(id);
			documentList = documentService.selectByProjectId(id);
			projectInfo = projectService.selectProjectInfo(id); 
			reProjectUser = reProjectUserService.selectReProjectUserInfo(id);
			if(projectInfo != null){
				projectInfo.setId(id);
				System.out.println(projectInfo.getProjectState());
				return SUCCESS;
			}
			else{
				return ERROR;
			}
		}else{
			return ERROR;
		}
		
	}
}
