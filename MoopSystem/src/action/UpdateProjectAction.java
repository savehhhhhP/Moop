package action;

import java.util.Set;

import service.EnterpriseService;
import service.ProjectService;
import service.ProjectStateService;
import service.ProjectTypeService;

import com.opensymphony.xwork2.ActionSupport;

import domain.Enterprise;
import domain.ProjectInfo;
import domain.ProjectState;
import domain.ProjectType;
import domain.UserInfo;

public class UpdateProjectAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProjectService projectService;
	private EnterpriseService enterpriseService;
	private ProjectTypeService projectTypeService;
	private ProjectStateService projectStateService;
	
	
	private String name;
	private String number;
	private String type;
	private String enterpriseName;
	private String id;
	private String startDate;
	private String endDate;
	private double funds;
	private String isPublic;
	private String state;
	private String introduction;
	
	public ProjectService getProjectService() {
		return projectService;
	}

	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}
	
	public ProjectTypeService getProjectTypeService() {
		return projectTypeService;
	}

	public void setProjectTypeService(ProjectTypeService projectTypeService) {
		this.projectTypeService = projectTypeService;
	}

	public ProjectStateService getProjectStateService() {
		return projectStateService;
	}

	public void setProjectStateService(ProjectStateService projectStateService) {
		this.projectStateService = projectStateService;
	}

	public EnterpriseService getEnterpriseService() {
		return enterpriseService;
	}

	public void setEnterpriseService(EnterpriseService enterpriseService) {
		this.enterpriseService = enterpriseService;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEnterpriseName() {
		return enterpriseName;
	}

	public void setEnterpriseName(String enterprise) {
		this.enterpriseName = enterprise;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public double getFunds() {
		return funds;
	}

	public void setFunds(double funds) {
		this.funds = funds;
	}

	public String getIsPublic() {
		return isPublic;
	}

	public void setIsPublic(String isPublic) {
		this.isPublic = isPublic;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String execute(){
		Enterprise enterprise = enterpriseService.findByName(enterpriseName);
		ProjectType projectType = projectTypeService.findByName(type);
		ProjectState projectState = projectStateService.findByName(state);
		ProjectInfo projectInfo = projectService.selectProject(Integer.parseInt(id));
		if(projectInfo == null){
			return ERROR;
		}
		projectInfo.setName(name);
		projectInfo.setNumber(number);
		projectInfo.setProjectType(projectType);
		projectInfo.setProjectState(projectState);
		projectInfo.setEnterprise(enterprise);
		projectInfo.setEndDate(endDate);
		projectInfo.setEnterpriseName(enterpriseName);
		projectInfo.setStartDate(startDate);
		projectInfo.setFunds(funds);
		projectInfo.setIsPublic(isPublic);
		projectInfo.setIntroduction(introduction.trim());
		if(projectService.update(projectInfo) == 1)
		{
			return null;
		}
		else
			return null;
	}
}
