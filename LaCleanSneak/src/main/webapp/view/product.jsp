<div class="row m-1" style="background-color: green">
	<c:if test="${empty utilisateur }">
	<div class="d-flex container align-items-center justify-content-center" style="height: 500px;">
		<h2 class="">Vous devez vous connecter pour consulter cet article !</h2>
	</div>	
	</c:if>
	<c:if test="${!empty utilisateur }">
		<div class="container d-flex justify-content-around">
			<div class="col-4 m-3" style="width: 25rem; height: 20rem;">
				<img
					src="<c:out value="assets/img/uploadProduct/${product.productPicPath}"></c:out>"
					class="card-img-top object-fit-cover h-100" alt="shoes">
			</div>
			<div class="col-6 m-3">
				<div class="">
					<h3 class="text-center m-3">
						<c:out value="${product.title}"></c:out>
					</h3>
					<p class="m-3">
						<c:out value="${product.description}"></c:out>
					</p>
				</div>
				<div class="d-flex justify-content-around align-self-end">
					<h5 class="card-text">
						<c:out value="${product.price} euros"></c:out>
					</h5>
					<a href="card?idProduct=${product.id}" class="btn btn-primary">Ajouter
						au panier</a>
				</div>
			</div>
		</div>
	</c:if>
</div>