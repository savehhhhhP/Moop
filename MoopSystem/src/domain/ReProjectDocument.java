package domain;

/**
 * ReProjectDocument entity. @author MyEclipse Persistence Tools
 */

public class ReProjectDocument implements java.io.Serializable {

	// Fields

	private Integer id;
	private SubprojectInfo subprojectInfo;
	private Document document;
	private ProjectInfo projectInfo;
	private String documentName;

	// Constructors

	/** default constructor */
	public ReProjectDocument() {
	}

	/** full constructor */
	public ReProjectDocument(SubprojectInfo subprojectInfo, Document document,
			ProjectInfo projectInfo, String documentName) {
		this.subprojectInfo = subprojectInfo;
		this.document = document;
		this.projectInfo = projectInfo;
		this.documentName = documentName;
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

	public Document getDocument() {
		return this.document;
	}

	public void setDocument(Document document) {
		this.document = document;
	}

	public ProjectInfo getProjectInfo() {
		return this.projectInfo;
	}

	public void setProjectInfo(ProjectInfo projectInfo) {
		this.projectInfo = projectInfo;
	}

	public String getDocumentName() {
		return this.documentName;
	}

	public void setDocumentName(String documentName) {
		this.documentName = documentName;
	}

}