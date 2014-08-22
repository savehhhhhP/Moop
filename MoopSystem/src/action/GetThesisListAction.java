package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.struts2.ServletActionContext;

import service.ThesisService;
import service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Patent;
import domain.Thesis;
import domain.UserInfo;

public class GetThesisListAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	
	private UserService userService;
	private ThesisService thesisService;
	
	private String projectId;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public ThesisService getThesisService() {
		return thesisService;
	}

	public void setThesisService(ThesisService thesisService) {
		this.thesisService = thesisService;
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
			List<Thesis> thesisList = thesisService.selectByProjectId(id);
			List thesisData = new ArrayList();
			
			if(thesisList.size() != 0){
				List myThesis = new ArrayList();
				List otherThesis = new ArrayList();
				for(int i = 0; i < thesisList.size(); i++){
					Map map = new HashMap(); 
					Thesis t = thesisList.get(i);
					map.put("name", t.getTopic());
					map.put("publishDate", t.getPublishDate());
					map.put("author", t.getAuthor());
					map.put("keyWords", t.getKeyWords());
					map.put("abstractContent", t.getAbstractContent());
					map.put("organization", t.getOrganization());
					map.put("thesisPath", t.getThesisPath());
					map.put("userEmail", t.getUserInfo().getEmail());
					if(t.getUserInfo().getId() == masterId){
						myThesis.add(map);
					}else{
						otherThesis.add(map);
					}
				}
				
				thesisData.add(myThesis);
				thesisData.add(otherThesis);
				
				JSONArray jsonList = JSONArray.fromObject(thesisData);
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
