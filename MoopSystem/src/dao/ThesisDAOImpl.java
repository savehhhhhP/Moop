package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.ProjectInfo;
import domain.Thesis;
import domain.UserInfo;

public class ThesisDAOImpl extends HibernateDaoSupport implements ThesisDAO {

	@Override
	public void save(Thesis thesis) {
		// TODO Auto-generated method stub
		if (thesis == null) {
			return;
		}
		this.getHibernateTemplate().save(thesis);
	}

	@Override
	public List<Thesis> selectByProjectId(int projectId) {
		// TODO Auto-generated method stub
		String hql = "select new domain.Thesis(p.id,p.projectInfo,p.userInfo,p.author,"
				+ "p.topic,p.organization,p.publishDate,p.pagination,p.abstractContent,p.keyWords,p.thesisPath) from Thesis as p where p.projectInfo.id="
				+ projectId;
		List<Thesis> list = this.getHibernateTemplate().find(hql);
		return list;
	}

	@Override
	public void deleteById(int fileId) {
		// TODO Auto-generated method stub
		String hql = "from Thesis t where t.id=" + fileId;
		List<Thesis> list = this.getHibernateTemplate().find(hql);
		if(list.size() != 0){
			this.getHibernateTemplate().delete(list.get(0));
		}
	}
}
