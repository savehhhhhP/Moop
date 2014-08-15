
function displayindexpage(){
	  $.ajax({
          type: "post",
          url: "displayindexpage.action",
          async: true,
          dataType: "json",
          success: function (data) {
        	  if(data[0]=="null"){
        		  document.getElementById('latestproject').innerText = "暂无内容";
        	  }
        	  else{
        		  var content1="";
        		  for (var i=0;i<data.length;i++){
                      content1 += "<div class='col-md-3'>" + 
                      "<li class='autumn-grid autumn-course-grid'><a href='/course/35' class='course-picture'>" +
                      "<img src='" + data[i]['picturePath'] + "'></a><h3 class='course-name'>" +
                      "<a href='/course/35'>" + data[i]['name'] + "</a></h3>" +
    					"<div class='course-about'>" + data[i]['introduction']  + "</div></li></div>";
        		  }
                  document.getElementById('latestproject').innerHTML = content1;
        	  }
          },
          error: function (XMLHttpRequest, textStatus, errorThrown) {
        	  
        	  alert(XMLHttpRequest.status); 
        	  alert(XMLHttpRequest.readyState); 
        	  alert(textStatus); 
              //alert(" ddd" + "ajax取数据失败"+errorThrown + "fff");
          }
   });
	  
	  
};