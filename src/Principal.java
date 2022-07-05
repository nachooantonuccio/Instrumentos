import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Fabrica f = new Fabrica();
		cargarFabrica(f);
		//f.listarInstrumentos();
		
		ArrayList<Instrumento> lista = f.instrumentosPorTipo(TipoDeInstrumento.CUERDA);
		System.out.println(lista);
	}
	
	private static void cargarFabrica(Fabrica f) {
		
		Sucursal s1 = new Sucursal("Sucursal A");
		Sucursal s2 = new Sucursal("Sucursal B");
		
		s1.agregarInstrumento(new Instrumento("ABC123", 13276, TipoDeInstrumento.CUERDA));
		s1.agregarInstrumento(new Instrumento("CBA123", 10277, TipoDeInstrumento.VIENTO));
		s1.agregarInstrumento(new Instrumento("FDF123", 12264, TipoDeInstrumento.PERCUSION));
		
		s2.agregarInstrumento(new Instrumento("FJE123", 19222, TipoDeInstrumento.VIENTO));
		s2.agregarInstrumento(new Instrumento("ASD144", 13243, TipoDeInstrumento.PERCUSION));
		
		
		f.agregarSucursal(s1);
		f.agregarSucursal(s2);
		
		
	}

}
