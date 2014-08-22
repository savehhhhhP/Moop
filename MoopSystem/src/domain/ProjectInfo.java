package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * ProjectInfo entity. @author MyEclipse Persistence Tools
 */

public class ProjectInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private UserInfo userInfo;
	private ProjectType projectType;
	private ProjectState projectState;
	private Enterprise enterprise;
	private String name;
	private String number;
	private String masterName;
	private String enterpriseName;
	private double funds;
	private String startDate;
	private String endDate;
	private String isPublic;
	private String introduction;
	private String picturePath;
	private Set reSubprojectUsers = new HashSet(0);
	private Set documents = new HashSet(0);
	private Set reProjectThesisUsers = new HashSet(0);
	private Set reProjectUsers = new HashSet(0);
	private Set reProjectThesises = new HashSet(0);
	private Set reProjectDocuments = new HashSet(0);
	private Set reProjectEnterprises = new HashSet(0);
	private Set reProjectPatents = new HashSet(0);
	private Set reProjectSoftwares = new HashSet(0);
	private Set reSubprojectEnterprises = new HashSet(0);
	private Set thesises = new HashSet(0);
	private Set patents = new HashSet(0);
	private Set discussions = new HashSet(0);
	private Set projectExtendInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public ProjectInfo() {
	}

	/** minimal constructor */
	public ProjectInfo(UserInfo userInfo, Enterprise enterprise, String name,
			String masterName, String enterpriseName) {
		this.userInfo = userInfo;
		this.enterprise = enterprise;
		this.name = name;
		this.masterName = masterName;
		this.enterpriseName = enterpriseName;
	}
	
	
	/** minimal constructor */
	public ProjectInfo(Integer id, String name, String introduction, String picturePath) {
		this.id = id;
		this.name = name;
		this.introduction = introduction;
		this.picturePath = picturePath;
	}
	public ProjectInfo(String name, String number, ProjectType projectType,
			Enterprise enterprise, String startDate, String endDate,double funds, String isPublic,
			ProjectState projectState, String introduction) {
		this.projectType = projectType;
		this.projectState = projectState;
		this.enterprise = enterprise;
		this.name = name;
		this.number = number;
		this.funds = funds;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isPublic = isPublic;
		this.introduction = introduction;
	}
	
	
	/** minimal constructor */
	public ProjectInfo(String name, String introduction, String picturePath) {
		this.name = name;
		this.introduction = introduction;
		this.picturePath = picturePath;
	}
	

	/** full constructor */
	public ProjectInfo(UserInfo userInfo, ProjectType projectType,
			ProjectState projectState, Enterprise enterprise, String name,
			String number, String masterName, String enterpriseName,
			double funds, String startDate, String endDate, String isPublic,
			String introduction, String picturePath, Set reSubprojectUsers,
			Set documents, Set reProjectThesisUsers, Set reProjectUsers,
			Set reProjectThesises, Set reProjectDocuments,
			Set reProjectEnterprises, Set reProjectPatents,
			Set reProjectSoftwares, Set reSubprojectEnterprises, Set thesises,
			Set patents, Set discussions, Set projectExtendInfos) {
		this.userInfo = userInfo;
		this.projectType = projectType;
		this.projectState = projectState;
		this.enterprise = enterprise;
		this.name = name;
		this.number = number;
		this.masterName = masterName;
		this.enterpriseName = enterpriseName;
		this.funds = funds;
		this.startDate = startDate;
		this.endDate = endDate;
		this.isPublic = isPublic;
		this.introduction = introduction;
		this.picturePath = picturePath;
		this.reSubprojectUsers = reSubprojectUsers;
		this.documents = documents;
		this.reProjectThesisUsers = reProjectThesisUsers;
		this.reProjectUsers = reProjectUsers;
		this.reProjectThesises = reProjectThesises;
		this.reProjectDocuments = reProjectDocuments;
		this.reProjectEnterprises = reProjectEnterprises;
		this.reProjectPatents = reProjectPatents;
		this.reProjectSoftwares = reProjectSoftwares;
		this.reSubprojectEnterprises = reSubprojectEnterprises;
		this.thesises = thesises;
		this.patents = patents;
		this.discussions = discussions;
		this.projectExtendInfos = projectExtendInfos;
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

	public ProjectType getProjectType() {
		return this.projectType;
	}

	public void setProjectType(ProjectType projectType) {
		this.projectType = projectType;
	}

	public ProjectState getProjectState() {
		return this.projectState;
	}

	public void setProjectState(ProjectState projectState) {
		this.projectState = projectState;
	}

	public Enterprise getEnterprise() {
		return this.enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
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

	public String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return this.endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public String getIsPublic() {
		return this.isPublic;
	}

	public void setIsPublic(String isPublic) {
		this.isPublic = isPublic;
	}

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getPicturePath() {
		return this.picturePath;
	}

	public void setPicturePath(String picturePath) {
		this.picturePath = picturePath;
	}

	public Set getReSubprojectUsers() {
		return this.reSubprojectUsers;
	}

	public void setReSubprojectUsers(Set reSubprojectUsers) {
		this.reSubprojectUsers = reSubprojectUsers;
	}

	public Set getDocuments() {
		return this.documents;
	}

	public void setDocuments(Set documents) {
		this.documents = documents;
	}

	public Set getReProjectThesisUsers() {
		return this.reProjectThesisUsers;
	}

	public void setReProjectThesisUsers(Set reProjectThesisUsers) {
		this.reProjectThesisUsers = reProjectThesisUsers;
	}

	public Set getReProjectUsers() {
		return this.reProjectUsers;
	}

	public void setReProjectUsers(Set reProjectUsers) {
		this.reProjectUsers = reProjectUsers;
	}

	public Set getReProjectThesises() {
		return this.reProjectThesises;
	}

	public void setReProjectThesises(Set reProjectThesises) {
		this.reProjectThesises = reProjectThesises;
	}

	public Set getReProjectDocuments() {
		return this.reProjectDocuments;
	}

	public void setReProjectDocuments(Set reProjectDocuments) {
		this.reProjectDocuments = reProjectDocuments;
	}

	public Set getReProjectEnterprises() {
		return this.reProjectEnterprises;
	}

	public void setReProjectEnterprises(Set reProjectEnterprises) {
		this.reProjectEnterprises = reProjectEnterprises;
	}

	public Set getReProjectPatents() {
		return this.reProjectPatents;
	}

	public void setReProjectPatents(Set reProjectPatents) {
		this.reProjectPatents = reProjectPatents;
	}

	public Set getReProjectSoftwares() {
		return this.reProjectSoftwares;
	}

	public void setReProjectSoftwares(Set reProjectSoftwares) {
		this.reProjectSoftwares = reProjectSoftwares;
	}

	public Set getReSubprojectEnterprises() {
		return this.reSubprojectEnterprises;
	}

	public void setReSubprojectEnterprises(Set reSubprojectEnterprises) {
		this.reSubprojectEnterprises = reSubprojectEnterprises;
	}

	public Set getThesises() {
		return this.thesises;
	}

	public void setThesises(Set thesises) {
		this.thesises = thesises;
	}

	public Set getPatents() {
		return this.patents;
	}

	public void setPatents(Set patents) {
		this.patents = patents;
	}

	public Set getDiscussions() {
		return this.discussions;
	}

	public void setDiscussions(Set discussions) {
		this.discussions = discussions;
	}

	public Set getProjectExtendInfos() {
		return this.projectExtendInfos;
	}

	public void setProjectExtendInfos(Set projectExtendInfos) {
		this.projectExtendInfos = projectExtendInfos;
	}

}