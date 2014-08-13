package service;

import domain.UserInfo;

//业务操作接口类，完成对DAO类方法的封装
public interface UserService {
	public UserInfo findByID(int userID);
	public UserInfo findByProperty(String propertyEmail, String propertyPsw);
	public void save(UserInfo newUser);
	public UserInfo findByName(String userName);
	public UserInfo findByEmail(String masterEmail);
}
