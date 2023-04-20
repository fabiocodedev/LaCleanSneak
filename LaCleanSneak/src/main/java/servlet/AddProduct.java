package servlet;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

import dao.ProductDao;



/**
 * Servlet implementation class Product
 */

// ATTENTION, BIEN AJOUTER L'ANNOTATION POUR l'UPLOAD D'IMAGE
@MultipartConfig

@WebServlet("/add-product")
public class AddProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	ProductDao pdao = new ProductDao();
	bean.Product product = new bean.Product();
	// ATTENTION, CONFUSION ENTRE SERVLET Product et BEAN Product... D'OU LE bean.Product

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		if (request.getParameter("add-product") != null) {
			System.out.println("OKOKOKO");
			
		}else {
			
		}
		
		
		request.getRequestDispatcher("view/addProduct.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		
		
			
		
//*************************** UPLOAD IMG ***********************************
//*************************** DANS LE .METADATA ***************
		
//		//Recuperation de l'image upload depuis le formulaire via le name 
//		Part file = request.getPart("productPicPath");
//
//		//Recuperation du nom de l'image 
//		String filename = file.getSubmittedFileName();
//		System.out.println("Recuperation du nom de l'image" +filename);
//
//		//Ici, je recupere juste le nom de l'image (sans l'extention: .png, .jpeg, ...)
//		//  --> filename.substring(0,filename.indexOf('.'))
//		// je concat avec le titre pour garantir l'unicité de l'image
//		String finalFileName = filename.substring(0,filename.indexOf('.'))+filename.substring(filename.indexOf('.'), filename.length());
//		System.out.println("Nom complet de l'image avec concat : " + finalFileName);
//		
//		//RETIRER LES ESPACES DANS LE TITRE
//        finalFileName = finalFileName.trim().replaceAll(" ", "_");
//        System.out.println("Retirer les espaces dans le titre : " +finalFileName);
//        
//        // Ici, je stock sur mon serveur dans un dossier temporaire géré par eclipse
//        String chemin = getServletContext().getRealPath("")+"assets"+File.separator+"uploadProduct";
//        System.out.println(chemin);
//        
//        File folder = new File(chemin);
//        if (!folder.exists()) {
//			folder.mkdirs();
//		}
        

//*************************** CHOISSIR OU ON VEUT ***************

        
        System.out.println(request.getPart("productPicPath"));
        //Recuperation de l'image upload depuis le formulaire via le name 
        Part file = request.getPart("productPicPath");

        //recuperation du nom de l'image
        String filename = file.getSubmittedFileName();

        //Ici je choisis ou je veux stocker mon image
        // A noter que l'image est stockée physiquement soit sur le serveur ou soit dans votre machine
        // NB: Nous ne mettons que le nom de l'image en base de donnée

        System.out.println(request.getContextPath() + "---->TEST ");
        String uploadPath = "C:/Users/bourg/OneDrive/Bureau/WorkspaceJ2E/LaCleanSneak/src/main/webapp/assets/img/uploadProduct/"+filename;  // Destination
        System.out.println("upload image");
        System.out.println(uploadPath);
        try {
            FileOutputStream fos = new FileOutputStream(uploadPath);
            InputStream is1 = file.getInputStream();
            byte[] data = new byte[is1.available()];
            is1.read(data);
            fos.write(data);
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
		
		
//*************************** FIN UPLOAD IMG ***********************************
		
//*************************** CREATE PRODUCT ***********************************
		int price = Integer.parseInt(request.getParameter("price"));
		
		product = new bean.Product(request.getParameter("title"),request.getParameter("description"),
				price,filename);
		
		if (pdao.create(product)) {
//			file.write(chemin+File.separator+finalFileName);
			System.out.println("bravo, product crée !");
			request.getRequestDispatcher("view/addProduct.jsp").forward(request, response);
			// !!! le dispacht appel la vue en .jsp directement, le traitement des serverlet correspondant ne sont pas effectuer... 
		}else {
			System.out.println("pas de product crée...");
		}
		
	//response.sendRedirect("/product");
	response.sendRedirect("/referrer");
		
//*************************** FIN CREATE PRODUCT ***********************************
		
		doGet(request, response);
	}

}
