package serpis.ad;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ArticuloDAO {
	
	public static void InsertarArticulo (){
		
		
		
		Articulo articulo= new Articulo ();
		System.out.println("Dime el nombre de la articulo:");
		Scanner tcl =new Scanner(System.in);
		String nombre=tcl.nextLine();
		articulo.setnombre(nombre);					
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("serpis.ad.hpedidos");		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(articulo);
		entityManager.getTransaction().commit();
		entityManager.close();			
		entityManagerFactory.close();
	}

}
