package domain;

import java.util.Date;

/**
 * ReProjectSoftware entity. @author MyEclipse Persistence Tools
 */

public class ReProjectSoftware implements java.io.Serializable {

	// Fields

	private Integer id;
	private SubprojectInfo subprojectInfo;
	private SoftwareRight softwareRight;
	private ProjectInfo projectInfo;
	private Date applyDate;
	private String softwareName;

	// Constructors

	/** default constructor */
	public ReProjectSoftware() {
	}

	/** full constructor */
	public ReProjectSoftware(SubprojectInfo subprojectInfo,
			SoftwareRight softwareRight, ProjectInfo projectInfo,
			Date applyDate, String softwareName) {
		this.subprojectInfo = subprojectInfo;
		this.softwareRight = softwareRight;
		this.projectInfo = projectInfo;
		this.applyDate = applyDate;
		this.softwareName = softwareName;
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

	public SoftwareRight getSoftwareRight() {
		return this.softwareRight;
	}

	public void setSoftwareRight(SoftwareRight softwareRight) {
		this.softwareRight = softwareRight;
	}

	public ProjectInfo getProjectInfo() {
		return this.projectInfo;
	}

	public void setProjectInfo(ProjectInfo projectInfo) {
		this.projectInfo = projectInfo;
	}

	public Date getApplyDate() {
		return this.applyDate;
	}

	public void setApplyDate(Date applyDate) {
		this.applyDate = applyDate;
	}

	public String getSoftwareName() {
		return this.softwareName;
	}

	public void setSoftwareName(String softwareName) {
		this.softwareName = softwareName;
	}

}