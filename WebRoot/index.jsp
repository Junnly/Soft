<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<html>
<meta http-equiv="Content-Type" content="text/html charset=utf-8" />
<title>课程管理登录</title>



<head>
<link rel="shortcut icon" href="img/favicon.ico" >
<style type="text/css">
body
{
background:url(img/6.jpg) top center no-repeat; background-size:cover;
}
*{
/*border:1px solid white;*/
}
#b{
	margin-top:50px;
}
#ls a{
	cursor: pointer;
	text-align: center;
	display: block;
	float:left;
	width:33.33%;
	height:2em;
	font:1em/2em "微软雅黑";
	padding:5px 0;
}
#ls{
	color:RGB(220,220,220);
width:30%;	
padding-right:45px;
padding-left:45px;
margin:20px auto;
overflow:hidden;
}
.box{
background-color:RGBA(220,220,220,0.5); 
border-radius: 20px;

margin-right: auto;
margin-left: auto;
width:30%;
padding:30px;
overflow:hidden;
text-align: center;
}
#ploginbox{display: none;}
#rloginbox{display: none;}
.logo{
margin-top:50px;
text-align:center;
}
.onnav{
	border-bottom:3px solid RGBa(220,220,220,0.5);
	/*background-color:rgba(220,220,220,0.5);*/
}
.inputbox{
padding-left:2em;
background-color:RGBA(200,200,200,0.6);
color:gray;
font:18px/18px "黑体";
font-weight:bold;
width:300px;

height:33px;
margin:20px auto;
border:1px solid gray;
}
.userinput{
BACKGROUND-IMAGE: url(img/user.png); 
BACKGROUND-REPEAT: no-repeat;
}
.passwordinput{
BACKGROUND-IMAGE: url(img/password.png); 
BACKGROUND-REPEAT: no-repeat;
}
#Location{
BACKGROUND-IMAGE: url(img/location.png); 
BACKGROUND-REPEAT: no-repeat;
}
#Age{
BACKGROUND-IMAGE: url(img/age.png); 
BACKGROUND-REPEAT: no-repeat;
}
.submit_btn{
border:1px solid gray;
margin-top:10px;
font:18px/25px "黑体";
width:100px;
height:50px;
background-color:RGBA(200,200,200,0.8);
color:black;
border-radius: 10px;
}
table{width:100%;margin:0 auto;}
td{padding-left:15px;padding-right:15px;text-align: center;}
</style>
<script language="JavaScript">
function disp(obj){
	//alert(obj.innerHTML);
	obj.className="onnav"; 
if(obj.innerHTML=="学生"){
	document.getElementById("rlogina").className="";
	document.getElementById("plogina").className=""; 
document.getElementById("sloginbox").style.display="block";
document.getElementById("ploginbox").style.display="none";
document.getElementById("rloginbox").style.display="none";
}
if(obj.innerHTML=="教授"){
	document.getElementById("rlogina").className="";
	document.getElementById("slogina").className=""; 
document.getElementById("ploginbox").style.display="block";
document.getElementById("sloginbox").style.display="none";
document.getElementById("rloginbox").style.display="none";
}
if(obj.innerHTML=="管理员"){
	document.getElementById("slogina").className="";
	document.getElementById("plogina").className=""; 
document.getElementById("rloginbox").style.display="block";
document.getElementById("ploginbox").style.display="none";
document.getElementById("sloginbox").style.display="none";
}
}

</script>
<script src="js/jquery-1.11.3.min.js"></script>
<script type="text/javascript" src="js/tooltips.js"></script>
<script type="text/javascript" src="js/login.js"></script>
</head>
<body >
<div class="logo">
<a href="index.jsp"><img height="50px"  src="img/logo1.png"></a>
</div>
<div id="b">
<div id="ls">
<a id="slogina" onclick="disp(this)" class="onnav">学生</a>
<a id="plogina" onclick="disp(this)">教授</a>
<a id="rlogina" onclick="disp(this)">管理员</a>
</div>
<div id="sloginbox" class="box";>
<%@ taglib uri="/struts-tags" prefix="s" %>
<s:form id="sform" cssClass="form" action="sloginprocess">
<table>
<tr>
<!--<td>帐号：</td>-->
<td><s:textfield cssClass="inputbox userinput" id="sID" value='学生账号'
onfocus="javascript:if(this.value=='学生账号'){this.value='';this.style.color='black';};"
onblur="if(this.value==''){this.style.color='gray';this.value='学生账号'}" name="SID" ></s:textfield></td>
</tr>
<tr>
<!--<td>密码：</td>-->
<td>
<s:textfield cssClass="inputbox passwordinput" id="spassword" 
value='密码' 
onfocus="javascript:if(this.value=='密码'){this.type='password';this.value='';this.style.color='black';};"
onblur="if(this.value==''){this.type='text';this.style.color='gray';this.value='密码'}" name="SPwd" ></s:textfield>
</td>
</tr>
</table>
<table>
<tr>
<td><s:submit cssClass="submit_btn" value="登录"></s:submit></td>
</tr>
</table>
</s:form>
</div>

<div id="ploginbox" class="box";>
<%@ taglib uri="/struts-tags" prefix="s" %>
<s:form id="pform" cssClass="form" action="ploginprocess">
<table>
<tr>
<!--<td>帐号：</td>-->
<td><s:textfield cssClass="inputbox userinput" id="pID" value='教授账号'
onfocus="javascript:if(this.value=='教授账号'){this.value='';this.style.color='black';};"
onblur="if(this.value==''){this.style.color='gray';this.value='教授账号'}" name="PID" ></s:textfield></td>
</tr>
<tr>
<!--<td>密码：</td>-->
<td>
<s:textfield cssClass="inputbox passwordinput" id="ppassword" 
value='密码' 
onfocus="javascript:if(this.value=='密码'){this.type='password';this.value='';this.style.color='black';};"
onblur="if(this.value==''){this.type='text';this.style.color='gray';this.value='密码'}" name="PPwd" ></s:textfield>
</td>
</tr>
</table>
<table>
<tr>
<td><s:submit cssClass="submit_btn" value="登录"></s:submit></td>
</tr>
</table>
</s:form>
</div>

<div id="rloginbox" class="box";>
<%@ taglib uri="/struts-tags" prefix="s" %>
<s:form id="rform" cssClass="form" action="rloginprocess">
<table>
<tr>
<!--<td>帐号：</td>-->
<td><s:textfield cssClass="inputbox userinput" id="rID" value='管理员账号'
onfocus="javascript:if(this.value=='管理员账号'){this.value='';this.style.color='black';};"
onblur="if(this.value==''){this.style.color='gray';this.value='管理员账号'}" name="RID" ></s:textfield></td>
</tr>
<tr>
<!--<td>密码：</td>-->
<td>
<s:textfield cssClass="inputbox passwordinput" id="rpassword" 
value='密码' 
onfocus="javascript:if(this.value=='密码'){this.type='password';this.value='';this.style.color='black';};"
onblur="if(this.value==''){this.type='text';this.style.color='gray';this.value='密码'}" name="RPwd" ></s:textfield>
</td>
</tr>
</table>
<table>
<tr>
<td><s:submit cssClass="submit_btn" value="登录"></s:submit></td>
</tr>
</table>
</s:form>
</div>


</div>

</body>
</html>