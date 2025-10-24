<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Lista de contactos</title>
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">

    <div class="container mt-5">
        <h2 class="mb-4 text-center">Listado de contactos</h2>

        <table class="table table-bordered table-hover table-striped">
            <thead class="table-primary">
                <tr>
                    <th>Nombre</th>
                    <th>Correo</th>
                    <th>Telefono</th>
                </tr>
            </thead>
            <tbody>
            	<c:if test="${empty contactos}">
            		<tr>
			        	<td colspan="3" class="text-center text-muted">No hay contactos registrados</td>
			        </tr>
			    </c:if>
			
			    <c:if test="${not empty contactos}">
			            <c:forEach var="c" items="${contactos}">
			                <tr>
			                    <td><c:out value="${c.nombre}" /></td>
			                    <td><c:out value="${c.correo}" /></td>
			                    <td><c:out value="${c.telefono}" /></td>
			                </tr>
			            </c:forEach>
			    </c:if>
            </tbody>
        </table>
        <a href="formulario" class="btn btn-primary m-2">Agregar contacto</a>
    </div>

<!-- Bootstrap JS (opcional si usas componentes interactivos) -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>
