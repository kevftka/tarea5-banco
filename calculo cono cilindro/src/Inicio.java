public class Inicio {

	public static void main(String[] args) {
		//cracion de menu para seleccion de funcion
				
		System.out.println("Universidad Tcnologica de Panama");
		System.out.println("Elias Vega 8-938-562, Kevin Castillo 8-928-928");
		
		//llamadas	
		CalculoMate op = new CalculoMate();
			op.leerNumeros();
			op.rectanguloarea();
			op.trianguloarea();
			op.imprimir();

		VolumenEsfera op = new VolumenEsfera();
			op.leerNumeros();
			op.VolumenEsferaResultado();
			op.imprimir();

		VolumenCono op = new VolumenCono();
			op.leerNumeros();
			op.VolumenConoResultado();
			op.imprimir();
		
		VolumenCilindro op = new VolumenCilindro();
			op.leerNumeros();
			op.VolumenCilindroResultado();
			op.imprimir();
		
		
	
	
	}

	


}
