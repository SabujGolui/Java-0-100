<%@page import="Dto.Mydto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<h1>Welcome_to_view_students_information</h1>
<body>
	<%
	List<Mydto> list = (List<Mydto>) request.getAttribute("list");
	%>

	<table border="1">
		<tr>
			<th>Student_id</th>
			<th>Student_Name</th>
			<th>Student_Mobile</th>
			<th>Student_Email</th>
			<th>Student_gender</th>
			<th>Update</th>
			<th>Delete</th>
		 
		</tr>

		<%
		for (Mydto mydto : list) {
		%>

		<tr>
			<th><%=mydto.getId()%></th>
			<th><%=mydto.getName()%></th>
			<th><%=mydto.getMobile()%></th>
			<th><%=mydto.getEmail()%></th>
			<th><%=mydto.getGender()%></th>
			<th><a href="update?id=<%=mydto.getId()%>"><button>Update</button></a></th>
			<th><a href="delete?id=<%=mydto.getId()%>"><button>Delete</button></a></th>
		</tr>
		<%
		}
		%>


	</table>

</body>
</html>