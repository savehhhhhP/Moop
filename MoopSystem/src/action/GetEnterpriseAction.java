package action;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONArray;

import org.apache.struts2.ServletActionContext;

import service.EnterpriseService;

import com.opensymphony.xwork2.ActionSupport;

import domain.Enterprise;

public class GetEnterpriseAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private EnterpriseService enterpriseService;
	
	public void setEnterpriseService(EnterpriseService enterpriseService) {
		this.enterpriseService = enterpriseService;
	}

	public EnterpriseService getEnterpriseService(
			EnterpriseService enterpriseService) {
		return enterpriseService;
	}
	
	public String execute() throws Exception{
		List<Enterprise> enterpriseList = enterpriseService.select();
		if (enterpriseList.size() != 0) {
			HttpServletResponse response = ServletActionContext.getResponse();
			response.setCharacterEncoding("UTF-8");
			PrintWriter writer = response.getWriter();
			// String json =
			List<String> list = new ArrayList<String>();
			for(int i = 0; i < enterpriseList.size(); i++){
				list.add(i, enterpriseList.get(i).getEnterpriseName());
			}
			JSONArray jsonList = JSONArray.fromObject(list);
			System.out.println(jsonList.toString());
			writer.write(jsonList.toString());
			return null;
		}
		return null;
	}
}
