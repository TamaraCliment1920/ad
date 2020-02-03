package serpis.ad;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CategoriaDAO {
	
	public static void InsertarCategoria (){
		
		
		
		Categoria categoria = new Categoria ();
		System.out.println("Dime el nombre de la categoria:");
		Scanner tcl =new Scanner(System.in);
		String nombre=tcl.nextLine();
		categoria.setnombre(nombre);					
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("serpis.ad.hpedidos");		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(categoria);
		entityManager.getTransaction().commit();
		entityManager.close();			
		entityManagerFactory.close();
	}
	

}
