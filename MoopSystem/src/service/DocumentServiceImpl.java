package service;

import java.util.List;

import dao.DocumentDAO;
import domain.Document;

public class DocumentServiceImpl implements DocumentService{

	private DocumentDAO documentDAO;
	
	
	
	public DocumentDAO getDocumentDAO() {
		return documentDAO;
	}



	public void setDocumentDAO(DocumentDAO documentDAO) {
		this.documentDAO = documentDAO;
	}



	@Override
	public void save(Document document) {
		// TODO Auto-generated method stub
		documentDAO.save(document);
	}



	@Override
	public List<Document> selectByProjectId(int projectId) {
		// TODO Auto-generated method stub
		return documentDAO.selectByProjectId(projectId);
	}

}
