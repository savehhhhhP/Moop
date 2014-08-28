package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Document;

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
		String hql = "select new domain.Document(p.id,p.projectInfo,p.userInfo,p.name,p.keyWords,"
				+ "p.abstractContent,p.author,p.documentPath) from Document as p where p.projectInfo.id="
				+ projectId;
		List<Document> list = this.getHibernateTemplate().find(hql);
		return list;
	}

	@Override
	public void deleteByd(int fileId) {
		// TODO Auto-generated method stub
		String hql = "from Document d where d.id=" + fileId;
		List<Document> list = this.getHibernateTemplate().find(hql);
		if(list.size() != 0){
			this.getHibernateTemplate().delete(list.get(0));
		}
	}

}
