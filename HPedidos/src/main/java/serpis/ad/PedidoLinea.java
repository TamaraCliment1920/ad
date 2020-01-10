package serpis.ad;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class PedidoLinea {
	
	private Long id;
	
	@ManyToOne
	@JoinColumn (name="pedido")
	private Pedido pedido;
	@ManyToOne
	@JoinColumn (name="articulo")
	private Articulo articulo;
	
	private BigDecimal precio =BigDecimal.ZERO;
	private BigDecimal unidades=BigDecimal.ZERO;
	private BigDecimal importe=BigDecimal.ZERO;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public BigDecimal getPrecio() {
		return precio;
	}
	
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	
	public BigDecimal getUnidades() {
		return unidades;
	}
	
	public void setUnidades(BigDecimal unidades) {
		this.unidades = unidades;
	}
	
}
