<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<jsp:include page="smainhead.jsp"></jsp:include>
<%@ taglib uri="/struts-tags" prefix="s" %>  
  
<h3>Course Records:</h3>  
			<table id="courseRecords" class="table table-striped">
			<s:iterator value ="courselist">
			<tr>
			<td>${CID}</td>
			<td><s:property value = "courseID" /></td>
			<td><s:property value = "PID" /></td>
			<td class="timeArray"><s:property value = "TimeArray" /></td>
			<td>
				<div class="btn-group">
                            <a href=
							"<s:url action="sloginprocess" method="chooseCourse"  />?CID=${CID}&SID=${SID}"  
							class="btn btn-default"><span class="glyphicon glyphicon-eye-open"></span> 选课</a>
				</div>
			</td>
			</tr>
			</s:iterator>
			</table>
<h3>Choose Records:	</h3>  
			<s:actionmessage cssClass="alert alert-danger"/>
            <table class="table table-striped">
            <tr>
    	        <th>CID</th>
    	        <th></th>
				<th>SID</th>
			</tr> 			
			<s:iterator value ="chooselist">
			<tr>
			<td>${CID} </td>
			<td>&nbsp;&nbsp;&nbsp;</td>
			<td>${SID} </td>
			</td>
			</tr>
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
                    <th>SID</th>
                    <th>SSSN</th>
                    <th>SName</th>
                    <th>SBirthday</th>
                    <th>SStatus</th>
                    <th>SGraduationDate</th>
                </tr>   
                <tr>
                    <td>${SID}</td>
                    <td>${SSSN}</td>
                    <td>${SName}</td>
                    <td>${SBirthday}</td>
                    <td>${SStatus}</td>
                    <td>${SGraduationDate}</td>
                    <td>
                        <div class="btn-group">
                            <a href="<s:url action="seditstudent"/>?SID=${SID}&SSSN=${SSSN}&SName=${SName}&SBirthday=${SBirthday}&SStatus=${SStatus}&SGraduationDate=${SGraduationDate}"  class="btn btn-default"><span class="glyphicon glyphicon-edit"></span> Edit</a>
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
	var recordtable=document.getElementById("courseRecords");
	var a=recordtable.getElementsByClassName("timeArray"); //获取table下的td
	//alert(a.length);
	for(var i=0; i<a.length; i++)
    {
       var str=trans(a[i].innerHTML);
       if(str!=""){a[i].innerHTML=str;}else{a[i].innerHTML="无开课时间";}
    }	
}
window.onload = showTimeString; 
</script>
<jsp:include page="smainfoot.jsp"></jsp:include>