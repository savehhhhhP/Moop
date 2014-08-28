package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Patent;
import domain.ProjectInfo;
import domain.UserInfo;

public class PatentDAOImpl extends HibernateDaoSupport implements PatentDAO {

	@Override
	public void save(Patent patent) {
		// TODO Auto-generated method stub
		if (patent == null) {
			return;
		}
		this.getHibernateTemplate().save(patent);
	}

	@Override
	public List<Patent> selectByProjectId(int projectId) {
		// TODO Auto-generated method stub
		 String hql = "select new domain.Patent(p.id,p.projectInfo,p.userInfo,p.patentNum," + 
			"p.applyDate,p.author,p.keyWords,p.abstractContent,p.organization,p.name,p.patentPath) from Patent as p where p.projectInfo.id=" + projectId;
		 List<Patent> list = this.getHibernateTemplate().find(hql);
		 return list;
	}

	@Override
	public void deleteById(int fileId) {
		// TODO Auto-generated method stub
		String hql = "from Patent p where p.id=" + fileId;
		List<Patent> list = this.getHibernateTemplate().find(hql);
		if(list.size() != 0){
			this.getHibernateTemplate().delete(list.get(0));
		}
	}

}
