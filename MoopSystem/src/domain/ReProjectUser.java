package domain;

/**
 * ReProjectUser entity. @author MyEclipse Persistence Tools
 */

public class ReProjectUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private ProjectInfo projectInfo;
	private UserInfo userInfo;
	private Enterprise enterprise;
	private String userName;
	private String enterpriseName;

	// Constructors

	/** default constructor */
	public ReProjectUser() {
	}

	/** full constructor */
	public ReProjectUser(ProjectInfo projectInfo, UserInfo userInfo,
			Enterprise enterprise, String userName, String enterpriseName) {
		this.projectInfo = projectInfo;
		this.userInfo = userInfo;
		this.enterprise = enterprise;
		this.userName = userName;
		this.enterpriseName = enterpriseName;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public ProjectInfo getProjectInfo() {
		return this.projectInfo;
	}

	public void setProjectInfo(ProjectInfo projectInfo) {
		this.projectInfo = projectInfo;
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

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

}