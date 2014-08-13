package dao;
import domain.UserInfo;

public interface UserDAO {
	public UserInfo findByID(int userID);//使用主键编号检索用户信息
	public UserInfo findByProperty(String propertyEmail, String propertyPsw);//检查是否存在邮箱和密码
	public void save(UserInfo newUser);
	public void update(UserInfo user);
	public void delete(int userID);
	public UserInfo findByName(String name);
	public UserInfo findByEmail(String masterEmail);
}
