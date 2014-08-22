package action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.struts2.ServletActionContext;

import service.ProjectService;

import com.opensymphony.xwork2.ActionSupport;

import domain.ProjectInfo;

public class GetIndexPageInfoAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String _projectName;
	private String _projectIntroduction;
	private String _projectPicturePath;
	private String result;
	private ProjectService projectService;


	public ProjectService getProjectService() {
		return projectService;
	}

	public void setProjectService(ProjectService projectService) {
		this.projectService = projectService;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public String get_projectName() {
		return _projectName;
	}

	public void set_projectName(String _projectName) {
		this._projectName = _projectName;
	}

	public String get_projectIntroduction() {
		return _projectIntroduction;
	}

	public void set_projectIntroduction(String _projectIntroduction) {
		this._projectIntroduction = _projectIntroduction;
	}

	public String get_projectPicturePath() {
		return _projectPicturePath;
	}

	public void set_projectPicturePath(String _projectPicturePath) {
		this._projectPicturePath = _projectPicturePath;
	}

	public String execute() {
		List<ProjectInfo> projectInfo = projectService.selectLatestProject();
		HttpServletResponse response = ServletActionContext.getResponse();
		response.setCharacterEncoding("UTF-8");
		PrintWriter writer = null;
		String str = "{\"0\":\"null\"}";
		System.out.println(str);
		try {
			writer = response.getWriter();
			if(projectInfo.size() != 0){
				JSONArray jsonList = JSONArray.fromObject(projectInfo);
				writer.write(jsonList.toString());
			}
			else{
				writer.write(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			writer.write(str);
			e.printStackTrace();
		}
		
		return null;
		
	}

}
