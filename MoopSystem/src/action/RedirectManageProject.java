package action;

import javax.servlet.http.HttpServletRequest;

import net.sf.json.JSONObject;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import domain.ProjectInfo;

public class RedirectManageProject extends ActionSupport {
	
	private static final long serialVersionUID = 1L;
	
	private ProjectInfo projectInfo;

	private String infoId;

	public String getInfoId() {
		return infoId;
	}

	public void setInfoId(String infoId) {
		this.infoId = infoId;
	}

	public ProjectInfo getProjectInfo() {
		return projectInfo;
	}

	public void setProjectInfo(ProjectInfo projectInfo) {
		this.projectInfo = projectInfo;
	}


	public String execute() throws Exception {
		// TODO Auto-generated method stub
		HttpServletRequest request = ServletActionContext.getRequest();
		//JSONArray.fromObject(object)
		String s = request.getParameter("project");
		//List list = JSONArray.toList(json);
		JSONObject object = JSONObject.fromObject(s);
		System.out.println(object.get("id"));
		projectInfo = new ProjectInfo();
		projectInfo.setId((Integer.parseInt(object.get("id").toString())));
		
		return SUCCESS;
	}
}
