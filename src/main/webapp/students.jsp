<%@ page import="java.util.*,model.Student" %>
<table border="1">
<tr><th>Name</th><th>Email</th><th>Year</th></tr>
<%
for(Student s : (List<Student>)request.getAttribute("students")){
%>
<tr>
<td><%=s.name%></td>
<td><%=s.email%></td>
<td><%=s.year%></td>
</tr>
<% } %>
</table>
