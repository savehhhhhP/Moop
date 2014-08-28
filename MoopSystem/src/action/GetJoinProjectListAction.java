package action;

import java.util.List;
import java.util.Map;

import service.ReProjectUserService;
import service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.ProjectInfo;
import domain.ReProjectUser;
import domain.UserInfo;

public class GetJoinProjectListAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserService userService;
	private ReProjectUserService reProjectUserService;
	private List<ReProjectUser> reProjectUserList;
	
	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public ReProjectUserService getReProjectUserService() {
		return reProjectUserService;
	}

	public void setReProjectUserService(ReProjectUserService reProjectUserService) {
		this.reProjectUserService = reProjectUserService;
	}

	public List<ReProjectUser> getReProjectUserList() {
		return reProjectUserList;
	}

	public void setReProjectUserList(List<ReProjectUser> reProjectUserList) {
		this.reProjectUserList = reProjectUserList;
	}

	public String execute(){
		
		Map session = ActionContext.getContext().getSession();
		UserInfo userInfo = null;
		if(session.containsKey("userEmail")){
			userInfo = userService.findByEmail(session.get("userEmail").toString().trim());
			reProjectUserList = reProjectUserService.selectJoinProject(userInfo.getId());
		}
		return SUCCESS;
	}
}
