package domain;

import java.util.HashSet;
import java.util.Set;

/**
 * Nation entity. @author MyEclipse Persistence Tools
 */

public class Nation implements java.io.Serializable {

	// Fields

	private Integer id;
	private String name;
	private Set userInfos = new HashSet(0);

	// Constructors

	/** default constructor */
	public Nation() {
	}

	/** minimal constructor */
	public Nation(String name) {
		this.name = name;
	}

	/** full constructor */
	public Nation(String name, Set userInfos) {
		this.name = name;
		this.userInfos = userInfos;
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

	public Set getUserInfos() {
		return this.userInfos;
	}

	public void setUserInfos(Set userInfos) {
		this.userInfos = userInfos;
	}

}