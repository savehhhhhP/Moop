package service;

import java.util.List;

import dao.ProjectDAO;
import domain.ProjectInfo;

public class ProjectServiceImpl implements ProjectService{

	private ProjectDAO projectDAO;
	
	public void setProjectDAO(ProjectDAO projectDAO){
		this.projectDAO = projectDAO;
	}
	
	public ProjectDAO getProjectDAO(){
		return this.projectDAO;
	}
	
	@Override
	public void save(ProjectInfo projectInfo) {
		// TODO Auto-generated method stub
		projectDAO.save(projectInfo);
	}

	@Override
	public Integer findByName(String projectName) {
		// TODO Auto-generated method stub
		return projectDAO.findByName(projectName);
	}


	@Override
	public List<ProjectInfo> selectMyProject(int masterId) {
		// TODO Auto-generated method stub
		return projectDAO.selectMyProject(masterId);
	}

	@Override
	public List<ProjectInfo> selectLatestProject() {
		// TODO Auto-generated method stub
		return projectDAO.selectLatestProject();
	}

	@Override
	public ProjectInfo selectProjectInfo(int projectId) {
		// TODO Auto-generated method stub
		return projectDAO.selectProjectInfo(projectId);
	}

	@Override
	public int update(ProjectInfo projectInfo) {
		// TODO Auto-generated method stub
		return projectDAO.update(projectInfo);
	}

	@Override
	public ProjectInfo selectProject(int projectId) {
		// TODO Auto-generated method stub
		return projectDAO.selectProject(projectId);
	}


}
