<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 
 
	<div class="modal fade" id="uploadFile" tabindex="-1"
											role="dialog" aria-labelledby="myModalLabel"
											aria-hidden="true">
											<div class="modal-dialog">

												<form id="uploadFileForm" method="post"
													enctype="multipart/form-data" action="uploadfile.action">
													<div class="modal-content">
														<div class="modal-header">
															<button type="button" class="close" data-dismiss="modal"
																aria-hidden="true">&times;</button>
															<h4 class="modal-title" id="myModalLabel">上传文件</h4>
														</div>

														<div class="modal-body">
															<ul style="list-style:none;margin-top:7px;"
																id="course-item-list">
																<li><label for="fileName"
																	style="font-weight:normal;">文件名称</label> <input
																	class="form-control" id="fileName" name="fileName"
																	required="required"
																	style="margin-top:6px;width:80%;display:inline-block;"></input>
																</li>

																<li><label for="fileType"
																	style="font-weight:normal;">文件类型</label> <select
																	class="form-control" id="fileType" name="fileType"
																	required="required"
																	style="margin-top:6px;width:80%;display:inline-block;">
																		<option value="-1">---请选择---</option>
																		<option value="document">文档资料</option>
																		<option value="patent">专利</option>
																		<option value="thesis">论文</option>
																</select></li>


																<li id="patentNum" style="display: none;"><label
																	for="fileType" style="font-weight:normal;">专利号码</label>
																	<input id="patentNumInput" class="form-control"
																	required="required"
																	style="margin-top:6px;width:80%;display:inline-block;" />
																</li>

																<li id="patentDate" style="display: none;"><label
																	for="fileType" style="font-weight:normal;">申请日期</label>
																	<input id="patentDateInput" class="form-control"
																	required="required"
																	style="margin-top:6px;width:80%;display:inline-block;"
																	onclick="WdatePicker()" /></li>

																<li id="patentOrg" style="display: none;"><label
																	for="patentOrgInput" style="font-weight:normal;">机构名称</label>
																	<input id="patentOrgInput" class="form-control"
																	required="required"
																	style="margin-top:6px;width:80%;display:inline-block;" />
																</li>

																<li id="thesisOrg" style="display: none;"><label
																	for="thesisOrgInput" style="font-weight:normal;">机构名称</label>
																	<input id="thesisOrgInput" class="form-control"
																	required="required"
																	style="margin-top:6px;width:80%;display:inline-block;" />
																</li>


																<li id="thesisDate" style="display: none;"><label
																	for="thesisDateInput" style="font-weight:normal;">出版日期</label>
																	<input id="thesisDateInput" class="form-control"
																	required="required"
																	style="margin-top:6px;width:80%;display:inline-block;"
																	onclick="WdatePicker()" /></li>
																	
																	<li id="thesisPagination" style="display: none;"><label
																	for="thesisPaginationInput" style="font-weight:normal;">论文页码</label>
																	<input id="thesisPaginationInput" class="form-control"
																	required="required"
																	style="margin-top:6px;width:80%;display:inline-block;"/></li>
																	
																<li><label for="fileKeywords"
																	style="font-weight:normal;">关键词语</label> <input
																	class="form-control" id="fileKeywords"
																	name="fileKeywords" required="required"
																	style="margin-top:6px;width:80%;display:inline-block;"></input>
																</li>


																<li><label for="fileDescription"
																	style="font-weight:normal;">文件描述</label> <textarea
																		class="form-control" id="fileDescription"
																		name="fileDescription" required="required"
																		style="margin-top:6px;width:80%;min-height:100px;display:inline-block;"></textarea>
																</li>


																<li><label for="fileAuthor"
																	style="font-weight:normal;">作者列表</label> <input
																	class="form-control" id="fileAuthor" name="fileAuthor"
																	required="required"
																	style="margin-top:6px;width:80%;display:inline-block;"></input>
																</li>

																<li><label for="1" style="font-weight:normal;">选择文件</label>
																	<input type="text" class="form-control" id="filePath"
																	name="filePath" required="required"
																	style="margin-top:6px;width:64%;display:inline-block;" />
																	<input type="file" name="file" id="1"
																	onchange="readFile(this)" id="filePath" name="filePath"
																	style="display:none;" />
																	<button type="button" id="btnSelect" name="btnSelect"
																		onclick="selectfile()" class="btn btn-primary">选择文件</button>
																</li>
															</ul>
														</div>

														<div class="modal-footer">
															<button type="button" class="btn btn-default"
																data-dismiss="modal">Close</button>
															<button type="submit" class="btn btn-primary">确定</button>
														</div>
													</div>
												</form>
												<!-- /.modal-content -->
											</div>
											<!-- /.modal-dialog -->
										</div>
										<!-- /.modal -->



 
</html>
