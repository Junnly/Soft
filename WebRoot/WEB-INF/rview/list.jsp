<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<jsp:include page="rmainhead.jsp"></jsp:include>


<%@taglib prefix="s" uri="/struts-tags" %>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">

	        <div class="page-header">
		<h3>Choose Records:</h3>  
			<table class="table table-striped">
		 	<tr>
			<th>SID</th>
            <th>CID</th>
			<th>Grade</th>
            </tr>  
			<s:iterator value ="chooselist">
			<tr>
			<td>${SID}</td>
			<td>${CID}</td>
			<td>${Grade}</td>
			</tr>
			</s:iterator>
			</table>
			<h3>Professor info:</h3>  
	       	<table class="table table-striped">
                <tr>
                    <th>PID</th>
                    <th>PSSN</th>
                    <th>PName</th>
                    <th>PBirthday</th>
                    <th>PStatus</th>
                    <th>DepartmentID</th>
                </tr>   
            <s:iterator value ="professorlist">
            		<tr>
                    <td>${PID}</td>
                    <td>${PSSN}</td>
                    <td>${PName}</td>
                    <td>${PBirthday}</td>
                    <td>${PStatus}</td>
                    <td>${DepartmentID}</td>
                    <td>
                        <div class="btn-group">
                            <a href="<s:url action="editprofessor"/>?PID=${PID}&PSSN=${PSSN}&PName=${PName}&PBirthday=${PBirthday}&PStatus=${PStatus}&DepartmentID=${DepartmentID}"  class="btn btn-default"><span class="glyphicon glyphicon-edit"></span> Edit</a>
                           <a href="<s:url action="rview" method ="delProfessor" />?PID=${PID}" class="btn btn-danger"><span class="glyphicon glyphicon-trash"></span> Delete</a>
                        </div>
                   </td>
                </tr>
                </s:iterator>   
            </table>
			<s:form action="editnewprofessor">
          	<s:submit value="add professor" cssClass="btn btn-primary"/>
        	</s:form>
			<br></br><br></br>
			<h3>Student info:</h3>  
	       	<table class="table table-striped">
                <tr>
                    <th>SID</th>
                    <th>SSSN</th>
                    <th>SName</th>
                    <th>SBirthday</th>
                    <th>SStatus</th>
                    <th>SGraduationDate</th>
                </tr>   
            <s:iterator value ="studentlist">
					<tr>				
                    <td>${SID}</td>
                    <td>${SSSN}</td>
                    <td>${SName}</td>
                    <td>${SBirthday}</td>
                    <td>${SStatus}</td>
                    <td>${SGraduationDate}</td>
                    <td>
                        <div class="btn-group">
                            <a href="<s:url action="editstudent"/>?SID=${SID}&SSSN=${SSSN}&SName=${SName}&SBirthday=${SBirthday}&SStatus=${SStatus}&SGraduationDate=${SGraduationDate}"  class="btn btn-default"><span class="glyphicon glyphicon-edit"></span> Edit</a>
                            <a href="<s:url action="rview" method ="delStudent" />?SID=${SID}" class="btn btn-danger"><span class="glyphicon glyphicon-trash"></span> Delete</a>
                        </div>
                   </td>		
                </tr>
                </s:iterator>   
            </table>
		    </div>
          	<s:form action="editnewstudent">
          	<s:submit value="add student" cssClass="btn btn-primary"/>
        	</s:form>
       </div><!--/col-md-12--->
    </div><!--/row-->
</div><!--/container-->
<jsp:include page="rmainfoot.jsp"></jsp:include>	