package dao;
import domain.UserInfo;

public interface UserDAO {
	public UserInfo findByID(int userID);//ʹ��������ż����û���Ϣ
	public UserInfo findByProperty(String propertyEmail, String propertyPsw);//����Ƿ�������������
	public void save(UserInfo newUser);
	public void update(UserInfo user);
	public void delete(int userID);
	public UserInfo findByName(String name);
	public UserInfo findByEmail(String masterEmail);
}