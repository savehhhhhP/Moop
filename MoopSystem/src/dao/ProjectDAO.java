package dao;

import java.util.List;

import domain.ProjectInfo;

public interface ProjectDAO {
	public void save(ProjectInfo proejctInfo);
	public Integer findByName(String projectName);
	public List<ProjectInfo> selectMyProject(int masterId);
	public List<ProjectInfo> selectLatestProject();
}
