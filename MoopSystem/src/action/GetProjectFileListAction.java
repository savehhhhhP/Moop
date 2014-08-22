package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;
import net.sf.json.JsonConfig;

import org.apache.struts2.ServletActionContext;

import service.PatentService;
import service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Patent;
import domain.UserInfo;

public class GetProjectFileListAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	private UserService userService;
	private PatentService patentService; 
	private String projectId;
	
	
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public PatentService getPatentService() {
		return patentService;
	}
	public void setPatentService(PatentService patentService) {
		this.patentService = patentService;
	}

	public String getProjectId() {
		return projectId;
	}
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	public String execute(){
		Map session = ActionContext.getContext().getSession();
		UserInfo userInfo = null;
		String userEmail = "";
		int masterId = -1;
		
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");
		PrintWriter writer = null;
		int id = Integer.parseInt(projectId);
		try {
			writer = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		if(session.containsKey("userEmail") && id > 0){
			userEmail = session.get("userEmail").toString();
			userInfo = userService.findByEmail(userEmail);
			masterId = userInfo.getId();
			List<Patent> patentList = patentService.selectByProjectId(id);
			List patentData = new ArrayList();
			
			if(patentList.size() != 0){
				List myPatent = new ArrayList();
				List otherPatent = new ArrayList();
				for(int i = 0; i < patentList.size(); i++){
					Map map = new HashMap(); 
					Patent p = patentList.get(i);
					map.put("name", p.getName());
					map.put("patentNum", p.getPatentNum());
					map.put("applyDate", p.getApplyDate());
					map.put("author", p.getAuthor());
					map.put("keyWords", p.getKeyWords());
					map.put("abstractContent", p.getAbstractContent());
					map.put("organization", p.getOrganization());
					map.put("patentPath", p.getPatentPath());
					map.put("userEmail", p.getUserInfo().getEmail());
					if(p.getUserInfo().getId() == masterId){
						myPatent.add(map);
					}else{
						otherPatent.add(map);
					}
				}
				
				patentData.add(myPatent);
				patentData.add(otherPatent);
				
				JSONArray jsonList = JSONArray.fromObject(patentData);
				System.out.println(jsonList.toString());
				writer.write(jsonList.toString());
				
			}else{
				String str = "{\"0\":\"null\"}";
				writer.write(str);
			}
		}else{
			String str = "{\"0\":\"null\"}";
			writer.write(str);
		}
		return null;
	}

}
