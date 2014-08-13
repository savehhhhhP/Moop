package domain;

/**
 * UserExtendInfo entity. @author MyEclipse Persistence Tools
 */

public class UserExtendInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private UserInfo userInfo;
	private String cardNum;
	private String skill;
	private String remark;

	// Constructors

	/** default constructor */
	public UserExtendInfo() {
	}

	/** minimal constructor */
	public UserExtendInfo(UserInfo userInfo, String cardNum) {
		this.userInfo = userInfo;
		this.cardNum = cardNum;
	}

	/** full constructor */
	public UserExtendInfo(UserInfo userInfo, String cardNum, String skill,
			String remark) {
		this.userInfo = userInfo;
		this.cardNum = cardNum;
		this.skill = skill;
		this.remark = remark;
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

	public String getCardNum() {
		return this.cardNum;
	}

	public void setCardNum(String cardNum) {
		this.cardNum = cardNum;
	}

	public String getSkill() {
		return this.skill;
	}

	public void setSkill(String skill) {
		this.skill = skill;
	}

	public String getRemark() {
		return this.remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

}