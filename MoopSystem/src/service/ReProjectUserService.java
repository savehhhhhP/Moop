package service;
import domain.ReProjectUser;
import java.util.List;


public interface ReProjectUserService {
	public List<ReProjectUser> selectReProjectUserInfo(int projectId);

	public List<ReProjectUser> selectJoinProject(Integer userId);
}
