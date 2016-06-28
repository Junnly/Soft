<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<jsp:include page="pmainhead.jsp"></jsp:include>
<%@taglib prefix="s" uri="/struts-tags" %>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">

	        <div class="page-header">
		        <h1>Edit Professor</h1>
	        </div>

            <s:actionmessage cssClass="alert alert-danger"/>

	        <s:form method="post" action="pupdateprofessor" cssClass="form-horizontal" theme="simple">
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="PID">PID</label>		
                    <div class="col-sm-4">                                          
                        <s:textfield id="PID" name="PID" cssClass="form-control"/>  
                    </div>                                                                      
                    <div class="col-sm-4">                                                      
                        <s:fielderror fieldName="PID" />                                		
                    </div>                                                                      
                </div>                                                                          
                <div class="form-group">                                                        
                    <label class="col-sm-2 control-label" for="PSSN">PSSN</label>
                    <div class="col-sm-4">
                        <s:textfield id="PSSN" name="PSSN" cssClass="form-control"/>
                    </div>
                    <div class="col-sm-4">
                        <s:fielderror fieldName="PSSN" />
                    </div>
                </div>
				<div class="form-group">                                                        
                    <label class="col-sm-2 control-label" for="PName">PName</label>
                    <div class="col-sm-4">
                        <s:textfield id="PName" name="PName" cssClass="form-control"/>
                    </div>
                    <div class="col-sm-4">
                        <s:fielderror fieldName="PName" />
                    </div>
                </div>
				<div class="form-group">                                                        
                    <label class="col-sm-2 control-label" for="PBirthday">PBirthday</label>
                    <div class="col-sm-4">
                        <s:textfield id="PBirthday" name="PBirthday" cssClass="form-control"/>
                    </div>
                    <div class="col-sm-4">
                        <s:fielderror fieldName="PBirthday" />
                    </div>
                </div>
				<div class="form-group">                                                        
                    <label class="col-sm-2 control-label" for="PStatus">PStatus</label>
                    <div class="col-sm-4">
                        <s:textfield id="PStatus" name="PStatus" cssClass="form-control"/>
                    </div>
                    <div class="col-sm-4">
                        <s:fielderror fieldName="PStatus" />
                    </div>
                </div>
				<div class="form-group">                                                        
                    <label class="col-sm-2 control-label" for="DepartmentID">DepartmentID</label>
                    <div class="col-sm-4">
                        <s:textfield id="DepartmentID" name="DepartmentID" cssClass="form-control"/>
                    </div>
                    <div class="col-sm-4">
                        <s:fielderror fieldName="DepartmentID" />
                    </div>
                </div>
				<div class="form-group">                                                        
                    <label class="col-sm-2 control-label" for="PPwd">PPwd</label>
                    <div class="col-sm-4">
                        <s:textfield id="PPwd" name="PPwd" cssClass="form-control"/>
                    </div>
                    <div class="col-sm-4">
                        <s:fielderror fieldName="PPwd" />
                    </div>
                </div>				
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-4">
                        <s:submit value="update" cssClass="btn btn-primary"/>
                    </div>
                </div>
            </s:form>    
          	<s:form action="pmenu" >
          	<s:submit value="back to menu" cssClass="btn btn-primary"/>
        	</s:form>
        </div><!--/col-md-12--->
    </div><!--/row-->
</div><!--/container-->
<jsp:include page="pmainfoot.jsp"></jsp:include>
	