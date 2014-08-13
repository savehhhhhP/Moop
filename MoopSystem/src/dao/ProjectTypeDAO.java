package dao;

import java.util.List;

import domain.ProjectType;

public interface ProjectTypeDAO {
	public ProjectType findByID(int projectID);
	public ProjectType findByName(String projectName);
	public List<ProjectType> select();
	public void save(ProjectType newProjectType);
	public void update(ProjectType projectType);
	public void delete(int projectTypeID);
}
