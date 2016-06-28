<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<jsp:include page="pmainhead.jsp"></jsp:include>
<%@ taglib uri="/struts-tags" prefix="s" %>  
<script >  
var pid = ${PID};
</script>  
<h3>Course Records:</h3>    
			<table class="table table-striped">
			<tr>
			<td>CID</td>
			<td>courseID</td>
			<td>PID</td>
			<td>TimeArray</td>
			<td></td>
			</tr>
			<s:iterator value ="courseloglist">
			<tr>
			<td>${CID}</td>
			<td><s:property value = "courseID" /></td>
			<td>${requestScope.PID}</td>
			<td class="timeArray"><s:property value = "TimeArray" /></td>
			<td>
				<div class="btn-group">
                            <a href=
							"<s:url action="pview" method="selectCourse"  />?CID=${CID}&PID=${PID}"  
							class="btn btn-default"><span class="glyphicon glyphicon-eye-open"></span> Select</a>
				</div>
			</td>
			</tr> 
			</s:iterator>
			</table>
<h3>select Records:</h3>    
			<table class="table table-striped">
			<tr>
			<td>CID</td>
			<td>courseID</td>
			<td>PID</td>
			<td>TimeArray</td>
			<td></td>
			<td></td>
			</tr>
			<s:iterator value ="courseloglist">
			<script >
			var select ='<tr><td>${CID}</td><td>${courseID}</td><td>${PID}</td><td class="timeArray">${TimeArray}</td><td>	<div class="btn-group"><a href="<s:url action="pview" method="selectCourse"  />?CID=${CID}"  class="btn btn-default"><span class="glyphicon glyphicon-eye-open"></span> cancel</a></div><div class="btn-group"><a href="<s:url action="pgetroster"  />?CID=${CID}&PID=${PID}"  class="btn btn-default"><span class="glyphicon glyphicon-eye-open"></span> SubmitGrade</a></div></td></tr>';
				if(pid==${requestScope.PID}){
					document.write(select);
				}
			</script >
			</s:iterator>
			</table>  

<%@taglib prefix="s" uri="/struts-tags" %>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">

	        <div class="page-header">
	            <h1>Info</h1>
		    </div>
            <s:actionmessage cssClass="alert alert-danger"/>
            <table class="table table-striped">
                <tr>
                    <th>PID</th>
                    <th>PSSN</th>
                    <th>PName</th>
                    <th>PBirthday</th>
                    <th>PStatus</th>
                    <th>DepartmentID</th>
                    <th></th>
                </tr>   
                <tr>
                    <td>${PID}</td>
                    <td>${PSSN}</td>
                    <td>${PName}</td>
                    <td>${PBirthday}</td>
                    <td>${PStatus}</td>
                    <td>${DepartmentID}</td>
                    <td>
                        <div class="btn-group">
                            <a href="<s:url action="peditprofessor"/>?PID=${PID}&PSSN=${PSSN}&PName=${PName}&PBirthday=${PBirthday}&PStatus=${PStatus}&DepartmentID=${DepartmentID}"  class="btn btn-default"><span class="glyphicon glyphicon-edit"></span> Edit</a>
                        </div>
                   </td>
                </tr>
            </table>
        </div><!--/col-md-12--->
    </div><!--/row-->
</div><!--/container-->
<script language="JavaScript">
function trans(b){
	var day = new Array();
	day[0] = "一";
	day[1] = "二";
	day[2] = "三";
	day[3] = "四";
	day[4] = "五";
	day[5] = "六";
	day[6] = "日";
	var str="";
  	var flag=0;
  	var last=-1;
  	var f=0;
  	for(var i=0; i<77; i++)
   	{
    	if (i%11==0){
    		flag=0;
    		for(var j=i; j<i+11; j++){if (b[j]!='0'){flag=1;last=j;}}
			//alert(str);
			if(flag==1)
			{
				
				if (f!=0){str=str+'<br>';}
				str=str+'星期';
				str=str+day[i/11];
				str=str+': ';
				str+='第';
				f=1;
			}
		}
		if(flag==1)
		{
       		if (b[i]==1){
       			str+=(i%11+1);
    	   		if(i!=last){str+=',';}else{str+='节';}
			}
		}   
	}
   	return str;	
}
function showTimeString(){
	//var recordtable=document.getElementById("courseRecords");
	var a=document.getElementsByClassName("timeArray"); 
	//alert(a.length);
	for(var i=0; i<a.length; i++)
    {
       var str=trans(a[i].innerHTML);
       if(str!=""){a[i].innerHTML=str;}else{a[i].innerHTML="无开课时间";}
    }	
}
window.onload = showTimeString; 
</script>
<jsp:include page="pmainfoot.jsp"></jsp:include>
	