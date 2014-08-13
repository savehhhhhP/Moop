package dao;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import domain.Enterprise;
import domain.ProjectType;
import domain.UserInfo;

public class EnterpriseDAOImpl extends HibernateDaoSupport implements EnterpriseDAO{

	@Override
	public List<Enterprise> select() {
		// TODO Auto-generated method stub
		String hql = "from Enterprise";
		List<Enterprise> enterpriseList = (List<Enterprise>)this.getHibernateTemplate().find(hql);
		System.out.print(hql);
		if(enterpriseList.size() != 0)
		{
			return enterpriseList;
		}
		return null;
	}

	@Override
	public Enterprise findByName(String enterpriseName) {
		// TODO Auto-generated method stub
		String []args = {enterpriseName};
		List result = getHibernateTemplate().find("from Enterprise as e where e.enterpriseName='" +  enterpriseName + "'");
		if(result.size()==1)
		{
			Enterprise enterprise = (Enterprise)result.get(0);
			return enterprise;
		}
		return null;
	}

}
