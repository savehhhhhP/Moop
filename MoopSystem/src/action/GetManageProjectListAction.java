package action;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import net.sf.json.JSONArray;

import service.ProjectService;
import service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.ProjectInfo;
import domain.UserInfo;

public class GetManageProjectListAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProjectService projectService;
	private UserService userService;
	
	public void setUserService(UserService userService){
		this.userService = userService;
	}
	public UserService getUserService(UserService userService){
		return userService;
	}
	
	public void setProjectService(ProjectService projectService){
		this.projectService = projectService;
	}
	public ProjectService getProjectService(){
		return this.projectService;
	}
	
	public String execute() throws Exception{
		String masterEmail = "";
		int masterId = -1;
		UserInfo userInfo = new UserInfo();
		Map session = ActionContext.getContext().getSession();
		if (session.containsKey("userEmail")) {
			masterEmail = (String) session.get("userEmail");
			userInfo = userService.findByEmail(masterEmail);
			masterId = userInfo.getId();
		}
		List<ProjectInfo> projectInfoList = projectService.selectMyProject(masterId); 

		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");
		PrintWriter writer = response.getWriter();
		if(projectInfoList.size() != 0){
			List projectData = new ArrayList();
			for(int i = 0; i < projectInfoList.size(); i++){
				ProjectInfo p = projectInfoList.get(i);
				Map map = new HashMap();
				map.put("id", p.getId());
				map.put("name", p.getName());
				map.put("number", p.getNumber());
				map.put("type", p.getProjectType().getName());
				map.put("enterprise", p.getEnterpriseName());
				map.put("startDate", p.getStartDate());
				map.put("endDate", p.getEndDate());
				map.put("funds", p.getFunds());
				map.put("isPublic", p.getIsPublic());
				map.put("state", p.getProjectState().getName());
				map.put("introduction", p.getIntroduction());
				map.put("picturepath", p.getPicturePath());
				projectData.add(map);
				
			}
			HttpServletRequest request = ServletActionContext.getRequest();
			request.setAttribute("project", projectData);
			
			JSONArray jsonList = JSONArray.fromObject(projectData);
			System.out.println(jsonList.toString());
			writer.write(jsonList.toString());
		}
		else
		{
			String str = "{\"0\":\"null\"}";
			writer.write(str);
		}
		
		return null;
		
	}
}
