package domain;

/**
 * ReProjectThesisUser entity. @author MyEclipse Persistence Tools
 */

public class ReProjectThesisUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private Thesis thesis;
	private SubprojectInfo subprojectInfo;
	private UserInfo userInfo;
	private ProjectInfo projectInfo;
	private Enterprise enterprise;
	private String thesisTopic;
	private String authorName;
	private String enterpriseName;
	private String authorOrder;

	// Constructors

	/** default constructor */
	public ReProjectThesisUser() {
	}

	/** full constructor */
	public ReProjectThesisUser(Thesis thesis, SubprojectInfo subprojectInfo,
			UserInfo userInfo, ProjectInfo projectInfo, Enterprise enterprise,
			String thesisTopic, String authorName, String enterpriseName,
			String authorOrder) {
		this.thesis = thesis;
		this.subprojectInfo = subprojectInfo;
		this.userInfo = userInfo;
		this.projectInfo = projectInfo;
		this.enterprise = enterprise;
		this.thesisTopic = thesisTopic;
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

	public Thesis getThesis() {
		return this.thesis;
	}

	public void setThesis(Thesis thesis) {
		this.thesis = thesis;
	}

	public SubprojectInfo getSubprojectInfo() {
		return this.subprojectInfo;
	}

	public void setSubprojectInfo(SubprojectInfo subprojectInfo) {
		this.subprojectInfo = subprojectInfo;
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

	public String getThesisTopic() {
		return this.thesisTopic;
	}

	public void setThesisTopic(String thesisTopic) {
		this.thesisTopic = thesisTopic;
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