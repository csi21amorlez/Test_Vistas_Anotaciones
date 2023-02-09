<%@page import="ejemploWebClase.entidades.Alumno"%>
<%@page import="java.util.ArrayList"%>
<%@ include file="/views/cabecera.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
</head>
<body>

	<div class="container shadow">
		<table class="table table-dark">
			<thead>
				<tr>
					<th scope="col">Nombre</th>
					<th scope="col">Apellidos</th>
					<th scope="col">Direccion</th>
					<th scope="col">Curso</th>
				</tr>
			</thead>
			<%
			ArrayList<Alumno> listAlumno = (ArrayList<Alumno>) request.getAttribute("listAlumno");
			%>


			<tbody>
				<%
				for (Alumno a : listAlumno) {
				%>
				<td><p><%=a.getNombre() %></p></td>
				<td><p><%=a.getApellidos() %></p></td>
				<td><p><%=a.getDireccion() %></p></td>
				<td><p><%=a.getCurso() %></p></td>
				</tr>
				<%
				}
				%>
			</tbody>

			</div>
</body>
</html>