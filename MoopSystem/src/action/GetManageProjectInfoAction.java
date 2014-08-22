package action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import service.ProjectService;
import service.ReProjectUserService;

import com.opensymphony.xwork2.ActionSupport;

import domain.ProjectInfo;
import domain.ReProjectUser;

public class GetManageProjectInfoAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ProjectInfo projectInfo;
	private List<ReProjectUser> reProjectUser;
	
	private ProjectService projectService;
	private ReProjectUserService reProjectUserService;
	
	
	
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
		projectInfo = projectService.selectProjectInfo(Integer.parseInt(s)); 
		reProjectUser = reProjectUserService.selectReProjectUserInfo(Integer.parseInt(s));
		if(projectInfo != null){
			projectInfo.setId(Integer.parseInt(s));
			System.out.println(projectInfo.getProjectState());
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}
}
