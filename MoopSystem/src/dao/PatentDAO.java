package dao;

import java.util.List;

import domain.Patent;

public interface PatentDAO {
	public void save(Patent patent);

	public List<Patent> selectByProjectId(int projectId);
}
