package drtp.sn.beans;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.mysql.jdbc.Statement;

public class Connexion {
  static Connection con=null;
  static PreparedStatement ps=null;
  static ResultSet rs=null;
   static Boolean error=false;
  
  public Connexion()
  {
	  try {
		Class.forName("com.mysql.jdbc.Driver");
	} catch (ClassNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	  
	  try {
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/db_boutique","root","");
		System.out.println("connexion okkk");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
		error=true;
		System.out.println("connexion erooorrrrrr");
		
	}
  }
  
  public List<Produit> produits()
  {
	  
	  ArrayList<Produit> produits=new ArrayList<Produit>();
	  try {
		ps=con.prepareStatement("select * from produit");
		rs=ps.executeQuery();
		while(rs.next())
		{
			Produit p=new Produit();
			p.setId(rs.getInt("id"));
			p.setNom(rs.getString("nom"));
			p.setPrix(rs.getInt("prix"));
			p.setQuantite(rs.getInt("quantite"));
			produits.add(p);
		}
		
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return produits;	  
  }
  
  public Boolean addProduit(Produit p)
  {
	  Boolean etat=false;
	  try {
		ps=con.prepareStatement("insert into produit (nom,prix,quantite) values (?,?,?)");
		ps.setString(1, p.getNom());
		ps.setInt(2, p.getPrix());
		ps.setInt(3, p.getQuantite());
		if(ps.executeUpdate()>0)
			etat=true;
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return etat;
  }
  
  public Boolean updateProduit(Produit p)
  {
	  Boolean etat=false;
	  try {
		ps=con.prepareStatement("update produit set nom=?,prix=?,quantite=? where id=?");
		ps.setString(1, p.getNom());
		ps.setInt(2, p.getPrix());
		ps.setInt(3, p.getQuantite());
		ps.setInt(4,p.getId());
		if(ps.executeUpdate()>0)
			etat=true;
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return etat;
  }
  
  public Boolean deleteProduit(Produit p)
  {
	  Boolean etat=false;
	  try {
		ps=con.prepareStatement("delete from produit where id=?");
		ps.setInt(1, p.getId());
		
		if(ps.executeUpdate()>0)
			etat=true;
			
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  return etat;
  }
  
  
}
