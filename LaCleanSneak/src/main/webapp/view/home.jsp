<div class="row m-1 rounded" style="background-color: green">

<c:forEach items="${products }" var="product">
							
	<div class="card m-auto my-3 rounded" style="width: 18rem;">
		<!-- METTRE LE CHEMIN POUR ACCEDER AUX IMG -->
		<img src="<c:out value="assets/img/uploadProduct/${product.productPicPath}"></c:out>" class="card-img-top" alt="shoes">
		<div class="card-body">
			<h5 class="card-title"><c:out value="${product.title}"></c:out></h5>
			<p class="card-text"><c:out value="${product.description}"></c:out></p>
			<p class="card-text"><c:out value="${product.price}"></c:out></p>
			<a href="" class="btn btn-primary">Achete !</a>
		</div>
	</div>
</c:forEach>



</div>