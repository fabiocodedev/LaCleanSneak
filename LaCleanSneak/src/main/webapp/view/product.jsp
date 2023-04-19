<div class="row m-1 container" style="background-color: green">
	<h1 class="text-center m-5">AJOUT D'UN PRODUIT</h1>
	<!-- MULTIPART OBLIGATOIRE POUR L'UPLOAD DE FICHIERS IMG/FILES/... -->
	<form method="post" action="product" enctype="multipart/form-data" >
		<div class="row justify-content-around">
			<div class="col-5 mb-3">
				<label for="title" class="form-label">Titre :</label>
				<input type="text" class="form-control mb-3" id="title" name="title" required>
				
				<label for="description" class="form-label">Description :</label>
				<textarea class="form-control mb-3" id="description" name="description" required></textarea>
				<!-- <input type="text" class="form-control mb-3" id="description" name="description"> -->
				
				<label for="price" class="form-label">Prix :</label>
				<div class="input-group">
					<input type="number" min="0,01" step="0,01" class="form-control mb-3" id="price" name="price" required>
					<span class="input-group-text mb-3">&euro;</span>
			    </div>
			</div>
		
			<div class="col-5 mb-3">
				<label for="download_img" class="form-label">Photo du produit :</label>
				<input type="file" id="download_img" class="form-control mb-1" name="productPicPath" accept=".jpg,.png" required>

				<a href="product?add-product=1">
				<button class="btn btn-primary" type="button">
						<i class="bi bi-plus-circle"></i>
				</button>
				</a>
				<input type="image" class="form-control mt-3"
						src="assets/img/image_placeholder.jpg"
						name="imageUpload"
						>
			</div>
		</div>
		<div class="container d-flex justify-content-center">
				<button type="submit" class="btn btn-primary mt-3">Submit</button>
		</div>
		
	</form>
</div>