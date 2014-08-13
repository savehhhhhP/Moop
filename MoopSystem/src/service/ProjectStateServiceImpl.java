package service;

import java.util.List;

import dao.ProjectStateDAO;
import domain.ProjectState;

public class ProjectStateServiceImpl implements ProjectStateService{
	private ProjectStateDAO projectStateDAO;
	
	public void setProjectStateDAO(ProjectStateDAO projectStateDAO){
		this.projectStateDAO = projectStateDAO;
	}
	public ProjectStateDAO getProjectStateDAO(){
		return this.projectStateDAO;
	}
	@Override
	public List<ProjectState> select() {
		// TODO Auto-generated method stub
		return projectStateDAO.select();
	}
	@Override
	public ProjectState findByName(String projectState) {
		// TODO Auto-generated method stub
		return projectStateDAO.findByName(projectState);
	}
	
}
