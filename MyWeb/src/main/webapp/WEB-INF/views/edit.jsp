<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<meta charset="UTF-8">
	<title>edit</title>
	
	<link href='<c:url value="/css/MyStyle.css"/>' rel="stylesheet">
	<script src='<c:url value="/js/MyCode.js"/>' type="text/javascript"></script>

	<meta name="viewport" content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" 
	      integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">

	<!-- CSS -->
	<style type="text/css">
		header {
			background:#2c3e50;
			color:#fff;
		}
		section {
			background:#f2f2f2;
		}
		footer {
			background:#16a085;
			color:#fff;
		}
	</style>

</head>
<body>
	<!-- CODE -->
	<div class="container">
		<br>
		<header>
			<div class="container">
				<h1>Spring Boot!</h1>
			</div>
		</header>
		
		<section>
			<div class="container">
				<article class="col-md-6 col-lg-6"> 
					<p>
						<h3>Alumno!</h3>
					</p>
					<p>
						<form:form name="" modelAttribute="alumno" method="post">
							<div class="form-group">
					            <label for="id_alumno">Id Alumno:</label>
					            <div class="row">
					            	<div class="col-md-6">
					            		<form:input class="form-control" path="id_alumno" readonly="true" placeholder="Id Alumno:"/>
					            	</div>
					            </div>
					        </div>

							<div class="form-group">
					            <label for="nombre">Nombre:</label>
					            <form:input class="form-control" path="nombre" onchange="return trimText(this)" autofocus="autofocus" placeholder="Nombre:"/>
					            <form:errors path="nombre" cssClass="error"/>
					        </div>
					        <div class="form-group">
					            <label for="opcion">Sexo:</label>
					            <form:select class="form-control" path="sexo" id="opcion">
					                <form:option value="">-- Seleccione --</form:option>
					                <form:option value="M">Masculino</form:option>
					                <form:option value="F">Femenino</form:option>
					            </form:select>
					            <form:errors path="sexo" cssClass="error"/>
					        </div>
					        <div class="form-group">
					            <label for="pension">Pensión:</label>
					            <form:input class="form-control" path="pension" placeholder="Pensión:"/>
					            <form:errors path="pension" cssClass="error"/>
					        </div>

					        <div class="row">
					        	<div class="col-md-3">
					        		<button type="submit" name="btnGuardar" class="btn btn-block btn-primary">Guardar</button>	            
					        	</div>
					        	<div class="col-md-3">
					        		<a href='<c:url value="/index"/>' class="btn btn-block btn-info">Index</a>
					        	</div>
					        </div>
						</form:form>
					</p>

					<br>
					<br>
				</article>
			</div>
		</section>		

		<footer>
	        <div class="container">
	            <h4>My Company &copy; 2017</h4>
	        </div>
	    </footer>
	</div>	
	
	<script src="https://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js" 
	        integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa" crossorigin="anonymous"></script>

	<!-- JS/JQuery -->
	<script type="text/javascript">
		
	</script>

</body>
</html>