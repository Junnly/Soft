<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<jsp:include page="smainhead.jsp"></jsp:include>
<%@ taglib uri="/struts-tags" prefix="s" %>  
  <h3>Choose Records:	</h3>  

            <table id="courseRecords" style="text-align:center;width:auto;" class="table table-striped">
			
		
			
			</table>
			<s:iterator value ="courseRecordList" var="TimeArray">
 <div id="timeArray"><s:property value = "TimeArray" /></div>
</s:iterator>
<script language="JavaScript">
function showCourseRecords(){
	//var =document.getElementById("courseRecords");
	var xx=document.getElementById("timeArray");
	var a=xx.innerHTML;
	var b=document.getElementById("courseRecords");
	//alert(a);
	var str="<tr><th>节次</th><th>一</th><th>二</th><th>三</th><th>四</th><th>五</th><th>六</th><th>日</th></tr>";
	
	for(var i=0;i<11;i++){
	 str+="<tr>";
	 str+="<th>"+(i+1)+"</th>";
	 for(var j=0;j<7;j++){
	 var x=j*11+i;
	 if(a[x]==0){str+='<td style="width:30px;height:20px;background-color:white; ">';}//<td style=width=30px;height=20px;background-color=white; >
	 if(a[x]==1){str+='<td style="width:30px;height:20px;background-color:green; ">';}
	 str+="</td>";
	 }
	 str+="</tr>";
	}
	b.innerHTML=str;
	xx.style.display="none";
}
window.onload = showCourseRecords; 
</script>
<jsp:include page="smainfoot.jsp"></jsp:include>