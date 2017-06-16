<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>地址选择列表</title>
<script type="text/javascript" src="js/AjaxRequest.js"></script>
</head>
<script type="text/javascript">
function onSuccess(){
	 alert("Success!");
	 document.getElementById("showResult").innerHTML=this.ajaxRuest.responseText;
}

function onFailed(){
	 alert("Failed"); 
}
 function doQuery(){
	 var params="deviceType=web&nocache="+new Date().getTime();
	 sendRequst("BookQuery?","POST",onFailed,onSuccess,params);
 }

</script>
<body>
	<input type="button" name="query" value="查询" onclick="doQuery()">
	<h5>查询结果:</h5>
	<div id="showResult"></div>
</body>
</html>