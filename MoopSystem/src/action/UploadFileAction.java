package action;

import java.io.File;
import java.util.Date;
import java.util.Map;
import java.util.Set;

import service.DocumentService;
import service.PatentService;
import service.ProjectService;
import service.ThesisService;
import service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Document;
import domain.Patent;
import domain.ProjectInfo;
import domain.Thesis;
import domain.UserInfo;
import function.UploadOtherFileImpl;

public class UploadFileAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private PatentService patentService;
	private UserService userService;
	private ProjectService projectService;
	private ThesisService thesisService;
	private DocumentService documentService;
	
	private String projectId;
	private String fileType;
	private String fileKeyWords;
	private String fileDescription;
	private String filePath;
	private String fileAuthor;

	private String patentNum;
	private String patentOrg;
	private String patentDate;

	private String thesisDate;
	private String thesisOrg;
	private String thesisPagination;

	private File file;
	private String fileFileName;
	private String fileContentType;
	private UploadOtherFileImpl uploadOtherFile;

	public UploadOtherFileImpl getUploadOtherFile() {
		return uploadOtherFile;
	}

	public void setUploadOtherFile(UploadOtherFileImpl uploadOtherFile) {
		this.uploadOtherFile = uploadOtherFile;
	}
	
	public DocumentService getDocumentService() {
		return documentService;
	}

	public void setDocumentService(DocumentService documentService) {
		this.documentService = documentService;
	}

	public ThesisService getThesisService() {
		return thesisService;
	}

	public void setThesisService(ThesisService thesisService) {
		this.thesisService = thesisService;
	}

	public ProjectService getProjectService() {
		return projectService;
	}

	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}

	public PatentService getPatentService() {
		return patentService;
	}

	public void setPatentService(PatentService patentService) {
		this.patentService = patentService;
	}

	public UserService getUserService() {
		return userService;
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

	public String getFileFileName() {
		return fileFileName;
	}

	public void setFileFileName(String fileFileName) {
		this.fileFileName = fileFileName;
	}

	public String getFileContentType() {
		return fileContentType;
	}

	public void setFileContentType(String fileContentType) {
		this.fileContentType = fileContentType;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}


	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public String getFileKeyWords() {
		return fileKeyWords;
	}

	public void setFileKeyWords(String fileKeyWords) {
		this.fileKeyWords = fileKeyWords;
	}

	public String getFileDescription() {
		return fileDescription;
	}

	public void setFileDescription(String fileDescription) {
		this.fileDescription = fileDescription;
	}

	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	public String getPatentNum() {
		return patentNum;
	}

	public void setPatentNum(String patentNum) {
		this.patentNum = patentNum;
	}

	public String getPatentOrg() {
		return patentOrg;
	}

	public void setPatentOrg(String patentOrg) {
		this.patentOrg = patentOrg;
	}

	public String getPatentDate() {
		return patentDate;
	}

	public void setPatentDate(String patentDate) {
		this.patentDate = patentDate;
	}

	public String getThesisDate() {
		return thesisDate;
	}

	public void setThesisDate(String thesisDate) {
		this.thesisDate = thesisDate;
	}

	public String getThesisOrg() {
		return thesisOrg;
	}

	public void setThesisOrg(String thesisOrg) {
		this.thesisOrg = thesisOrg;
	}

	public String getThesisPagination() {
		return thesisPagination;
	}

	public void setThesisPagination(String thesisPagination) {
		this.thesisPagination = thesisPagination;
	}

	public String getFileAuthor() {
		return fileAuthor;
	}

	public void setFileAuthor(String fileAuthor) {
		this.fileAuthor = fileAuthor;
	}

	public String execute() {
		String userEmail = "";
		UserInfo userInfo = null;
		ProjectInfo projectInfo = null;
		Patent patent = null;
		Thesis thesis = null;
		Document document = null;
		Map session = ActionContext.getContext().getSession();
		if (session.containsKey("userEmail")) {
			userEmail = session.get("userEmail").toString();
			userInfo = userService.findByEmail(userEmail);
		}
		projectInfo = projectService.selectProject(Integer.parseInt(projectId));
		filePath = uploadOtherFile.uploadFile(userInfo.getEmail(),
				projectId, file, this.getFileFileName(), 0, 0);
		
		if (fileType.equals("patent")) {
			patent = new Patent(projectInfo, userInfo, patentNum, patentDate,
					fileAuthor, fileKeyWords, fileDescription, patentOrg,
					this.getFileFileName(), filePath);
			patentService.save(patent);
			return null;
		}else if(fileType.equals("thesis")){
			thesis = new Thesis(projectInfo, userInfo, fileAuthor,
					this.getFileFileName(), thesisOrg, thesisDate,
					Integer.parseInt(thesisPagination), fileDescription, fileKeyWords,
					filePath);
			thesisService.save(thesis);
			return null;
		}
		else if(fileType.equals("document")){
			document = new Document(projectInfo, userInfo, this.getFileFileName(),
					fileKeyWords, fileDescription, fileAuthor,
					filePath);
			documentService.save(document);
			return null;
		}
		return null;
	}

}
