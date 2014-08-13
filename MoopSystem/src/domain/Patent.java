package domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Patent entity. @author MyEclipse Persistence Tools
 */

public class Patent implements java.io.Serializable {

	// Fields

	private Integer id;
	private UserInfo userInfo;
	private String patentNum;
	private Date applyDate;
	private String author;
	private String keyWords;
	private String abstract_;
	private String organization;
	private Set reProjectPatentUsers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Patent() {
	}

	/** minimal constructor */
	public Patent(UserInfo userInfo, String patentNum, Date applyDate,
			String author, String keyWords, String abstract_,
			String organization) {
		this.userInfo = userInfo;
		this.patentNum = patentNum;
		this.applyDate = applyDate;
		this.author = author;
		this.keyWords = keyWords;
		this.abstract_ = abstract_;
		this.organization = organization;
	}

	/** full constructor */
	public Patent(UserInfo userInfo, String patentNum, Date applyDate,
			String author, String keyWords, String abstract_,
			String organization, Set reProjectPatentUsers) {
		this.userInfo = userInfo;
		this.patentNum = patentNum;
		this.applyDate = applyDate;
		this.author = author;
		this.keyWords = keyWords;
		this.abstract_ = abstract_;
		this.organization = organization;
		this.reProjectPatentUsers = reProjectPatentUsers;
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

	public String getPatentNum() {
		return this.patentNum;
	}

	public void setPatentNum(String patentNum) {
		this.patentNum = patentNum;
	}

	public Date getApplyDate() {
		return this.applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getKeyWords() {
		return this.keyWords;
	}

	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}

	public String getAbstract_() {
		return this.abstract_;
	}

	public void setAbstract_(String abstract_) {
		this.abstract_ = abstract_;
	}

	public String getOrganization() {
		return this.organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public Set getReProjectPatentUsers() {
		return this.reProjectPatentUsers;
	}

	public void setReProjectPatentUsers(Set reProjectPatentUsers) {
		this.reProjectPatentUsers = reProjectPatentUsers;
	}

}