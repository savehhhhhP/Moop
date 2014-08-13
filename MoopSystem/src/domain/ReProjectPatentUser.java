package domain;

/**
 * ReProjectPatentUser entity. @author MyEclipse Persistence Tools
 */

public class ReProjectPatentUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private SubprojectInfo subprojectInfo;
	private UserInfo userInfo;
	private ProjectInfo projectInfo;
	private Patent patent;
	private Enterprise enterprise;
	private String patentNumber;
	private String authorName;
	private String enterpriseName;
	private String authorOrder;

	// Constructors

	/** default constructor */
	public ReProjectPatentUser() {
	}

	/** full constructor */
	public ReProjectPatentUser(SubprojectInfo subprojectInfo,
			UserInfo userInfo, ProjectInfo projectInfo, Patent patent,
			Enterprise enterprise, String patentNumber, String authorName,
			String enterpriseName, String authorOrder) {
		this.subprojectInfo = subprojectInfo;
		this.userInfo = userInfo;
		this.projectInfo = projectInfo;
		this.patent = patent;
		this.enterprise = enterprise;
		this.patentNumber = patentNumber;
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

	public Patent getPatent() {
		return this.patent;
	}

	public void setPatent(Patent patent) {
		this.patent = patent;
	}

	public Enterprise getEnterprise() {
		return this.enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public String getPatentNumber() {
		return this.patentNumber;
	}

	public void setPatentNumber(String patentNumber) {
		this.patentNumber = patentNumber;
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