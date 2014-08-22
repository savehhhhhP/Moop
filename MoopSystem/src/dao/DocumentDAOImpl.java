package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Document;
import domain.ProjectInfo;
import domain.UserInfo;

public class DocumentDAOImpl extends HibernateDaoSupport implements DocumentDAO{

	@Override
	public void save(Document document) {
		// TODO Auto-generated method stub
		if(document == null){
			return;
		}
		this.getHibernateTemplate().save(document);
	}

	@Override
	public List<Document> selectByProjectId(int projectId) {
		// TODO Auto-generated method stub
		String hql = "select new domain.Document(p.projectInfo,p.userInfo,p.name,p.keyWords,"
				+ "p.abstractContent,p.author,p.documentPath) from Document as p where p.projectInfo.id="
				+ projectId;
		List<Document> list = this.getHibernateTemplate().find(hql);
		return list;
	}

}
