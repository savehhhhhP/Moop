package domain;

/**
 * ReProjectDocumentUser entity. @author MyEclipse Persistence Tools
 */

public class ReProjectDocumentUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private SubprojectInfo subprojectInfo;
	private Document document;
	private UserInfo userInfo;
	private ProjectInfo projectInfo;
	private Enterprise enterprise;
	private String documentName;
	private String authorName;
	private String enterpriseName;
	private String authorOrder;

	// Constructors

	/** default constructor */
	public ReProjectDocumentUser() {
	}

	/** full constructor */
	public ReProjectDocumentUser(SubprojectInfo subprojectInfo,
			Document document, UserInfo userInfo, ProjectInfo projectInfo,
			Enterprise enterprise, String documentName, String authorName,
			String enterpriseName, String authorOrder) {
		this.subprojectInfo = subprojectInfo;
		this.document = document;
		this.userInfo = userInfo;
		this.projectInfo = projectInfo;
		this.enterprise = enterprise;
		this.documentName = documentName;
		this.authorName = authorName;
		this.enterpriseName = enterpriseName;
		this.authorOrder = authorOrder;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public SubprojectInfo getSubprojectInfo() {
		return this.subprojectInfo;
	}

	public void setSubprojectInfo(SubprojectInfo subprojectInfo) {
		this.subprojectInfo = subprojectInfo;
	}

	public Document getDocument() {
		return this.document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public ProjectInfo getProjectInfo() {
		return this.projectInfo;
	}

	public void setProjectInfo(ProjectInfo projectInfo) {
		this.projectInfo = projectInfo;
	}

	public Enterprise getEnterprise() {
		return this.enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public String getDocumentName() {
		return this.documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

	public String getAuthorName() {
		return this.authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public String getAuthorOrder() {
		return this.authorOrder;
	}

	public void setAuthorOrder(String authorOrder) {
		this.authorOrder = authorOrder;
	}

}