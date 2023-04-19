package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bean.Product;
import dao.ProductDao;

class ProductTest {
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.err.println("Debut de la class de test ProductTest !");
	}


	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Debut du test !");
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Fin du test !");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.err.println("Fin de la class de test ProductTest !");
	}
	
	Product produit = new Product();
	ProductDao pdao = new ProductDao();	
	
	@Test
	public void testCreat() {
		
		produit = new Product("chaussure","Lorem ipsum",10,"C:\\Users\\bourg\\OneDrive\\Bureau\\WorkspaceJ2E\\LaCleanSneak\\src\\main\\webapp\\assets\\img\\1.jpg");
		assertTrue(pdao.create(produit));

	}
//	@Test
//	public void testRead() {
//		
//		ArrayList<Product> productsList = new ArrayList<>();
//		assertArrayEquals(productsList,pdao.read());
//		
//	}
	@Test
	public void testUpdate() {
		
		produit = new Product();
		assertTrue(pdao.update(produit));
		
	}
	@Test
	public void testDelete() {
		
		produit = new Product();
		assertTrue(pdao.delete(produit));
		
	}
//	@Test
//	public void testFindById() {
//		
//		produit = new Product(1);
//		assertTrue(pdao.findById(produit));
//		
//	}

}
