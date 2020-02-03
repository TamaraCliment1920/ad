package serpis.ad;

import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateMain {

	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("serpis.ad.hpedidos");
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		entityManager.getTransaction().begin();
			
				
		System.out.println("Bienvenido");
		System.out.println("Vamos a gestionar nuestros Pedidos");
		System.out.println("¿Que necesitas realizar?");
		System.out.println("1-Añadir");
		System.out.println("2-Modificar");
		System.out.println("3-Eliminar");
		
		Scanner tcl1 =new Scanner(System.in);
		int op1=tcl1.nextInt();
		
		switch (op1) {
		case 1:
			
			System.out.println("Vamos a Insertar");
			System.out.println("¿Que necesitas Insertar?");
			System.out.println("1-Pedidos");
			System.out.println("2-Clientes");
			System.out.println("3-Articulos");
			
			Scanner tcl2 =new Scanner(System.in);
			int op2=tcl2.nextInt();
			
			switch(op2) {
			
			case 1:
				System.out.println("Vamos a Insertar un Pedido");
				PedidoDAO.InsertarPedido(entityManager);
				
				
			case 2:
				System.out.println("Vamos a Insertar un Cliente");
				ClienteDAO.InsertarCliente();
				break;
				
			case 3:
				System.out.println("Vamos a Insertar un Articulo");
				
				break;
				
			case 4:
				System.out.println("Vamos a Insertar una Categoria");
				CategoriaDAO.InsertarCategoria();
				
				break;
			}
			
					
				
			
			break;

		case 2:
			
			System.out.println("Vamos a Modificar");
			System.out.println("D:");
			
			break;
		case 3:
			
			System.out.println("Vamos a Borrar");
			break;
		}
	}


	public static void nuevoPedido() {
		
	}
	public static void modificarPedido() {
		
	}
	public static void eliminarPedido() {
		
	}
} 
