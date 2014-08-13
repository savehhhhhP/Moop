package service;

import domain.UserInfo;

//ҵ������ӿ��࣬��ɶ�DAO�෽���ķ�װ
public interface UserService {
	public UserInfo findByID(int userID);
	public UserInfo findByProperty(String propertyEmail, String propertyPsw);
	public void save(UserInfo newUser);
	public UserInfo findByName(String userName);
	public UserInfo findByEmail(String masterEmail);
}
