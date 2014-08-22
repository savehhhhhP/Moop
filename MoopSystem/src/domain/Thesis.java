package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Thesis entity. @author MyEclipse Persistence Tools
 */

public class Thesis implements java.io.Serializable {

	// Fields

	private Integer id;
	private ProjectInfo projectInfo;
	private UserInfo userInfo;
	private String author;
	private String topic;
	private String organization;
	private String publishDate;
	private Integer pagination;
	private String abstractContent;
	private String keyWords;
	private String thesisPath;
	private Set reProjectThesises = new HashSet(0);
	private Set reProjectThesisUsers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Thesis() {
	}

	/** minimal constructor */
	public Thesis(ProjectInfo projectInfo, UserInfo userInfo, String author,
			String topic, String organization, String publishDate,
			Integer pagination, String abstractContent, String keyWords,
			String thesisPath) {
		this.projectInfo = projectInfo;
		this.userInfo = userInfo;
		this.author = author;
		this.topic = topic;
		this.organization = organization;
		this.publishDate = publishDate;
		this.pagination = pagination;
		this.abstractContent = abstractContent;
		this.keyWords = keyWords;
		this.thesisPath = thesisPath;
	}

	/** full constructor */
	public Thesis(ProjectInfo projectInfo, UserInfo userInfo, String author,
			String topic, String organization, String publishDate,
			Integer pagination, String abstractContent, String keyWords,
			String thesisPath, Set reProjectThesises, Set reProjectThesisUsers) {
		this.projectInfo = projectInfo;
		this.userInfo = userInfo;
		this.author = author;
		this.topic = topic;
		this.organization = organization;
		this.publishDate = publishDate;
		this.pagination = pagination;
		this.abstractContent = abstractContent;
		this.keyWords = keyWords;
		this.thesisPath = thesisPath;
		this.reProjectThesises = reProjectThesises;
		this.reProjectThesisUsers = reProjectThesisUsers;
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

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public String getOrganization() {
		return this.organization;
	}

	public void setOrganization(String organization) {
		this.organization = organization;
	}

	public String getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}

	public Integer getPagination() {
		return this.pagination;
	}

	public void setPagination(Integer pagination) {
		this.pagination = pagination;
	}

	public String getAbstractContent() {
		return this.abstractContent;
	}

	public void setAbstractContent(String abstractContent) {
		this.abstractContent = abstractContent;
	}

	public String getKeyWords() {
		return this.keyWords;
	}

	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}

	public String getThesisPath() {
		return this.thesisPath;
	}

	public void setThesisPath(String thesisPath) {
		this.thesisPath = thesisPath;
	}

	public Set getReProjectThesises() {
		return this.reProjectThesises;
	}

	public void setReProjectThesises(Set reProjectThesises) {
		this.reProjectThesises = reProjectThesises;
	}

	public Set getReProjectThesisUsers() {
		return this.reProjectThesisUsers;
	}

	public void setReProjectThesisUsers(Set reProjectThesisUsers) {
		this.reProjectThesisUsers = reProjectThesisUsers;
	}

}