package domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * SubprojectInfo entity. @author MyEclipse Persistence Tools
 */

public class SubprojectInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private UserInfo userInfo;
	private Integer projectId;
	private String name;
	private String number;
	private String masterName;
	private Integer enterpriseId;
	private String enterpriseName;
	private double funds;
	private Date startDate;
	private Date endDate;
	private Integer state;
	private Set reProjectDocuments = new HashSet(0);
	private Set reSubprojectUsers = new HashSet(0);
	private Set reProjectThesisUsers = new HashSet(0);
	private Set reProjectSoftwares = new HashSet(0);
	private Set reProjectSoftwareUsers = new HashSet(0);
	private Set reSubprojectEnterprises = new HashSet(0);
	private Set discussions = new HashSet(0);
	private Set reProjectPatents = new HashSet(0);
	private Set reProjectPatentUsers = new HashSet(0);
	private Set reProjectDocumentUsers = new HashSet(0);

	// Constructors

	/** default constructor */
	public SubprojectInfo() {
	}

	/** minimal constructor */
	public SubprojectInfo(UserInfo userInfo, Integer projectId, String name,
			String number, String masterName, Integer enterpriseId,
			String enterpriseName, double funds, Date startDate, Date endDate,
			Integer state) {
		this.userInfo = userInfo;
		this.projectId = projectId;
		this.name = name;
		this.number = number;
		this.masterName = masterName;
		this.enterpriseId = enterpriseId;
		this.enterpriseName = enterpriseName;
		this.funds = funds;
		this.startDate = startDate;
		this.endDate = endDate;
		this.state = state;
	}

	/** full constructor */
	public SubprojectInfo(UserInfo userInfo, Integer projectId, String name,
			String number, String masterName, Integer enterpriseId,
			String enterpriseName, double funds, Date startDate, Date endDate,
			Integer state, Set reProjectDocuments, Set reSubprojectUsers,
			Set reProjectThesisUsers, Set reProjectSoftwares,
			Set reProjectSoftwareUsers, Set reSubprojectEnterprises,
			Set discussions, Set reProjectPatents, Set reProjectPatentUsers,
			Set reProjectDocumentUsers) {
		this.userInfo = userInfo;
		this.projectId = projectId;
		this.name = name;
		this.number = number;
		this.masterName = masterName;
		this.enterpriseId = enterpriseId;
		this.enterpriseName = enterpriseName;
		this.funds = funds;
		this.startDate = startDate;
		this.endDate = endDate;
		this.state = state;
		this.reProjectDocuments = reProjectDocuments;
		this.reSubprojectUsers = reSubprojectUsers;
		this.reProjectThesisUsers = reProjectThesisUsers;
		this.reProjectSoftwares = reProjectSoftwares;
		this.reProjectSoftwareUsers = reProjectSoftwareUsers;
		this.reSubprojectEnterprises = reSubprojectEnterprises;
		this.discussions = discussions;
		this.reProjectPatents = reProjectPatents;
		this.reProjectPatentUsers = reProjectPatentUsers;
		this.reProjectDocumentUsers = reProjectDocumentUsers;
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

	public Integer getProjectId() {
		return this.projectId;
	}

	public void setProjectId(Integer projectId) {
		this.projectId = projectId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getMasterName() {
		return this.masterName;
	}

	public void setMasterName(String masterName) {
		this.masterName = masterName;
	}

	public Integer getEnterpriseId() {
		return this.enterpriseId;
	}

	public void setEnterpriseId(Integer enterpriseId) {
		this.enterpriseId = enterpriseId;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public double getFunds() {
		return this.funds;
	}

	public void setFunds(double funds) {
		this.funds = funds;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Integer getState() {
		return this.state;
	}

	public void setState(Integer state) {
		this.state = state;
	}

	public Set getReProjectDocuments() {
		return this.reProjectDocuments;
	}

	public void setReProjectDocuments(Set reProjectDocuments) {
		this.reProjectDocuments = reProjectDocuments;
	}

	public Set getReSubprojectUsers() {
		return this.reSubprojectUsers;
	}

	public void setReSubprojectUsers(Set reSubprojectUsers) {
		this.reSubprojectUsers = reSubprojectUsers;
	}

	public Set getReProjectThesisUsers() {
		return this.reProjectThesisUsers;
	}

	public void setReProjectThesisUsers(Set reProjectThesisUsers) {
		this.reProjectThesisUsers = reProjectThesisUsers;
	}

	public Set getReProjectSoftwares() {
		return this.reProjectSoftwares;
	}

	public void setReProjectSoftwares(Set reProjectSoftwares) {
		this.reProjectSoftwares = reProjectSoftwares;
	}

	public Set getReProjectSoftwareUsers() {
		return this.reProjectSoftwareUsers;
	}

	public void setReProjectSoftwareUsers(Set reProjectSoftwareUsers) {
		this.reProjectSoftwareUsers = reProjectSoftwareUsers;
	}

	public Set getReSubprojectEnterprises() {
		return this.reSubprojectEnterprises;
	}

	public void setReSubprojectEnterprises(Set reSubprojectEnterprises) {
		this.reSubprojectEnterprises = reSubprojectEnterprises;
	}

	public Set getDiscussions() {
		return this.discussions;
	}

	public void setDiscussions(Set discussions) {
		this.discussions = discussions;
	}

	public Set getReProjectPatents() {
		return this.reProjectPatents;
	}

	public void setReProjectPatents(Set reProjectPatents) {
		this.reProjectPatents = reProjectPatents;
	}

	public Set getReProjectPatentUsers() {
		return this.reProjectPatentUsers;
	}

	public void setReProjectPatentUsers(Set reProjectPatentUsers) {
		this.reProjectPatentUsers = reProjectPatentUsers;
	}

	public Set getReProjectDocumentUsers() {
		return this.reProjectDocumentUsers;
	}

	public void setReProjectDocumentUsers(Set reProjectDocumentUsers) {
		this.reProjectDocumentUsers = reProjectDocumentUsers;
	}

}