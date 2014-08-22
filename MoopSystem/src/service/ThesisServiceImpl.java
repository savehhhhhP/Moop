package service;


import java.util.List;

import dao.ThesisDAO;
import domain.Patent;
import domain.Thesis;

public class ThesisServiceImpl implements ThesisService{

	private ThesisDAO thesisDAO;
	
	
	public ThesisDAO getThesisDAO() {
		return thesisDAO;
	}

	public void setThesisDAO(ThesisDAO thesisDAO) {
		this.thesisDAO = thesisDAO;
	}

	@Override
	public void save(Thesis thesis) {
		// TODO Auto-generated method stub
		thesisDAO.save(thesis);
	}

	@Override
	public List<Thesis> selectByProjectId(int projectId) {
		// TODO Auto-generated method stub
		return thesisDAO.selectByProjectId(projectId);
	}

	

}
