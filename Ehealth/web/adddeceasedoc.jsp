


<%@ include file="./doctorlevelmenu.html" %>

<!DOCTYPE HTML PBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
       
    <title>My JSP 'adddecease.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
        <script language="javascript">
		function ChkMandatoryField(F,T){
			var val= F.value;
			if(val==""){alert(T+" is mandatory");return false;}
		}
		function ChkNumField(F,T){
			var val = F.value;
			if(isNaN(val)==true||val==""){alert("Please enter numbers for "+T);return false;}
		}
		function ChkAlphaNumericField(F,T){
			var val = F.value;
			var pattern = /^([a-zA-Z0-9]{1,250})$/;
			if(!(pattern.test(val)==true)){alert("Please enter alphabets or numbers for "+T);return false;}
		}
		function ChkAlphaField(F,T){
			var val = F.value;
			var pattern = /^([a-zA-Z ]{1,250})$/;
			if(!(pattern.test(val)==true)){alert("Please enter text for "+T);return false;}
		}
		function ChkEmailField(F,T){
			var val = F.value;
			var pattern = /^([a-zA-Z0-9\_\.]{4,25})$/;
			if(!(pattern.test(val)==true)){alert("Please enter valid email for "+T);return false;}
		}
		function ChkDateField(F,T)
		{
			var val = F.value;
		    var pattern = /^[0-9]{4}-[0-9]{2}-[0-9]{2}$/;
		    if(!(pattern.test(val)==true)){alert("Please enter valid date format (yyyy-mm-dd) for "+T);return false;}
		}
		function validate()
		{
			//var frm = document.forms(0);
			if(ChkMandatoryField(frm.deceaseName,'deceaseName')==false) return false;
			if(ChkMandatoryField(frm.treatment,'treatment')==false) return false;
			if(ChkMandatoryField(frm.cure,'cure')==false) return false;
			if(ChkMandatoryField(frm.prevention,'prevention')==false) return false;
			if(ChkMandatoryField(frm.symptom1,'symptom1')==false) return false;
			if(ChkMandatoryField(frm.symptom2,'symptom2')==false) return false;
			if(ChkMandatoryField(frm.symptom3,'symptom3')==false) return false;
			
		}
                function setPostion(){
                    w = screen.availWidth;
                    h = screen.availHeight;
                    Lframe.style.posLeft=w/4;
                    Lframe.style.posTop=h/5;
                    document.getElementById('userName').focus();
                }
	</script>


  </head>
    
  <body bgcolor="white">
  <form action="./adsd" onsubmit="return validate()" name="frm"><center>
  <table border="0">
  <tr><td colspan="2" align="center"><font color="Green" >Add New Disease Details</font></td></tr>
  <tr><td>
  <font color="red">*</font>Disease Name: </td>
  <td><input type="text" name="deceaseName" maxlength="30"/></td>
  </tr>
  <tr><td><font color="red">*</font>Treatment: </td><td><textarea name="treatment" rows="5"></textarea></td></tr>
  <tr><td><font color="red">*</font>Cure: </td><td><input type="text" name="cure" /></td></tr>
  <tr><td><font color="red">*</font>Prevention: </td><td><input type="text" name="prevention" /></td></tr>
  <tr><td><font color="red">*</font>Symptom1: </td><td><input type="text" name="symptom1" /></td></tr>
  <tr><td>Symptom2: </td><td><input type="text" name="symptom2" /></td></tr>
  <tr><td>Symptom3: </td><td><input type="text" name="symptom3" /></td></tr>
        
  <tr><td></td><td align="left"><input type="submit" name="Add" value="Add"/></td>
  <br>
  </tr></table></center></form>
  </body >
  
</html>
<%@ include file="./footer.html" %>