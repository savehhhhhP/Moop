package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Patent entity. @author MyEclipse Persistence Tools
 */

public class Patent implements java.io.Serializable {

	// Fields

	private Integer id;
	private ProjectInfo projectInfo;
	private UserInfo userInfo;
	private String patentNum;
	private String applyDate;
	private String author;
	private String keyWords;
	private String abstractContent;
	private String organization;
	private String name;
	private String patentPath;
	private Set reProjectPatentUsers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Patent() {
	}

	/** minimal constructor */
	public Patent(ProjectInfo projectInfo, UserInfo userInfo, String patentNum,
			String applyDate, String author, String keyWords,
			String abstractContent, String organization, String name,
			String patentPath) {
		this.projectInfo = projectInfo;
		this.userInfo = userInfo;
		this.patentNum = patentNum;
		this.applyDate = applyDate;
		this.author = author;
		this.keyWords = keyWords;
		this.abstractContent = abstractContent;
		this.organization = organization;
		this.name = name;
		this.patentPath = patentPath;
	}
	
	public Patent(Integer id, ProjectInfo projectInfo, UserInfo userInfo, String patentNum,
			String applyDate, String author, String keyWords,
			String abstractContent, String organization, String name,
			String patentPath) {
		this.id = id;
		this.projectInfo = projectInfo;
		this.userInfo = userInfo;
		this.patentNum = patentNum;
		this.applyDate = applyDate;
		this.author = author;
		this.keyWords = keyWords;
		this.abstractContent = abstractContent;
		this.organization = organization;
		this.name = name;
		this.patentPath = patentPath;
	}

	/** full constructor */
	public Patent(ProjectInfo projectInfo, UserInfo userInfo, String patentNum,
			String applyDate, String author, String keyWords,
			String abstractContent, String organization, String name,
			String patentPath, Set reProjectPatentUsers) {
		this.projectInfo = projectInfo;
		this.userInfo = userInfo;
		this.patentNum = patentNum;
		this.applyDate = applyDate;
		this.author = author;
		this.keyWords = keyWords;
		this.abstractContent = abstractContent;
		this.organization = organization;
		this.name = name;
		this.patentPath = patentPath;
		this.reProjectPatentUsers = reProjectPatentUsers;
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

	public String getPatentNum() {
		return this.patentNum;
	}

	public void setPatentNum(String patentNum) {
		this.patentNum = patentNum;
	}

	public String getApplyDate() {
		return this.applyDate;
	}

	public void setApplyDate(String applyDate) {
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

	public String getAbstractContent() {
		return this.abstractContent;
	}

	public void setAbstractContent(String abstractContent) {
		this.abstractContent = abstractContent;
	}

	public String getOrganization() {
		return this.organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatentPath() {
		return this.patentPath;
	}

	public void setPatentPath(String patentPath) {
		this.patentPath = patentPath;
	}

	public Set getReProjectPatentUsers() {
		return this.reProjectPatentUsers;
	}

	public void setReProjectPatentUsers(Set reProjectPatentUsers) {
		this.reProjectPatentUsers = reProjectPatentUsers;
	}

}