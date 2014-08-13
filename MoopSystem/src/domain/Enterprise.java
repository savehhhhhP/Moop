package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Enterprise entity. @author MyEclipse Persistence Tools
 */

public class Enterprise implements java.io.Serializable {

	// Fields

	private Integer id;
	private String enterpriseName;
	private Set reProjectSoftwareUsers = new HashSet(0);
	private Set reProjectEnterprises = new HashSet(0);
	private Set reProjectPatentUsers = new HashSet(0);
	private Set reProjectUsers = new HashSet(0);
	private Set reSubprojectEnterprises = new HashSet(0);
	private Set userInfos = new HashSet(0);
	private Set reProjectThesisUsers = new HashSet(0);
	private Set reEnterpriseUsers = new HashSet(0);
	private Set subprojectInfos = new HashSet(0);
	private Set projectInfos = new HashSet(0);
	private Set reProjectDocumentUsers = new HashSet(0);

	// Constructors

	/** default constructor */
	public Enterprise() {
	}

	/** minimal constructor */
	public Enterprise(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	/** full constructor */
	public Enterprise(String enterpriseName, Set reProjectSoftwareUsers,
			Set reProjectEnterprises, Set reProjectPatentUsers,
			Set reProjectUsers, Set reSubprojectEnterprises, Set userInfos,
			Set reProjectThesisUsers, Set reEnterpriseUsers,
			Set subprojectInfos, Set projectInfos, Set reProjectDocumentUsers) {
		this.enterpriseName = enterpriseName;
		this.reProjectSoftwareUsers = reProjectSoftwareUsers;
		this.reProjectEnterprises = reProjectEnterprises;
		this.reProjectPatentUsers = reProjectPatentUsers;
		this.reProjectUsers = reProjectUsers;
		this.reSubprojectEnterprises = reSubprojectEnterprises;
		this.userInfos = userInfos;
		this.reProjectThesisUsers = reProjectThesisUsers;
		this.reEnterpriseUsers = reEnterpriseUsers;
		this.subprojectInfos = subprojectInfos;
		this.projectInfos = projectInfos;
		this.reProjectDocumentUsers = reProjectDocumentUsers;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public Set getReProjectSoftwareUsers() {
		return this.reProjectSoftwareUsers;
	}

	public void setReProjectSoftwareUsers(Set reProjectSoftwareUsers) {
		this.reProjectSoftwareUsers = reProjectSoftwareUsers;
	}

	public Set getReProjectEnterprises() {
		return this.reProjectEnterprises;
	}

	public void setReProjectEnterprises(Set reProjectEnterprises) {
		this.reProjectEnterprises = reProjectEnterprises;
	}

	public Set getReProjectPatentUsers() {
		return this.reProjectPatentUsers;
	}

	public void setReProjectPatentUsers(Set reProjectPatentUsers) {
		this.reProjectPatentUsers = reProjectPatentUsers;
	}

	public Set getReProjectUsers() {
		return this.reProjectUsers;
	}

	public void setReProjectUsers(Set reProjectUsers) {
		this.reProjectUsers = reProjectUsers;
	}

	public Set getReSubprojectEnterprises() {
		return this.reSubprojectEnterprises;
	}

	public void setReSubprojectEnterprises(Set reSubprojectEnterprises) {
		this.reSubprojectEnterprises = reSubprojectEnterprises;
	}

	public Set getUserInfos() {
		return this.userInfos;
	}

	public void setUserInfos(Set userInfos) {
		this.userInfos = userInfos;
	}

	public Set getReProjectThesisUsers() {
		return this.reProjectThesisUsers;
	}

	public void setReProjectThesisUsers(Set reProjectThesisUsers) {
		this.reProjectThesisUsers = reProjectThesisUsers;
	}

	public Set getReEnterpriseUsers() {
		return this.reEnterpriseUsers;
	}

	public void setReEnterpriseUsers(Set reEnterpriseUsers) {
		this.reEnterpriseUsers = reEnterpriseUsers;
	}

	public Set getSubprojectInfos() {
		return this.subprojectInfos;
	}

	public void setSubprojectInfos(Set subprojectInfos) {
		this.subprojectInfos = subprojectInfos;
	}

	public Set getProjectInfos() {
		return this.projectInfos;
	}

	public void setProjectInfos(Set projectInfos) {
		this.projectInfos = projectInfos;
	}

	public Set getReProjectDocumentUsers() {
		return this.reProjectDocumentUsers;
	}

	public void setReProjectDocumentUsers(Set reProjectDocumentUsers) {
		this.reProjectDocumentUsers = reProjectDocumentUsers;
	}

}