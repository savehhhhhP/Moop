package service;

import java.util.List;

import domain.ProjectInfo;

public interface ProjectService {
	public void save(ProjectInfo projectInfo);
	public Integer findByName(String projectName);
	public List<ProjectInfo> selectMyProject(int masterId);
	public List<ProjectInfo> selectLatestProject();
	public ProjectInfo selectProjectInfo(int projectId);
	public int update(ProjectInfo projectInfo);
	public ProjectInfo selectProject(int projectId);
}
