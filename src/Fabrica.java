import java.util.ArrayList;

public class Fabrica {
	private ArrayList<Sucursal> sucursales;

	public Fabrica() {
		this.sucursales = new ArrayList<Sucursal>();
		
	}
	
	
	public void listarInstrumentos() {
		for (Sucursal sucursal : sucursales) {
			sucursal.listarInstrumentos();
		}
	}
	
	public ArrayList<Instrumento> instrumentosPorTipo(TipoDeInstrumento tipo){
		ArrayList <Instrumento> instrumentosPorTipo = new ArrayList<>();
		for (Sucursal sucursal : sucursales) {
			instrumentosPorTipo.addAll(sucursal.instrumentosPorTipo(tipo));
		}
		
		return instrumentosPorTipo;
	}
	
	public void agregarSucursal(Sucursal sucursal) {
		this.sucursales.add(sucursal);
	}
	
	public void porcInstrumentosPorTipo(String nombreSucursal) {
		
		
	}
	
	public void borrarInstrumento(String id) {
		for (Sucursal sucursal : sucursales) {
		//	if(sucursal.)
			
			
		}
	}

}
