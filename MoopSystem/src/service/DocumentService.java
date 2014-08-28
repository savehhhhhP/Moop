package service;

import java.util.List;

import domain.Document;

public interface DocumentService {
	public void save(Document document);

	public List<Document> selectByProjectId(int projectId);

	public void deleteById(int fileId);
}
