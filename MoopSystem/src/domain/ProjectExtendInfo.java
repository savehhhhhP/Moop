package domain;

/**
 * ProjectExtendInfo entity. @author MyEclipse Persistence Tools
 */

public class ProjectExtendInfo implements java.io.Serializable {

	// Fields

	private Integer id;
	private ProjectInfo projectInfo;
	private String introduction;
	private String studyContent;
	private String keyPoint;
	private String tecSchema;

	// Constructors

	/** default constructor */
	public ProjectExtendInfo() {
	}

	/** minimal constructor */
	public ProjectExtendInfo(ProjectInfo projectInfo, String introduction,
			String studyContent) {
		this.projectInfo = projectInfo;
		this.introduction = introduction;
		this.studyContent = studyContent;
	}

	/** full constructor */
	public ProjectExtendInfo(ProjectInfo projectInfo, String introduction,
			String studyContent, String keyPoint, String tecSchema) {
		this.projectInfo = projectInfo;
		this.introduction = introduction;
		this.studyContent = studyContent;
		this.keyPoint = keyPoint;
		this.tecSchema = tecSchema;
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

	public String getIntroduction() {
		return this.introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getStudyContent() {
		return this.studyContent;
	}

	public void setStudyContent(String studyContent) {
		this.studyContent = studyContent;
	}

	public String getKeyPoint() {
		return this.keyPoint;
	}

	public void setKeyPoint(String keyPoint) {
		this.keyPoint = keyPoint;
	}

	public String getTecSchema() {
		return this.tecSchema;
	}

	public void setTecSchema(String tecSchema) {
		this.tecSchema = tecSchema;
	}

}