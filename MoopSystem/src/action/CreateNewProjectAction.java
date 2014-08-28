package action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import service.EnterpriseService;
import service.ProjectService;
import service.ProjectStateService;
import service.ProjectTypeService;
import service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Enterprise;
import domain.ProjectInfo;
import domain.ProjectState;
import domain.ProjectType;
import domain.UserInfo;
import function.UploadImageFileImpl;

public class CreateNewProjectAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String _projectName;
	private String _projectNumber;
	// private String _projectMaster;
	private String _projectEnterprise;
	private String _projectType;
	private String _startDate;
	private String _endDate;
	private String _projectFunds;
	private String _isPublic;
	private String _projectState;
	private String _projectIntroduction;
	private String _projectPicturePath;

	private ProjectService projectService;
	private EnterpriseService entepriseService;
	private ProjectStateService projectStateService;
	private ProjectTypeService projectTypeService;
	private UserService userService;

	private File file;
	private String fileContentType;
	private String fileFileName;

	private UploadImageFileImpl uploadImageFile;
	public String get_projectPicturePath() {
		return _projectPicturePath;
	}

	public void set_projectPicturePath(String _projectPicturePath) {
		this._projectPicturePath = _projectPicturePath;
	}

	public String get_projectName() {
		return this._projectName;
	}

	public void set_projectName(String _projectName) {
		this._projectName = _projectName;
	}

	public String get_projectNumber() {
		return this._projectNumber;
	}

	public void set_projectNumber(String _projectNumber) {
		this._projectNumber = _projectNumber;
	}

	public String get_projectEnterprise() {
		return this._projectEnterprise;
	}

	public void set_projectEnterprise(String _projectEnterprise) {
		this._projectEnterprise = _projectEnterprise;
	}

	public String get_projectType() {
		return this._projectType;
	}

	public void set_projectType(String _projectType) {
		this._projectType = _projectType;
	}

	public String get_startDate() {
		return this._startDate;
	}

	public void set_startDate(String _startDate) {
		this._startDate = _startDate;
	}

	public String get_endDate() {
		return this._endDate;
	}

	public void set_endDate(String _endDate) {
		this._endDate = _endDate;
	}

	public String get_projectFunds() {
		return this._projectFunds;
	}

	public void set_projectFunds(String _projectFunds) {
		this._projectFunds = _projectFunds;
	}

	public String get_isPublic() {
		return this._isPublic;
	}

	public void set_isPublic(String _isPublic) {
		this._isPublic = _isPublic;
	}

	public String get_projectState() {
		return this._projectState;
	}

	public void set_projectState(String _projectState) {
		this._projectState = _projectState;
	}

	public String get_projectIntroduction() {
		return this._projectIntroduction;
	}

	public void set_projectIntroduction(String _projectIntroduction) {
		this._projectIntroduction = _projectIntroduction;
	}

	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}

	public ProjectService getProjectSerivce() {
		return this.projectService;
	}

	public void setEnterpriseService(EnterpriseService enterpriseService) {
		this.entepriseService = enterpriseService;
	}

	public EnterpriseService getEnterpriseService() {
		return this.entepriseService;
	}

	public void setProjectStateService(ProjectStateService projectStateService) {
		this.projectStateService = projectStateService;
	}

	public ProjectStateService getProjectStateService() {
		return this.projectStateService;
	}

	public void setProjectTypeService(ProjectTypeService projectTypeService) {
		this.projectTypeService = projectTypeService;
	}

	public ProjectTypeService getProjectTypeService() {
		return this.projectTypeService;
	}

	public UserService getUserService() {
		return this.userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}
	
	public UploadImageFileImpl getUploadImageFile() {
		return uploadImageFile;
	}

	public void setUploadImageFile(UploadImageFileImpl uploadImageFile) {
		this.uploadImageFile = uploadImageFile;
	}

	public String execute() throws Exception {
	
		String userEmail = "";
		UserInfo userInfo = null;
		Enterprise enterprise = null;
		ProjectState projectState = null;
		ProjectType projectType = null;
		Map session = ActionContext.getContext().getSession();
		if (session.containsKey("useEmail")) {
			userEmail = (String) session.get("useEmail");
			userInfo = userService.findByEmail(userEmail);
		}
		enterprise = entepriseService.findByName(_projectEnterprise.trim());
		projectState = projectStateService.findByName(_projectState.trim());
		projectType = projectTypeService.findByName(_projectType.trim());
		ProjectInfo projectInfo = new ProjectInfo();

		projectInfo.setName(_projectName);
		projectInfo.setIntroduction(_projectIntroduction.trim());
		projectInfo.setEndDate(_endDate);
		projectInfo.setEnterpriseName(_projectEnterprise);
		projectInfo.setFunds(Double.parseDouble(_projectFunds));
		projectInfo.setUserInfo(userInfo);
		projectInfo.setMasterName(userInfo.getName().trim());
		projectInfo.setNumber(_projectNumber);
		projectInfo.setIsPublic(_isPublic);
		projectInfo.setStartDate(_startDate);
		projectInfo.setEnterprise(enterprise);
		projectInfo.setProjectState(projectState);
		projectInfo.setProjectType(projectType);
		

		// 文件上传部分
		_projectPicturePath = uploadImageFile.uploadFile(userInfo.getEmail(), "", file, this.getFileFileName(), 245, 143);
		projectInfo.setPicturePath(_projectPicturePath);
		projectService.save(projectInfo);
		return SUCCESS;
	}
}
