package service;

import java.util.List;

import dao.ReProjectUserDAO;
import domain.ReProjectUser;

public class ReProjectUserServiceImpl implements ReProjectUserService{

	private ReProjectUserDAO reProjectUserDAO;
	
	
	
	public ReProjectUserDAO getReProjectUserDAO() {
		return reProjectUserDAO;
	}



	public void setReProjectUserDAO(ReProjectUserDAO reProjectUserDAO) {
		this.reProjectUserDAO = reProjectUserDAO;
	}



	@Override
	public List<ReProjectUser> selectReProjectUserInfo(int projectId) {
		// TODO Auto-generated method stub
		return reProjectUserDAO.selectReProjectUserInfo(projectId);
	}

}
