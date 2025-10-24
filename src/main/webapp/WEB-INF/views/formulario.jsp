<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Agregar contacto</title>
<!-- Bootstrap CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<div class="container mt-5">
		<h2>Agregar Contacto</h2>
		<form action="guardar" method="post">
		    <div class="mb-3">
		    	<label for="nombre" class="form-label">Nombre</label>
		    	<input type="text" class="form-control" id="nombre" name="nombre" required>
		  	</div>
		    <div class="mb-3">
		    	<label for="correo" class="form-label">Correo</label>
		    	<input type="email" class="form-control" id="correo" name="correo" required>
		  	</div>
		  	<div class="mb-3">
		    	<label for="telefono" class="form-label">Telefono</label>
		    	<input type="text" class="form-control" id="telefono" name="telefono" required>
		  	</div>
		    <button type="submit" class="btn btn-primary">Agregar</button> 
		</form>
	</div>
	
	<!-- Bootstrap JS (opcional si necesitas componentes interactivos) -->
	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</body>
</html>