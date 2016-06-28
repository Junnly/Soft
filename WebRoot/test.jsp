<!DOCTYPE html>
<%@taglib prefix="s" uri="/struts-tags" %>
<html lang="en">
<head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>info</title>
    <link href="${pageContext.request.contextPath}/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/css/app.css" rel="stylesheet">
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">

	        <div class="page-header">
		<h3>Choose Records:</h3>  
			<table class="table table-striped">
			<s:set name = "chooselist" value = "{'10','11'}" />
			<s:iterator value ="chooselist" id ="SID" >
			<tr>
			<td>${SID}</td>
			<s:form action="edit">
			<td colspan="2"><div class="formButton"><input type="submit" value="Submit" id="exampleSubmit_0" class="btn btn-primary"/>
			</div></td>
			</s:form>
			</tr>
			</s:iterator>
</div><!--/container-->
</body>
</html>
	