package serpis.ad;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Pedido {

	private Long id;
	private LocalDateTime fecha=LocalDateTime.now();
	private BigDecimal importe=BigDecimal.ZERO;
	
	@ManyToOne
	@JoinColumn(name="cliente")
	private Cliente cliente;
	@OneToMany (mappedBy ="pedido", cascade =CascadeType.ALL,orphanRemoval =true)
	private List<PedidoLinea> pedidoLineas = new ArrayList<PedidoLinea>();
}