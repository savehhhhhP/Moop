package action;
import java.util.Map;

import javax.servlet.http.HttpSession;



import service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.UserInfo;

public class LoginAction extends ActionSupport {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String userEmail;
	private String userPsw;
	private UserService userService;
	
	public String getUserEmail(){
		return userEmail;
	}
	public void setUserEmail(String userEmail){
		this.userEmail = userEmail;
	}
	
	public void setUserPsw(String userPsw){
		this.userPsw = userPsw;
	}
	public String getUserPsw(){
		return userPsw;
	}
	
	public void setUserService(UserService userService){
		this.userService = userService;
	}
	public UserService getUserService(UserService userService){
		return userService;
	}
	
	/**
	 * 查询用户邮箱密码是否正确，正确存入session且登录成功。
	 */
	public String execute() throws Exception{
		UserInfo result = userService.findByProperty(userEmail, userPsw);
		if(result != null)
		{
			Map session =  ActionContext.getContext().getSession();
			if(session.containsKey("userInfo"))
			{
				session.remove("userInfo");	
			}
			session.put("userInfo",result.getName());
			session.put("userEmail", result.getEmail());
			return SUCCESS;
		}
		else return ERROR;
	}
}
