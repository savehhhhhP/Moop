package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.ProjectState;

public class ProjectStateDAOImpl extends HibernateDaoSupport implements ProjectStateDAO{

	@Override
	public List<ProjectState> select() {
		// TODO Auto-generated method stub
		String hql = "from ProjectState";
		List<ProjectState> projectStateList = (List<ProjectState>)this.getHibernateTemplate().find(hql);
		return projectStateList;
	}

	@Override
	public ProjectState findByName(String projectState) {
		// TODO Auto-generated method stub
		List result = getHibernateTemplate().find("from ProjectState as p where p.name='" + projectState + "'");
		if(result.size() == 1)
		{
			ProjectState _projectState = (ProjectState)result.get(0);
			return _projectState;
		}
		return null;
	}
	
}
