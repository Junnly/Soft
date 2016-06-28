<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<jsp:include page="smainhead.jsp"></jsp:include>

<%@taglib prefix="s" uri="/struts-tags" %>

<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">

	        <div class="page-header">
		        <h1>Edit Info</h1>
	        </div>

            <s:actionmessage cssClass="alert alert-danger"/>

	        <s:form method="post" action="supdatestudent" cssClass="form-horizontal" theme="simple">
                <div class="form-group">
                    <label class="col-sm-2 control-label" for="SID">SID</label>		
                    <div class="col-sm-4">                                          
                        <s:textfield id="SID" name="SID" cssClass="form-control"/>  
                    </div>                                                                      
                    <div class="col-sm-4">                                                      
                        <s:fielderror fieldName="SID" />                                		
                    </div>                                                                      
                </div>                                                                          
                <div class="form-group">                                                        
                    <label class="col-sm-2 control-label" for="SSSN">SSSN</label>
                    <div class="col-sm-4">
                        <s:textfield id="SSSN" name="SSSN" cssClass="form-control"/>
                    </div>
                    <div class="col-sm-4">
                        <s:fielderror fieldName="SSSN" />
                    </div>
                </div>
				<div class="form-group">                                                        
                    <label class="col-sm-2 control-label" for="SName">SName</label>
                    <div class="col-sm-4">
                        <s:textfield id="SName" name="SName" cssClass="form-control"/>
                    </div>
                    <div class="col-sm-4">
                        <s:fielderror fieldName="SName" />
                    </div>
                </div>
				<div class="form-group">                                                        
                    <label class="col-sm-2 control-label" for="SBirthday">SBirthday</label>
                    <div class="col-sm-4">
                        <s:textfield id="SBirthday" name="SBirthday" cssClass="form-control"/>
                    </div>
                    <div class="col-sm-4">
                        <s:fielderror fieldName="SBirthday" />
                    </div>
                </div>
				<div class="form-group">                                                        
                    <label class="col-sm-2 control-label" for="SStatus">SStatus</label>
                    <div class="col-sm-4">
                        <s:textfield id="SStatus" name="SStatus" cssClass="form-control"/>
                    </div>
                    <div class="col-sm-4">
                        <s:fielderror fieldName="SStatus" />
                    </div>
                </div>
				<div class="form-group">                                                        
                    <label class="col-sm-2 control-label" for="SGraduationDate">SGraduationDate</label>
                    <div class="col-sm-4">
                        <s:textfield id="SGraduationDate" name="SGraduationDate" cssClass="form-control"/>
                    </div>
                    <div class="col-sm-4">
                        <s:fielderror fieldName="SGraduationDate" />
                    </div>
                </div>
				<div class="form-group">                                                        
                    <label class="col-sm-2 control-label" for="SPwd">SPwd</label>
                    <div class="col-sm-4">
                        <s:textfield id="SPwd" name="SPwd" cssClass="form-control"/>
                    </div>
                    <div class="col-sm-4">
                        <s:fielderror fieldName="SPwd" />
                    </div>
                </div>				
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-4">
                        <s:submit value="update" cssClass="btn btn-primary"/>
                    </div>
                </div>
            </s:form>    
          	<s:form action="sview" >
          	<s:submit value="back to menu" cssClass="btn btn-primary"/>
        	</s:form>
        </div><!--/col-md-12--->
    </div><!--/row-->
</div><!--/container-->
<jsp:include page="smainfoot.jsp"></jsp:include>