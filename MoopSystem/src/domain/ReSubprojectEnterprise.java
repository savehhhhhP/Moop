package domain;

/**
 * ReSubprojectEnterprise entity. @author MyEclipse Persistence Tools
 */

public class ReSubprojectEnterprise implements java.io.Serializable {

	// Fields

	private Integer id;
	private SubprojectInfo subprojectInfo;
	private ProjectInfo projectInfo;
	private Enterprise enterprise;
	private String enterpriseName;
	private Integer isSupport;

	// Constructors

	/** default constructor */
	public ReSubprojectEnterprise() {
	}

	/** full constructor */
	public ReSubprojectEnterprise(SubprojectInfo subprojectInfo,
			ProjectInfo projectInfo, Enterprise enterprise,
			String enterpriseName, Integer isSupport) {
		this.subprojectInfo = subprojectInfo;
		this.projectInfo = projectInfo;
		this.enterprise = enterprise;
		this.enterpriseName = enterpriseName;
		this.isSupport = isSupport;
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

	public ProjectInfo getProjectInfo() {
		return this.projectInfo;
	}

	public void setProjectInfo(ProjectInfo projectInfo) {
		this.projectInfo = projectInfo;
	}

	public Enterprise getEnterprise() {
		return this.enterprise;
	}

	public void setEnterprise(Enterprise enterprise) {
		this.enterprise = enterprise;
	}

	public String getEnterpriseName() {
		return this.enterpriseName;
	}

	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}

	public Integer getIsSupport() {
		return this.isSupport;
	}

	public void setIsSupport(Integer isSupport) {
		this.isSupport = isSupport;
	}

}