package drtp.sn.Servelet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import drtp.sn.beans.Connexion;
import drtp.sn.beans.Produit;

@WebServlet("/Produit")
public class Produits extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Produits() {
        super();
        // TODO Auto-generated constructor stub
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Connexion con=new Connexion();
		List<Produit> prods=con.produits();
		request.setAttribute("prods", prods);
		Boolean a=(Boolean) request.getAttribute("etat");
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/produits.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connexion con=new Connexion();
		
		String nom=request.getParameter("nom");
		int prix=Integer.parseInt(request.getParameter("prix"));
		int quantite=Integer.parseInt(request.getParameter("quantite"));
		Produit p=new Produit(nom,prix,quantite);
		request.setAttribute("produit", p);
		
		request.setAttribute("etat",con.addProduit(p));
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/produits.jsp").forward(request, response);
	}

}
