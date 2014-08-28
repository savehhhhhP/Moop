package dao;

import java.util.List;

import domain.Document;

public interface DocumentDAO {
	public void save(Document document);

	public List<Document> selectByProjectId(int projectId);

	public void deleteByd(int fileId);
}
