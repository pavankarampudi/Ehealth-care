<%@ include file="./doctorlevelmenu.html" %>

<HTML>
<Head><FONT  face="comic sans ms" size=3 COLOR=#006600><center><hr color=#99CC00>Purchase Items<hr color=#99CC00></CENTER></font></head>
<script language="javascript">
var isIE = document.all?true:false;

	function check()
	{
		a=frm.T1.value.length;
		if(a<=0)
		{
		alert("quantity not mentioned");
		return false;
		}
		else 
		{
		return true;
		}
		
	}
	function Ints()
	{
	var _ret=true;
	if (isIE)
	{
	if (window.event.keyCode < 46 || window.event.keyCode > 57) 
	{
	window.event.keyCode = 0;
	_ret = false;
	}
	}
	
	}
</script>

<BODY BGCOLOR>
    <CENTER>
<%@ page import="java.sql.*" %>
<%@page import="mladtr.dto.DBConn" %>

 <%
        Connection con=new DBConn().getConn();
	String user=(String)session.getAttribute("username");
        user=user.substring(0,4);
	System.out.println("cpurchase1              "+user); 
	Statement st=con.createStatement();
	Statement st1=con.createStatement();
	ResultSet rs=st.executeQuery("select p_code,p_name from prod_det order by p_code"); 
	System.out.println("-------------1------------");
%>
<br><br><br>
<form method="post" action="clientpurchasesdoc_jsp.jsp" name="frm" onsubmit="return check()">
	<FONT  face="comic sans ms" size=2 COLOR=#006600>Product Code & Name:</font>
        <select name="list" style='width:150'><br><br><br>
	<%
		 while(rs.next())
		  { 
			  String str = rs.getString(2);
			  System.out.println(str);
	 %>
		<option value=<%=str%>> <%=str%> </option>
	<%	  
		  }st.close();
		   st1.close();
		   
	%>
		
 
  </select>
  <br><br>
  <FONT  face="comic sans ms" size=2 COLOR=#006600>Number Of Units:</font>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  
  <input type=text name="T1" onkeypress="Ints()">
  <input type=hidden name="T2" value=<%=user%>>
  <br><input type="submit" value="Purchase">
  </form>
    </CENTER>
</BODY>
</HTML>
<%@ include file="./footer.html" %>