package dao;

import java.util.List;

import domain.ProjectState;

public interface ProjectStateDAO {
	public List<ProjectState> select();

	public ProjectState findByName(String projectState);
}
