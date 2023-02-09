<%@ include file="/views/cabecera.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<title>Insert title here</title>
</head>
<body>
	<div class="container shadow">
		<h1 class="text-center">Lista de alumnos</h1>
	</div>

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
			<c:forEach var="alumno" items="${miModelo.ListaAlumnos}">
				<!-- foreach(alumno in listalumnos) -->
				<tbody>

					<td><c:out value="${alumno.nombre}" /></td>
					<td><c:out value="${alumno.apellidos}" /></td>
					<td><c:out value="${alumno.direccion}" /></td>
					<td><c:out value="${alumno.curso}" /></td>
					</tr>
			</c:forEach>
			<a class="btn btn-primary">ir al formulario Alumo</a>
	</div>
</body>
</html>