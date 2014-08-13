package service;

import java.util.List;

import dao.EnterpriseDAO;
import domain.Enterprise;

public class EnterpriseServiceImpl implements EnterpriseService{

private EnterpriseDAO enterpriseDAO;
	
	
	public void setEnterpriseDAO(EnterpriseDAO enterpriseDAO){
		this.enterpriseDAO = enterpriseDAO;
	}
	
	public EnterpriseDAO getEnterpriseDAO(){
		return this.enterpriseDAO;
	}
	@Override
	public List<Enterprise> select() {
		// TODO Auto-generated method stub
		return enterpriseDAO.select();
	}

	@Override
	public Enterprise findByName(String enterpriseName) {
		// TODO Auto-generated method stub
		return enterpriseDAO.findByName(enterpriseName);
	}

}
