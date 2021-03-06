package action;

import java.io.IOException;
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

public class GetManageProjectListAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProjectService projectService;
	private UserService userService;

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public UserService getUserService(UserService userService) {
		return userService;
	}

	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}

	public ProjectService getProjectService() {
		return this.projectService;
	}

	public String execute() {
		String masterEmail = "";
		int masterId = -1;
		UserInfo userInfo = new UserInfo();
		Map session = ActionContext.getContext().getSession();
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");
		PrintWriter writer = null;
		try {
			writer = response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

		if (session.containsKey("userEmail")) {
			masterEmail = (String) session.get("userEmail");
			userInfo = userService.findByEmail(masterEmail);
			masterId = userInfo.getId();

			List<ProjectInfo> projectInfoList = projectService
					.selectMyProject(masterId);

			if (projectInfoList.size() != 0) {
				List projectData = new ArrayList();
				for (int i = 0; i < projectInfoList.size(); i++) {
					ProjectInfo p = projectInfoList.get(i);
					Map map = new HashMap();
					map.put("id", p.getId());
					map.put("name", p.getName());
					map.put("introduction", p.getIntroduction());
					map.put("picturepath", p.getPicturePath());
					projectData.add(map);
				}

				JSONArray jsonList = JSONArray.fromObject(projectData);
				System.out.println(jsonList.toString());
				writer.write(jsonList.toString());
			} else {
				String str = "{\"0\":\"null\"}";
				writer.write(str);
			}
		} else {
			String str = "{\"0\":\"null\"}";
			writer.write(str);
		}

		return null;

	}

}
