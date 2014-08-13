package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.ProjectType;
import domain.UserInfo;

public class ProjectTypeDAOImpl extends HibernateDaoSupport implements ProjectTypeDAO{

	private SessionFactory sessionFactory;
	
	@Override
	public ProjectType findByID(int projectID) {
		// TODO Auto-generated method stub
		ProjectType projectType = (ProjectType) getHibernateTemplate().get(ProjectType.class, projectID); //根据主键加载特定持久化类的实例
		return projectType;
	}

	@Override
	public ProjectType findByName(String projectName) {
		// TODO Auto-generated method stub
		List result = getHibernateTemplate().find("from ProjectType as c where c.name='" + projectName + "'");
		if(result.size()==1)
		{
			ProjectType proejctType = (ProjectType)result.get(0);
			return proejctType;
		}
		return null;
	}
	

	@Override
	public List<ProjectType> select() {
		// TODO Auto-generated method stub
		String hql = "from ProjectType";
		/*	Session session = sessionFactory.openSession();
			Transaction tx =null;
			session.beginTransaction();
			tx =session.beginTransaction();
			session.createQuery(hql);*/
			
			List<ProjectType> projectTypeList = (List<ProjectType>)this.getHibernateTemplate().find(hql);
			if(projectTypeList.size() != 0)
			{
				return projectTypeList;
			}
			return null;
	}

	@Override
	public void save(ProjectType newProjectType) {
		// TODO Auto-generated method stub
		if(newProjectType == null) 
			return;
		getHibernateTemplate().save(newProjectType);//保存
	}

	@Override
	public void update(ProjectType projectType) {
		// TODO Auto-generated method stub
		if(projectType == null) //不存在
			return;
		getHibernateTemplate().update(projectType);//更新
	}

	@Override
	public void delete(int projectTypeID) {
		// TODO Auto-generated method stub
		getHibernateTemplate().delete(getHibernateTemplate().get(ProjectType.class, new Integer(projectTypeID)));
	}

}
