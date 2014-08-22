package service;

import java.util.List;

import dao.PatentDAO;
import domain.Patent;

public class PatentServiceImpl implements PatentService{
	
	private PatentDAO patentDAO;
	
	

	public PatentDAO getPatentDAO() {
		return patentDAO;
	}



	public void setPatentDAO(PatentDAO patentDAO) {
		this.patentDAO = patentDAO;
	}



	@Override
	public void save(Patent patent) {
		// TODO Auto-generated method stub
		patentDAO.save(patent);
	}



	@Override
	public List<Patent> selectByProjectId(int projectId) {
		// TODO Auto-generated method stub
		return patentDAO.selectByProjectId(projectId);
	}

}
