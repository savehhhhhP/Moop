package action;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import service.ProjectService;

import com.opensymphony.xwork2.ActionSupport;

import domain.ProjectInfo;

public class GetManageProjectInfoAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProjectInfo projectInfo;
	private ProjectService projectService;
	
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

	public String execute(){
		HttpServletRequest request = ServletActionContext.getRequest();
		String s = request.getParameter("projectId");
		projectInfo = new ProjectInfo();
		projectInfo = projectService.selectProjectInfo(Integer.parseInt(s)); 
		if(projectInfo != null){
			projectInfo.setId(Integer.parseInt(s));
			return SUCCESS;
		}
		else{
			return ERROR;
		}
	}
}
