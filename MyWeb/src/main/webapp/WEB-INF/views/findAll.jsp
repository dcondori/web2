<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
	<meta charset="UTF-8">
	<title>findAll</title>
	
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
				<article class="col-md-12 col-lg-12"> 
					<p>
						<h3>Alumnos!</h3>
					</p>
					<p>
						<div class="row">
							<div class="col-md-8">
								<div class="table-responsive">
									<table class="table table-striped table-bordered table-hover table-condensed">
						                <tr class="danger">
						                    <th>ID</th>
						                    <th>Nombre</th>
						                    <th>Sexo</th>
						                    <th>Pensión</th>
						                    <th style="text-align:center; width:170px">Acción</th>
						                </tr>
						                
						                <c:forEach var="card" items="${key_findAll}">
						                <tr>
						                    <td>${card.id_alumno}</td>
											<td>${card.nombre}</td>
											<td>${card.sexo}</td>
											<td>${card.pension}</td>
						                    <td style="text-align:center; width:170px"><a href="<c:url value='/findAll/edit/${card.id_alumno}'/>" class="btn btn-success btn-xs">Editar</a>
						                    	<a href="<c:url value='/findAll/delete/${card.id_alumno}'/>"
						                    	                onclick="return confirmDeleteID(<c:out value='${card.id_alumno}'/>)" class="btn btn-danger btn-xs">Eliminar</a></td>
						                </tr>	
						                </c:forEach>					                
						            </table>
								</div>
							</div>						
						</div>
					</p>

					<a href='<c:url value="/index"/>' class="btn btn-info">Index</a>

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