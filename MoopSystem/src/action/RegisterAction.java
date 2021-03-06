package action;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import service.EnterpriseService;
import service.UserService;

import com.opensymphony.xwork2.ActionSupport;

import domain.Enterprise;
import domain.UserInfo;

public class RegisterAction extends ActionSupport{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String _nickname;
	private String _userPsw1;
	private String _userPsw2;
	private String _userEmail;
	private String _enterprise;
	
	EnterpriseService enterpriseService;
	UserService userService;
	
	public String get_enterprise() {
		return _enterprise;
	}

	public void set_enterprise(String _enterprise) {
		this._enterprise = _enterprise;
	}

	public String get_Nickname() {
		return _nickname;
	}

	public String get_nickname() {
		return _nickname;
	}

	public void set_nickname(String _Nickname) {
		this._nickname = _Nickname;
	}

	public String get_userPsw1() {
		return _userPsw1;
	}

	public void set_userPsw1(String _userPsw1) {
		this._userPsw1 = _userPsw1;
	}

	public String get_userPsw2() {
		return _userPsw2;
	}
	public void set_userPsw2(String _userPsw2) {
		this._userPsw2 = _userPsw2;
	}

	public String get_userEmail() {
		return _userEmail;
	}

	public void set_userEmail(String _userEmail) {
		this._userEmail = _userEmail;
	}

	

	public EnterpriseService getEnterpriseService() {
		return enterpriseService;
	}

	public void setEnterpriseService(EnterpriseService enterpriseService) {
		this.enterpriseService = enterpriseService;
	}

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public String execute() throws Exception{
		
		
		if(!_userPsw1.equals(_userPsw2)){
			return ERROR;
		}


		Enterprise enterprise = enterpriseService.findByName(_enterprise);
		UserInfo stu = new UserInfo(enterprise, _nickname,_userEmail.trim(), _userPsw1);
		userService.save(stu);
		return SUCCESS;
	}

}
