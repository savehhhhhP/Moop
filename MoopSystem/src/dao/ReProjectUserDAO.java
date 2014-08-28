package dao;

import java.util.List;

import domain.ReProjectUser;

public interface ReProjectUserDAO {
	public List<ReProjectUser> selectReProjectUserInfo(int projectId);

	public List<ReProjectUser> selectJoinProject(Integer userId);
}
