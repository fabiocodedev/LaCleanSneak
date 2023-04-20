<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>La Clean Sneak</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD"
	crossorigin="anonymous">
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.4/font/bootstrap-icons.css">
<link rel="stylesheet" href="assets/css/main.css">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN"
	crossorigin="anonymous"></script>
</head>
<body style="background-color: green">
	<nav class="navbar navbar-expand-lg bg-primary">
		<div class="container-fluid">
			<div class="col-3">
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>
				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0 d-flex align-items-center justify-content-center">
						<li class="nav-item"><a class="navbar-brand" href="home">
								<img alt="logo" src="assets/img/logoHome.png">
						</a></li>
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="home">Home</a></li>
						<li class="nav-item"><a class="nav-link" href="contact">Contact</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="add-product">AddProduits</a>
						</li>
					</ul>
				</div>
			</div>
			<div class="col-5">
				<h1 class="text-center">La Clean'Sneak</h1>
			</div>
			<div class="col-4">
					<c:if test="${empty utilisateur }">
					<div class="d-flex justify-content-around">
							<a href="inscription">
								<button class="btn btn-info btn-lg mx-3">S'inscrire</button>
							</a> <a href="login">
								<button class="btn btn-info btn-lg mx-3">Se
									connecter</button>
							</a>
					</div>
					</c:if>
					<c:if test="${!empty utilisateur }">
					<div class="d-flex justify-content-around align-items-center">
							<a class="nav-link text-light"><c:out
									value="Bonjour ${utilisateur.firstName } !"></c:out></a>
								<form method="post" action="logout">
								<a href="home">
									<button class="btn btn-info btn-lg mx-3">Se
										déconnecter</button>
								</a>
							</form>
					</div>
					</c:if>
				</div>
			</div>
	</nav>