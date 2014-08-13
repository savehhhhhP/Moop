package service;
import java.util.List;

import domain.Enterprise;

public interface EnterpriseService {
	public List<Enterprise> select();
	public Enterprise findByName(String enterpriseName);
}
