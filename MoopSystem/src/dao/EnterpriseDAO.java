package dao;

import java.util.List;

import domain.Enterprise;

public interface EnterpriseDAO {
	public List<Enterprise> select();
	public Enterprise findByName(String enterpriseName);
}
