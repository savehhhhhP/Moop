package dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.ProjectInfo;
import domain.UserInfo;

public class ProjectDAOImpl extends HibernateDaoSupport implements ProjectDAO {

	@Override
	public void save(ProjectInfo projectInfo) {
		// TODO Auto-generated method stub
		if (projectInfo == null)
			return;
		getHibernateTemplate().save(projectInfo);

	}

	@Override
	public Integer findByName(String projectName) {
		// TODO Auto-generated method stub
		String[] args = { projectName };
		List result = getHibernateTemplate().find(
				"from ProjectInfo as c where c.Name=?", args);
		if (result.size() == 1) {
			ProjectInfo project = (ProjectInfo) result.get(0);
			return new Integer(project.getId());
		}
		return null;
	}

	@Override
	public List<ProjectInfo> selectMyProject(int masterId) {
		// TODO Auto-generated method stub
		Session session = this.getHibernateTemplate().getSessionFactory()
				.openSession();
		Transaction tx = session.beginTransaction();

	/*	Query query = session
				.createQuery("select new domain.ProjectInfo(c.name,c.introduction,c.picturePath) from ProjectInfo as c where c.userInfo.id="
						+ masterId);*/
	/*	Query query = session
				.createQuery("select new domain.ProjectInfo(c.id,c.name,c.number,t.name,c.enterpriseName,c.startDate,c.endDate,c.funds," +
						"c.isPublic,s.name,c.introduction,c.picturePath) from ProjectInfo as c,ProjectType as t,ProjectState as s where c.userInfo.id="
						+ masterId + " and c.projectType.id=t.id and c.projectState.id=s.id");*/
		
		Query query = session
				.createQuery("from ProjectInfo as c where c.userInfo.id=" + masterId);
		List<ProjectInfo> projectInfoList = query.list();
		session.close();
		return projectInfoList;

	}

	@Override
	public List<ProjectInfo> selectLatestProject() {
		// TODO Auto-generated method stub

		Session session = this.getHibernateTemplate().getSessionFactory()
				.openSession();
		System.out.println(session.toString());
		Transaction tx = session.beginTransaction();
		Query query = session
				.createQuery("select new domain.ProjectInfo(name,introduction,picturePath) from ProjectInfo order by id desc");
		query.setMaxResults(4);
		List<ProjectInfo> projectInfoList = query.list();
		tx.commit();
		session.close();
		return projectInfoList;

		/*
		 * String hql = "from ProjectInfo"; HibernateTemplate temp =
		 * getHibernateTemplate(); try{ List<ProjectInfo> result =
		 * (List<ProjectInfo>)temp.find(hql); System.out.println(result); }
		 * catch(Exception e) { e.printStackTrace(); }
		 * 
		 * System.out.println("aaaa"); return null;
		 */
	}
}