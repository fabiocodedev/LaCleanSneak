<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>La Clean Sneak</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-GLhlTQ8iRABdZLl6O3oVMWSktQOp6b7In1Zl3/Jr59b6EGGoI1aFkw7cmDA6j6gD" crossorigin="anonymous">
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.10.4/font/bootstrap-icons.css">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha1/dist/js/bootstrap.bundle.min.js" integrity="sha384-w76AqPfDkMBDXo30jS1Sgez6pr3x5MlQ1ZAGC+nuZB+EYdgRZgiwxhTBTkF7CXvN" crossorigin="anonymous"></script>
</head>
<body style="background-color: green">
<nav class="navbar navbar-expand-lg bg-primary">
  <div class="container-fluid">
      <a class="navbar-brand" href="home">
    <img alt="logo" src="assets/img/logoHome.png">
    </a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
      <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse" id="navbarSupportedContent">
      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
        <li class="nav-item">
          <a class="nav-link active" aria-current="page" href="home">Home</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="contact">Contact</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="product">Produits</a>
        </li>
      </ul>
        <h1>La Clean'Sneak</h1>
      <!-- <form class="d-flex" role="search">
        <input class="form-control me-2" type="search" placeholder="Recherche" aria-label="Search">
        <button class="btn btn-success" type="submit">Recherche</button>
      </form> -->


				<c:if test="${empty utilisateur }">
					<a href="inscription">
						<button class="btn btn-info btn-lg mx-3 rounded">S'inscrire</button>
					</a>
					<a href="login">
						<button class="btn btn-info btn-lg mx-3 rounded">Se
							connecter</button>
					</a>
				</c:if>

				<c:if test="${not empty utilisateur }">
					<h3 class="text-light">
						Bonjour ,
						<c:out value="${utilisateur.prenom } ${utilisateur.nom }"></c:out>
					</h3>
					<form method="post" action="logout">
					<a href="home">
						<button class="btn btn-info btn-lg mx-3 rounded">Se déconnecter</button>
					</a>
					</form>
				</c:if>

				<!-- <a href="inscription">
        <button class="btn btn-info btn-lg mx-3 rounded" type="button">Inscription</button>
      </a>
      <a href="login">
        <button class="btn btn-info btn-lg" type="button">Connection</button>
      </a> -->
      <a class="nav-link m-3"><c:out value="${utilisateur.prenom }" default="Vous n'êtes pas connecté"></c:out></a>
    </div>
  </div>
</nav>