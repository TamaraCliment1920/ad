package serpis.ad;

import java.math.BigDecimal;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PedidoDAO {
	

	
	public static void InsertarPedido (EntityManager entityManager){
		
		Scanner tcl=new Scanner(System.in);
		System.out.println("Indica el Cliente");
		Long clienteid=tcl.nextLong();
		Cliente cliente = entityManager.find(Cliente.class, clienteid);
		Pedido pedido = new Pedido(cliente);
		PedidoLinea pedidoLinea1 = new PedidoLinea(pedido);
		System.out.println("Indica el Articulo");
		Scanner tcl3 =new Scanner(System.in);
		Long categoriaid=tcl.nextLong();
		Articulo articulo1 = entityManager.find(Articulo.class, categoriaid);
		pedidoLinea1.setArticulo(articulo1);
		pedidoLinea1.setUnidades(new BigDecimal(4));
		
		/*PedidoLinea pedidoLinea2 = new PedidoLinea(pedido);
		Articulo articulo2 = entityManager.find(Articulo.class, 2L);
		pedidoLinea2.setArticulo(articulo2);
		pedidoLinea2.setUnidades(new BigDecimal(6));*/
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("serpis.ad.hpedidos");		
		EntityManager entityManager1 = entityManagerFactory.createEntityManager();
		entityManager.persist(pedido);
		entityManager.getTransaction().commit();
		entityManager.close();			
		entityManagerFactory.close();
		//System.out.printf("%3d %s %s %s %n", pedido.getId(), pedido.getFecha(), pedido.getCliente().getnombre());
	}
	


}
