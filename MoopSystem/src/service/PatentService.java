package service;
import java.util.List;

import domain.Patent;

public interface PatentService {
	
	public void save(Patent patent);

	public List<Patent> selectByProjectId(int projectId);
}
