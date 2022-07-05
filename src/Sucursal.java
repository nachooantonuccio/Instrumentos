import java.util.ArrayList;

public class Sucursal {
	private String nombreSucursal;
	private ArrayList<Instrumento> instrumentos;
	
	
	
	public void listarInstrumentos() {
		for (Instrumento instrumento : instrumentos) {
			System.out.println(instrumento);
		}
		
	}
	
	public void agregarInstrumento(Instrumento ins) {
		this.instrumentos.add(ins);
	}

	public Sucursal(String nombreSucursal) {
		this.nombreSucursal = nombreSucursal;
		this.instrumentos = new ArrayList<Instrumento>();
	}

	
	public void borrarInstrumento(String id) {
		for (Instrumento instrumento : instrumentos) {
			if (instrumento.getId() == id) {
				instrumentos.remove(instrumento);
			}
		}
	}

	public ArrayList<Instrumento> instrumentosPorTipo(TipoDeInstrumento tipo){
		ArrayList <Instrumento> instrumentosPorTipo = new ArrayList<>();
		for (Instrumento instrumento : instrumentos) {
			if (instrumento.getTipo() == tipo) {
				instrumentosPorTipo.add(instrumento);
			}
		}
		return instrumentosPorTipo;
		
	}
}
