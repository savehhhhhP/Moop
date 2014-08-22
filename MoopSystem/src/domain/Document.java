package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Document entity. @author MyEclipse Persistence Tools
 */

public class Document implements java.io.Serializable {

	// Fields

	private Integer id;
	private ProjectInfo projectInfo;
	private UserInfo userInfo;
	private String name;
	private String keyWords;
	private String abstractContent;
	private String author;
	private String documentPath;
	private Set reProjectDocuments = new HashSet(0);
	private Set reProjectDocumentUsers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Document() {
	}

	/** minimal constructor */
	public Document(ProjectInfo projectInfo, UserInfo userInfo, String name,
			String keyWords, String abstractContent, String author,
			String documentPath) {
		this.projectInfo = projectInfo;
		this.userInfo = userInfo;
		this.name = name;
		this.keyWords = keyWords;
		this.abstractContent = abstractContent;
		this.author = author;
		this.documentPath = documentPath;
	}

	/** full constructor */
	public Document(ProjectInfo projectInfo, UserInfo userInfo, String name,
			String keyWords, String abstractContent, String author,
			String documentPath, Set reProjectDocuments,
			Set reProjectDocumentUsers) {
		this.projectInfo = projectInfo;
		this.userInfo = userInfo;
		this.name = name;
		this.keyWords = keyWords;
		this.abstractContent = abstractContent;
		this.author = author;
		this.documentPath = documentPath;
		this.reProjectDocuments = reProjectDocuments;
		this.reProjectDocumentUsers = reProjectDocumentUsers;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDocumentPath() {
		return this.documentPath;
	}

	public void setDocumentPath(String documentPath) {
		this.documentPath = documentPath;
	}

	public Set getReProjectDocuments() {
		return this.reProjectDocuments;
	}

	public void setReProjectDocuments(Set reProjectDocuments) {
		this.reProjectDocuments = reProjectDocuments;
	}

	public Set getReProjectDocumentUsers() {
		return this.reProjectDocumentUsers;
	}

	public void setReProjectDocumentUsers(Set reProjectDocumentUsers) {
		this.reProjectDocumentUsers = reProjectDocumentUsers;
	}

}