package serpis.ad;

import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Articulo {

	@Id
	@GeneratedValue (strategy =GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private BigDecimal precio;
	
	@ManyToOne
	@JoinColumn(name="categoria")
	private Categoria categoria;
	
	public Long getId() {
		return id;
	}
	public void setId (Long id) {
		this.id=id;
	}
	public String getnombre() {
		return nombre;
	}
	public void setnombre (String nombre) {
		this.nombre=nombre;
	}
	public BigDecimal getprecio() {
		return precio;
	}
	public void setprecio (BigDecimal precio) {
		this.precio=precio;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}

