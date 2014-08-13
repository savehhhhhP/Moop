package domain;

/**
 * ReEnterpriseUser entity. @author MyEclipse Persistence Tools
 */

public class ReEnterpriseUser implements java.io.Serializable {

	// Fields

	private Integer id;
	private UserInfo userInfo;
	private Enterprise enterprise;

	// Constructors

	/** default constructor */
	public ReEnterpriseUser() {
	}

	/** full constructor */
	public ReEnterpriseUser(UserInfo userInfo, Enterprise enterprise) {
		this.userInfo = userInfo;
		this.enterprise = enterprise;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
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

}