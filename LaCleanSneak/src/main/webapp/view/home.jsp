<div class="row m-1 rounded" style="background-color: green">
	<c:forEach items="${products }" var="product">
		<div class="card m-auto my-3 rounded" style="width: 18rem;">
			<!-- METTRE LE CHEMIN POUR ACCEDER AUX IMG -->
			<img
				src="<c:out value="assets/img/uploadProduct/${product.productPicPath}"></c:out>"
				class="card-img-top" alt="shoes">
			<div class="card-body">
				<h3 class="card-title text-center">
					<c:out value="${product.title}"></c:out>
				</h3>
				<p class="card-text">
					<c:out value="${product.description}"></c:out>
				</p>
				<div class="d-flex flex-row justify-content-around">
					<h5 class="card-text">
						<c:out value="${product.price} euros"></c:out>
					</h5>
					<a href="product?idProduct=${product.id}" class="btn btn-primary">Voir</a>
				</div>
			</div>
		</div>
	</c:forEach>
</div>