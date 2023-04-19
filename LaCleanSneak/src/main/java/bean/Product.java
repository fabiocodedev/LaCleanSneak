package bean;

public class Product {

	private int id;
	private String title;
	private String description;
	private int price;
	private String productPicPath;
	
	public Product() {
	}
	
	public Product(int id) {
		this.id = id;
	}
	
	public Product(String title, String description, int price, String productPicPath) {
		this.title = title;
		this.description = description;
		this.price = price;
		this.productPicPath = productPicPath;
	}

	public Product(int id, String title, String description, int price, String productPicPath) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.price = price;
		this.productPicPath = productPicPath;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getProductPicPath() {
		return productPicPath;
	}

	public void setPicPath(String productPicPath) {
		this.productPicPath = productPicPath;
	}
	
}
