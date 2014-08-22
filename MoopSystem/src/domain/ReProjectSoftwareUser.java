package domain;

/**
 * ReProjectSoftwareUser entity. @author MyEclipse Persistence Tools
 */

public class ReProjectSoftwareUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private SubprojectInfo subprojectInfo;
	private SoftwareRight softwareRight;
	private UserInfo userInfo;
	private Enterprise enterprise;
	private Integer projectId;
	private String softwareName;
	private String authorName;
	private String enterpriseName;
	private String authorOrder;

	// Constructors

	/** default constructor */
	public ReProjectSoftwareUser() {
	}

	/** full constructor */
	public ReProjectSoftwareUser(SubprojectInfo subprojectInfo,
			SoftwareRight softwareRight, UserInfo userInfo,
			Enterprise enterprise, Integer projectId, String softwareName,
			String authorName, String enterpriseName, String authorOrder) {
		this.subprojectInfo = subprojectInfo;
		this.softwareRight = softwareRight;
		this.userInfo = userInfo;
		this.enterprise = enterprise;
		this.projectId = projectId;
		this.softwareName = softwareName;
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

	public SoftwareRight getSoftwareRight() {
		return this.softwareRight;
	}

	public void setSoftwareRight(SoftwareRight softwareRight) {
		this.softwareRight = softwareRight;
	}

	public UserInfo getUserInfo() {
		return this.userInfo;
	}

	public void setUserInfo(UserInfo userInfo) {
		this.userInfo = userInfo;
	}

	public Enterprise getEnterprise() {
		return this.enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getSoftwareName() {
		return this.softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
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