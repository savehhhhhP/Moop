package dao;

import java.util.List;
import domain.Thesis;

public interface ThesisDAO {
	public void save(Thesis thesis);

	public List<Thesis> selectByProjectId(int projectId);

	public void deleteById(int fileId);
}
