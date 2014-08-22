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
	private Set reEnterpriseUsers = new HashSet(0);
	private Set projectInfos = new HashSet(0);

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
			Set reEnterpriseUsers, Set projectInfos) {
		this.enterpriseName = enterpriseName;
		this.reProjectSoftwareUsers = reProjectSoftwareUsers;
		this.reProjectEnterprises = reProjectEnterprises;
		this.reProjectPatentUsers = reProjectPatentUsers;
		this.reProjectUsers = reProjectUsers;
		this.reSubprojectEnterprises = reSubprojectEnterprises;
		this.userInfos = userInfos;
		this.reEnterpriseUsers = reEnterpriseUsers;
		this.projectInfos = projectInfos;
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

	public Set getReEnterpriseUsers() {
		return this.reEnterpriseUsers;
	}

	public void setReEnterpriseUsers(Set reEnterpriseUsers) {
		this.reEnterpriseUsers = reEnterpriseUsers;
	}

	public Set getProjectInfos() {
		return this.projectInfos;
	}

	public void setProjectInfos(Set projectInfos) {
		this.projectInfos = projectInfos;
	}

}