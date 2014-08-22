package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.ReProjectUser;

public class ReProjectUserDAOImpl extends HibernateDaoSupport implements ReProjectUserDAO{

	@Override
	public List<ReProjectUser> selectReProjectUserInfo(int projectId) {
		// TODO Auto-generated method stub
		String hql = "from ReProjectUser r where r.projectInfo.id=" + projectId;
		List<ReProjectUser> list = this.getHibernateTemplate().find(hql);
		return list;
	}

}
