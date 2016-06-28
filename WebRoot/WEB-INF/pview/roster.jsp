<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
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
	            <h1>Roster</h1>
		    </div>
            <s:actionmessage cssClass="alert alert-danger"/>
			<h3>Professor info:</h3>  
	       	<table class="table table-striped">
                <tr>
                    <th>SID</th>
                    <th>CID</th>
                    <th>Grade</th>
                   
                </tr>   
                
            <s:iterator value ="Rosterlist">
            		
            		<tr>
                    <td class="sids">${SID}</td>
                    <td class="cids">${CID}</td>
                   	
                    <td><input class="grades" type='text' name='Grade' value=${Grade}></td>
                    <td>
                        <div class="btn-group">
                            <a onclick="roster(this)"  class="btn btn-default"><span class="glyphicon glyphicon-edit"></span>update</a>
                        </div>
                   </td>
                </tr>
                
                </s:iterator>   
            </table>
        </div><!--/col-md-12--->
    </div><!--/row-->
</div><!--/container-->
<script language="JavaScript">
function roster(aa){
	var a=aa.parentNode.parentNode.parentNode;
	//alert(a);
	var g=a.getElementsByClassName("grades");//getElementsByTagName
	var s=a.getElementsByClassName("sids");//getElementsByTagName
	var c=a.getElementsByClassName("cids");//getElementsByTagName
	//alert(t[0].value);
	var gr=g[0].value;
	var si=s[0].innerHTML;
	var ci=c[0].innerHTML;
	window.location.href="<s:url action="psubmitgrade"/>?SID="+si+"&CID="+ci+"&Grade="+gr+"&PID=${PID}"; 	
	//href="" 
} 
</script>
</body>
</html>
	