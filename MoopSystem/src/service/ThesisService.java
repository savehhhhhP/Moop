package service;

import java.util.List;

import domain.Patent;
import domain.Thesis;


public interface ThesisService {
	public void save(Thesis thesis);

	public List<Thesis> selectByProjectId(int projectId);
}
