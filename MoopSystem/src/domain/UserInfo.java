package domain;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * UserInfo entity. @author MyEclipse Persistence Tools
 */

public class UserInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private UserCategory userCategory;
	private Nation nation;
	private Enterprise enterprise;
	private String name;
	private String email;
	private String password;
	private String number;
	private String phone;
	private String sex;
	private Date birth;
	private String degree;
	private String title;
	private Set reProjectDocumentUsers = new HashSet(0);
	private Set userExtendInfos = new HashSet(0);
	private Set subprojectInfos = new HashSet(0);
	private Set reSubprojectUsers = new HashSet(0);
	private Set softwareRights = new HashSet(0);
	private Set projectInfos = new HashSet(0);
	private Set reProjectThesisUsers = new HashSet(0);
	private Set reProjectUsers = new HashSet(0);
	private Set reProjectPatentUsers = new HashSet(0);
	private Set documents = new HashSet(0);
	private Set discussions = new HashSet(0);
	private Set reEnterpriseUsers = new HashSet(0);
	private Set thesises = new HashSet(0);
	private Set replies = new HashSet(0);
	private Set reProjectSoftwareUsers = new HashSet(0);
	private Set patents = new HashSet(0);
	private Set posts = new HashSet(0);

	// Constructors

	/** default constructor */
	public UserInfo() {
	}

	/** minimal constructor */
	public UserInfo(String name, String email, String password, Enterprise enterprise) {
		this.name = name;
		this.email = email;
		this.password = password;
		this.enterprise = enterprise;
	}

	/** full constructor */
	public UserInfo(UserCategory userCategory, Nation nation,
			Enterprise enterprise, String name, String email, String password,
			String number, String phone, String sex, Date birth, String degree,
			String title, Set reProjectDocumentUsers, Set userExtendInfos,
			Set subprojectInfos, Set reSubprojectUsers, Set softwareRights,
			Set projectInfos, Set reProjectThesisUsers, Set reProjectUsers,
			Set reProjectPatentUsers, Set documents, Set discussions,
			Set reEnterpriseUsers, Set thesises, Set replies,
			Set reProjectSoftwareUsers, Set patents, Set posts) {
		this.userCategory = userCategory;
		this.nation = nation;
		this.enterprise = enterprise;
		this.name = name;
		this.email = email;
		this.password = password;
		this.number = number;
		this.phone = phone;
		this.sex = sex;
		this.birth = birth;
		this.degree = degree;
		this.title = title;
		this.reProjectDocumentUsers = reProjectDocumentUsers;
		this.userExtendInfos = userExtendInfos;
		this.subprojectInfos = subprojectInfos;
		this.reSubprojectUsers = reSubprojectUsers;
		this.softwareRights = softwareRights;
		this.projectInfos = projectInfos;
		this.reProjectThesisUsers = reProjectThesisUsers;
		this.reProjectUsers = reProjectUsers;
		this.reProjectPatentUsers = reProjectPatentUsers;
		this.documents = documents;
		this.discussions = discussions;
		this.reEnterpriseUsers = reEnterpriseUsers;
		this.thesises = thesises;
		this.replies = replies;
		this.reProjectSoftwareUsers = reProjectSoftwareUsers;
		this.patents = patents;
		this.posts = posts;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public UserCategory getUserCategory() {
		return this.userCategory;
	}

	public void setUserCategory(UserCategory userCategory) {
		this.userCategory = userCategory;
	}

	public Nation getNation() {
		return this.nation;
	}

	public void setNation(Nation nation) {
		this.nation = nation;
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

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getNumber() {
		return this.number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getSex() {
		return this.sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirth() {
		return this.birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getDegree() {
		return this.degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Set getReProjectDocumentUsers() {
		return this.reProjectDocumentUsers;
	}

	public void setReProjectDocumentUsers(Set reProjectDocumentUsers) {
		this.reProjectDocumentUsers = reProjectDocumentUsers;
	}

	public Set getUserExtendInfos() {
		return this.userExtendInfos;
	}

	public void setUserExtendInfos(Set userExtendInfos) {
		this.userExtendInfos = userExtendInfos;
	}

	public Set getSubprojectInfos() {
		return this.subprojectInfos;
	}

	public void setSubprojectInfos(Set subprojectInfos) {
		this.subprojectInfos = subprojectInfos;
	}

	public Set getReSubprojectUsers() {
		return this.reSubprojectUsers;
	}

	public void setReSubprojectUsers(Set reSubprojectUsers) {
		this.reSubprojectUsers = reSubprojectUsers;
	}

	public Set getSoftwareRights() {
		return this.softwareRights;
	}

	public void setSoftwareRights(Set softwareRights) {
		this.softwareRights = softwareRights;
	}

	public Set getProjectInfos() {
		return this.projectInfos;
	}

	public void setProjectInfos(Set projectInfos) {
		this.projectInfos = projectInfos;
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

	public Set getReProjectPatentUsers() {
		return this.reProjectPatentUsers;
	}

	public void setReProjectPatentUsers(Set reProjectPatentUsers) {
		this.reProjectPatentUsers = reProjectPatentUsers;
	}

	public Set getDocuments() {
		return this.documents;
	}

	public void setDocuments(Set documents) {
		this.documents = documents;
	}

	public Set getDiscussions() {
		return this.discussions;
	}

	public void setDiscussions(Set discussions) {
		this.discussions = discussions;
	}

	public Set getReEnterpriseUsers() {
		return this.reEnterpriseUsers;
	}

	public void setReEnterpriseUsers(Set reEnterpriseUsers) {
		this.reEnterpriseUsers = reEnterpriseUsers;
	}

	public Set getThesises() {
		return this.thesises;
	}

	public void setThesises(Set thesises) {
		this.thesises = thesises;
	}

	public Set getReplies() {
		return this.replies;
	}

	public void setReplies(Set replies) {
		this.replies = replies;
	}

	public Set getReProjectSoftwareUsers() {
		return this.reProjectSoftwareUsers;
	}

	public void setReProjectSoftwareUsers(Set reProjectSoftwareUsers) {
		this.reProjectSoftwareUsers = reProjectSoftwareUsers;
	}

	public Set getPatents() {
		return this.patents;
	}

	public void setPatents(Set patents) {
		this.patents = patents;
	}

	public Set getPosts() {
		return this.posts;
	}

	public void setPosts(Set posts) {
		this.posts = posts;
	}

}