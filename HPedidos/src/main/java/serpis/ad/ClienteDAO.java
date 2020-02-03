package serpis.ad;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ClienteDAO {
			
		public static void InsertarCliente (){
			
			
			
			Cliente cliente = new Cliente ();
			System.out.println("Dime el nombre del Cliente:");
			Scanner tcl =new Scanner(System.in);
			String nombre=tcl.nextLine();
			cliente.setnombre(nombre);					
			EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("serpis.ad.hpedidos");		
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			entityManager.getTransaction().begin();
			entityManager.persist(cliente);
			entityManager.getTransaction().commit();
			entityManager.close();			
			entityManagerFactory.close();
		}
		

	
}
