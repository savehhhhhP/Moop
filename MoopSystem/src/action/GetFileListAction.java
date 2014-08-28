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

import com.opensymphony.xwork2.ActionContext;

import domain.Document;
import domain.Patent;
import domain.Thesis;
import domain.UserInfo;
import service.DocumentService;
import service.PatentService;
import service.ThesisService;
import service.UserService;

public class GetFileListAction {
	private static final long serialVersionUID = 1L;

	private UserService userService;
	private DocumentService documentService;
	private PatentService patentService;
	private ThesisService thesisService;
	private String projectId;

	public PatentService getPatentService() {
		return patentService;
	}

	public void setPatentService(PatentService patentService) {
		this.patentService = patentService;
	}

	public ThesisService getThesisService() {
		return thesisService;
	}

	public void setThesisService(ThesisService thesisService) {
		this.thesisService = thesisService;
	}

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

	public String execute() {
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
		if (session.containsKey("userEmail") && id > 0) {
			userEmail = session.get("userEmail").toString();
			userInfo = userService.findByEmail(userEmail);
			masterId = userInfo.getId();
			List<Document> documentList = documentService.selectByProjectId(id);
			//List documentData = new ArrayList();
			Map documentData = new HashMap();
			List<Patent> patentList = patentService.selectByProjectId(id);
			//List patentData = new ArrayList();
			Map patentData = new HashMap();
			List<Thesis> thesisList = thesisService.selectByProjectId(id);
			//List thesisData = new ArrayList();
			Map thesisData = new HashMap();
			
			if (documentList.size() != 0) {
				List myDocument = new ArrayList();
				List otherDocument = new ArrayList();
				for (int i = 0; i < documentList.size(); i++) {
					Map map = new HashMap();
					Document d = documentList.get(i);
					map.put("id", d.getId());
					map.put("name", d.getName());
					map.put("author", d.getAuthor());
					map.put("keyWords", d.getKeyWords());
					map.put("abstractContent", d.getAbstractContent());
					map.put("documentPath", d.getDocumentPath());
					map.put("userEmail", d.getUserInfo().getEmail());
					if (d.getUserInfo().getId() == masterId) {
						myDocument.add(map);
					} else {
						otherDocument.add(map);
					}
				}

				documentData.put("owner", myDocument);
				documentData.put("other", otherDocument);

			}

			if (patentList.size() != 0) {
				List myPatent = new ArrayList();
				List otherPatent = new ArrayList();
				for (int i = 0; i < patentList.size(); i++) {
					Map map = new HashMap();
					Patent p = patentList.get(i);
					map.put("id", p.getId());
					map.put("name", p.getName());
					map.put("patentNum", p.getPatentNum());
					map.put("applyDate", p.getApplyDate());
					map.put("author", p.getAuthor());
					map.put("keyWords", p.getKeyWords());
					map.put("abstractContent", p.getAbstractContent());
					map.put("organization", p.getOrganization());
					map.put("patentPath", p.getPatentPath());
					map.put("userEmail", p.getUserInfo().getEmail());
					if (p.getUserInfo().getId() == masterId) {
						myPatent.add(map);
					} else {
						otherPatent.add(map);
					}
				}

				patentData.put("owner", myPatent);
				patentData.put("other", otherPatent);

			}

			if (thesisList.size() != 0) {
				List myThesis = new ArrayList();
				List otherThesis = new ArrayList();
				for (int i = 0; i < thesisList.size(); i++) {
					Map map = new HashMap();
					Thesis t = thesisList.get(i);
					map.put("id", t.getId());
					map.put("name", t.getTopic());
					map.put("publishDate", t.getPublishDate());
					map.put("author", t.getAuthor());
					map.put("keyWords", t.getKeyWords());
					map.put("abstractContent", t.getAbstractContent());
					map.put("organization", t.getOrganization());
					map.put("thesisPath", t.getThesisPath());
					map.put("userEmail", t.getUserInfo().getEmail());
					if (t.getUserInfo().getId() == masterId) {
						myThesis.add(map);
					} else {
						otherThesis.add(map);
					}
				}

				thesisData.put("owner", myThesis);
				thesisData.put("other", otherThesis);
			}
			
			Map params = new HashMap();
			params.put("patent", patentData);
			params.put("thesis", thesisData);
			params.put("document", documentData);
			
			JSONArray array = JSONArray.fromObject(params);
			System.out.println(array);
			writer.write(array.toString());
		}else{
			writer.write("{\"0\":\"null\"}");
		}
		return null;
	}
}
