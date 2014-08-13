package domain;

import java.util.Date;

/**
 * ReProjectThesis entity. @author MyEclipse Persistence Tools
 */

public class ReProjectThesis implements java.io.Serializable {

	// Fields

	private Integer id;
	private Thesis thesis;
	private ProjectInfo projectInfo;
	private String authorList;
	private String topic;
	private Date publishDate;
	private String publishOrganization;
	private Integer pagination;

	// Constructors

	/** default constructor */
	public ReProjectThesis() {
	}

	/** full constructor */
	public ReProjectThesis(Thesis thesis, ProjectInfo projectInfo,
			String authorList, String topic, Date publishDate,
			String publishOrganization, Integer pagination) {
		this.thesis = thesis;
		this.projectInfo = projectInfo;
		this.authorList = authorList;
		this.topic = topic;
		this.publishDate = publishDate;
		this.publishOrganization = publishOrganization;
		this.pagination = pagination;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Thesis getThesis() {
		return this.thesis;
	}

	public void setThesis(Thesis thesis) {
		this.thesis = thesis;
	}

	public ProjectInfo getProjectInfo() {
		return this.projectInfo;
	}

	public void setProjectInfo(ProjectInfo projectInfo) {
		this.projectInfo = projectInfo;
	}

	public String getAuthorList() {
		return this.authorList;
	}

	public void setAuthorList(String authorList) {
		this.authorList = authorList;
	}

	public String getTopic() {
		return this.topic;
	}

	public void setTopic(String topic) {
		this.topic = topic;
	}

	public Date getPublishDate() {
		return this.publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getPublishOrganization() {
		return this.publishOrganization;
	}

	public void setPublishOrganization(String publishOrganization) {
		this.publishOrganization = publishOrganization;
	}

	public Integer getPagination() {
		return this.pagination;
	}

	public void setPagination(Integer pagination) {
		this.pagination = pagination;
	}

}