package service;

import dao.UserDAO;
import domain.UserInfo;

public class UserServiceImpl implements UserService{

	private UserDAO userDAO;
	
	public UserDAO getUserDAO(){
		return userDAO;
	}
	public void setUserDAO(UserDAO userDAO){
		this.userDAO = userDAO;
	}
	@Override
	public UserInfo findByID(int userID) {
		// TODO Auto-generated method stub
		return userDAO.findByID(userID);
	}

	@Override
	public UserInfo findByProperty(String propertyEmail, String propertyPsw) {
		// TODO Auto-generated method stub
		return userDAO.findByProperty(propertyEmail, propertyPsw);
	}

	@Override
	public void save(UserInfo newUser) {
		// TODO Auto-generated method stub
		userDAO.save(newUser);
	}
	@Override
	public UserInfo findByName(String userName) {
		// TODO Auto-generated method stub
		return userDAO.findByName(userName);
	}
	@Override
	public UserInfo findByEmail(String masterEmail) {
		// TODO Auto-generated method stub
		return userDAO.findByEmail(masterEmail);
	}

}
