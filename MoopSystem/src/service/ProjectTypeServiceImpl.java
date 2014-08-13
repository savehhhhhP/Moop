package service;

import java.util.List;

import dao.ProjectTypeDAO;
import domain.ProjectType;

public class ProjectTypeServiceImpl implements ProjectTypeService{

	private ProjectTypeDAO projectTypeDAO;
	
	
	public void setProjectTypeDAO(ProjectTypeDAO projectTypeDAO){
		this.projectTypeDAO = projectTypeDAO;
	}
	
	public ProjectTypeDAO getProjectTypeDAO(){
		return this.projectTypeDAO;
	}
	@Override
	public ProjectType findByID(int projectID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ProjectType findByName(String projectTypeName) {
		// TODO Auto-generated method stub
		return projectTypeDAO.findByName(projectTypeName);
	}

	@Override
	public List<ProjectType> select() {
		// TODO Auto-generated method stub
		return projectTypeDAO.select();
	}

	@Override
	public void save(ProjectType newProjectType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(ProjectType projectType) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int projectTypeID) {
		// TODO Auto-generated method stub
		
	}

}
