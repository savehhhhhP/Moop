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

import service.DocumentService;
import service.UserService;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import domain.Document;
import domain.Thesis;
import domain.UserInfo;

public class GetDocumentListAction extends ActionSupport{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private UserService userService;
	private DocumentService documentService;
	
	private String projectId;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public DocumentService getDocumentService() {
		return documentService;
	}

	public void setDocumentService(DocumentService documentService) {
		this.documentService = documentService;
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
			List<Document> documentList = documentService.selectByProjectId(id);
			List documentData = new ArrayList();
			
			if(documentList.size() != 0){
				List myDocument = new ArrayList();
				List otherDocument = new ArrayList();
				for(int i = 0; i < documentList.size(); i++){
					Map map = new HashMap(); 
					Document d = documentList.get(i);
					map.put("name", d.getName());
					map.put("author", d.getAuthor());
					map.put("keyWords", d.getKeyWords());
					map.put("abstractContent", d.getAbstractContent());
					map.put("documentPath", d.getDocumentPath());
					map.put("userEmail", d.getUserInfo().getEmail());
					if(d.getUserInfo().getId() == masterId){
						myDocument.add(map);
					}else{
						otherDocument.add(map);
					}
				}
				
				documentData.add(myDocument);
				documentData.add(otherDocument);
				
				JSONArray jsonList = JSONArray.fromObject(documentData);
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
