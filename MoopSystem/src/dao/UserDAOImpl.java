package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.classic.Session;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.UserInfo;

public class UserDAOImpl extends HibernateDaoSupport implements UserDAO {

	@Override
	public UserInfo findByID(int userID) {
		// TODO Auto-generated method stub
		UserInfo user = (UserInfo) getHibernateTemplate().get(UserInfo.class,
				userID); // 根据主键加载特定持久化类的实例
		return user;
	}

	/**
	 * 根据邮箱等用户信息查找用户
	 */
	@Override
	public UserInfo findByProperty(String propertyEmail, String propertyPsw) {
		// TODO Auto-generated method stub
		UserInfo result = new UserInfo();
		String queryString = "from UserInfo where email='" + propertyEmail
				+ "' and password='" + propertyPsw + "'";
		System.out.println(queryString + "abc");
		List<UserInfo> userList = getHibernateTemplate().find(queryString);
		if (userList.size() != 0) // 存在相应的用户
		{
			result = userList.get(0);
		} else // 不存在相应的用户
		{
			result = null;
		}
		return result;
	}

	@Override
	public void save(UserInfo newUser) {
		// TODO Auto-generated method stub
		if (newUser == null) // 用户不存在
			return;
		getHibernateTemplate().save(newUser);// 保存新用户
	}

	public void update(UserInfo user) {
		if (user == null) // 用户不存在
			return;
		getHibernateTemplate().update(user);// 更新用户
	}

	@Override
	public void delete(int userID) {
		// TODO Auto-generated method stub
		getHibernateTemplate()
				.delete(getHibernateTemplate().get(UserInfo.class,
						new Integer(userID)));// 删除用户
	}

	@Override
	public UserInfo findByName(String name) {
		Session session = this.getHibernateTemplate().getSessionFactory()
				.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from UserInfo as u where u.name='"
				+ name + "'");
		List<UserInfo> result = (List<UserInfo>) query.list();
		session.close();
		if(result.size() != 0){
			return result.get(0);
		}
		return null;

	}

	@Override
	public UserInfo findByEmail(String masterEmail) {
		// TODO Auto-generated method stub
		Session session = this.getHibernateTemplate().getSessionFactory()
				.openSession();
		session.beginTransaction();
		Query query = session.createQuery("from UserInfo as u where u.email='"
				+ masterEmail + "'");
		List<UserInfo> result = (List<UserInfo>) query.list();
		session.close();
		if(result.size() != 0){
			return result.get(0);
		}
		return null;
	}

}
