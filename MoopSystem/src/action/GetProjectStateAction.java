package action;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.struts2.ServletActionContext;

import service.ProjectStateService;

import com.opensymphony.xwork2.ActionSupport;

import domain.ProjectState;

public class GetProjectStateAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ProjectStateService projectStateService;
	
	public void setProjectStateService(ProjectStateService projectStateService){
		this.projectStateService = projectStateService;
	}
	
	public ProjectStateService getProjectStateService(){
		return this.projectStateService;
	}
	
	public String execute() throws Exception{
		List<ProjectState> projectStateList = (List<ProjectState>)projectStateService.select();
		if(projectStateList.size() != 0){
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setCharacterEncoding("UTF-8");
			PrintWriter writer = response.getWriter();
			List<String> list = new ArrayList();
			for(int i = 0; i < projectStateList.size(); i++)
			{
				list.add(i, projectStateList.get(i).getName());
			}
			JSONArray jsonList = JSONArray.fromObject(list);
			System.out.println(jsonList.toString());
			writer.write(jsonList.toString());
			return null;
		}
		return null;
	}
}
