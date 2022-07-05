
public class Instrumento {
	private String id;
	private double precio;
	private TipoDeInstrumento tipo;
	
	
	public Instrumento(String id, double precio, TipoDeInstrumento tipo) {
		this.id = id;
		this.precio = precio;
		this.tipo = tipo;
	}


	@Override
	public String toString() {
		return "Instrumento [id=" + id + ", precio=" + precio + ", tipo=" + tipo + "]";
	}


	public TipoDeInstrumento getTipo() {
		return tipo;
	}


	public void setTipo(TipoDeInstrumento tipo) {
		this.tipo = tipo;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}
	
	
	
}
