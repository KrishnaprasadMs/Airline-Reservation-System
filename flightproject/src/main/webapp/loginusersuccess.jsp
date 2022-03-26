<%@ page import="java.sql.*"%>
<%@ page import="java.util.*"%>
<%!
    Connection con;
    PreparedStatement ps1, ps2;
    public void jspInit()
    {
        try
        {
            //loading the driver           
            Class.forName("org.sqlite.JDBC");
            //establish the connection
            con = DriverManager.getConnection("jdbc:sqlite:E:\\QuestProgram\\flightprojectnew\\flightproject\\flightproject\\projectflightdb.db");
            //create statement object
            ps1 = con.prepareStatement("select count(*) from register where email = ? and password=?");
            ps2 = con.prepareStatement("select * from register");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
%>
<%
    String param = request.getParameter("s1");
    if(param =="link")
    {
        ResultSet rs = ps2.executeQuery();
        out.println("<table>");
        while(rs.next())
        {
            out.println("<tr>");
            out.println("<td>"+rs.getString(1)+"</td>");
            out.println("<td>"+rs.getString(2)+"</td");
            out.println("</tr>");
        }
        out.println("</table>");
        rs.close();
    }
    else
    {
        //write jdbc code for authentication
        String user = request.getParameter("email");
        String pass = request.getParameter("password");
        //set form data as param value
        ps1.setString(1,user);
        ps1.setString(2,pass);
        //excute the query
        ResultSet rs = ps1.executeQuery();
        int cnt = 0;
        if (rs.next())
            cnt = rs.getInt(1);
        if(cnt == 0)
            //out.println("<b><i><font color=red>Invalid credential</fonr></i></b>");
        	// out.print("Inavlid User ");
        	 {
        		 %><input type="submit" name="name" value="Button" align="right"> 
        		  
        		 <script type="text/javascript">
        		 alert("Invalid User");
        		 </script>
        		 <% }
        else
        {
        	 response.sendRedirect("userhome2.html");
        }
    }
%>
<%!
    public void jspDestroy()
    {
        try
        {
            //colse
            ps1.close();
            ps2.close();
            con.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }
%>