package test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import bean.User;
import dao.UserDao;

class UserTest {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.err.println("Debut de la class de test UserTest !");
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
		System.err.println("Fin de la class de test UserTest !");
	}
	
	User user = new User();
	UserDao udao = new UserDao();	
	
	@Test
	public void testCreat() {
		
		user = new User("Moussa","Camara","test@test.fr");
		assertTrue(udao.create(user));

	}

}
