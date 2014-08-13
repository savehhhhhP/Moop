package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Discussion entity. @author MyEclipse Persistence Tools
 */

public class Discussion implements java.io.Serializable {

	// Fields

	private Integer id;
	private SubprojectInfo subprojectInfo;
	private UserInfo userInfo;
	private ProjectInfo projectInfo;
	private Integer subject;
	private String statement;
	private Integer postNumber;
	private Integer clickCount;
	private Set posts = new HashSet(0);

	// Constructors

	/** default constructor */
	public Discussion() {
	}

	/** minimal constructor */
	public Discussion(SubprojectInfo subprojectInfo, UserInfo userInfo,
			ProjectInfo projectInfo, Integer subject, String statement,
			Integer postNumber, Integer clickCount) {
		this.subprojectInfo = subprojectInfo;
		this.userInfo = userInfo;
		this.projectInfo = projectInfo;
		this.subject = subject;
		this.statement = statement;
		this.postNumber = postNumber;
		this.clickCount = clickCount;
	}

	/** full constructor */
	public Discussion(SubprojectInfo subprojectInfo, UserInfo userInfo,
			ProjectInfo projectInfo, Integer subject, String statement,
			Integer postNumber, Integer clickCount, Set posts) {
		this.subprojectInfo = subprojectInfo;
		this.userInfo = userInfo;
		this.projectInfo = projectInfo;
		this.subject = subject;
		this.statement = statement;
		this.postNumber = postNumber;
		this.clickCount = clickCount;
		this.posts = posts;
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

	public Integer getSubject() {
		return this.subject;
	}

	public void setSubject(Integer subject) {
		this.subject = subject;
	}

	public String getStatement() {
		return this.statement;
	}

	public void setStatement(String statement) {
		this.statement = statement;
	}

	public Integer getPostNumber() {
		return this.postNumber;
	}

	public void setPostNumber(Integer postNumber) {
		this.postNumber = postNumber;
	}

	public Integer getClickCount() {
		return this.clickCount;
	}

	public void setClickCount(Integer clickCount) {
		this.clickCount = clickCount;
	}

	public Set getPosts() {
		return this.posts;
	}

	public void setPosts(Set posts) {
		this.posts = posts;
	}

}