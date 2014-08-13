package service;

import java.util.List;

import domain.ProjectState;

public interface ProjectStateService {
	public List<ProjectState> select();
	public ProjectState findByName(String projectState);
}
