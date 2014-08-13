package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * ProjectState entity. @author MyEclipse Persistence Tools
 */

public class ProjectState implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Set projectInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public ProjectState() {
	}

	/** minimal constructor */
	public ProjectState(String name) {
		this.name = name;
	}

	/** full constructor */
	public ProjectState(String name, Set projectInfos) {
		this.name = name;
		this.projectInfos = projectInfos;
	}

	// Property accessors

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set getProjectInfos() {
		return this.projectInfos;
	}

	public void setProjectInfos(Set projectInfos) {
		this.projectInfos = projectInfos;
	}

}