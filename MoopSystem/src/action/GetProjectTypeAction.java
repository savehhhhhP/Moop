package action;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;


import net.sf.json.JSONArray;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import service.ProjectTypeService;
import service.UserService;

import com.opensymphony.xwork2.ActionSupport;

import domain.ProjectType;

public class GetProjectTypeAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProjectTypeService projectTypeService;

	public void setProjectTypeService(ProjectTypeService projectTypeService) {
		this.projectTypeService = projectTypeService;
	}

	public ProjectTypeService getProjectTypeService(
			ProjectTypeService projectTypeService) {
		return projectTypeService;
	}

	public String execute() throws Exception {
		List<ProjectType> projectTypeList = projectTypeService.select();
		if (projectTypeList.size() != 0) {
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setCharacterEncoding("UTF-8");
			PrintWriter writer = response.getWriter();
			// String json =
			List<String> list = new ArrayList<String>();
			for(int i = 0; i < projectTypeList.size(); i++){
				list.add(i, projectTypeList.get(i).getName());
			}
			JSONArray jsonList = JSONArray.fromObject(list);
			System.out.println(jsonList.toString());
			writer.write(jsonList.toString());
			return null;
		}
		return null;
	}
}
