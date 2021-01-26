public class Inicio {

	public static void main(String[] args) {
		//cracion de menu para seleccion de funcion
				
		System.out.println("Universidad Tcnologica de Panama");
		System.out.println("Elias Vega 8-938-562, Kevin Castillo 8-928-928");
		
		//llamadas
		System.out.println("Calculo del area del triangulo y rectangulo");	
		CalculoMate op = new CalculoMate();
			op.leerNumeros();
			op.rectanguloarea();
			op.trianguloarea();
			op.imprimir();

		//calculo de una esfera
		System.out.println("Calculo del Volumen de una esfera");
		VolumenEsfera op1 = new VolumenEsfera();
			op1.leerNumeros();
			op1.VolumenEsferaResultado();
			op1.imprimir();
		
		//calculo de un cono
		System.out.println("Calculo del Volumen de un Cono");
		VolumenCono op2 = new VolumenCono();
			op2.leerNumeros();
			op2.VolumenConoResultado();
			op2.imprimir();

		//calculo de un cilindro
		System.out.println("Calculo del Volumen de una Cilindro");
		VolumenCilindro op3 = new VolumenCilindro();
			op3.leerNumeros();
			op3.VolumenCilindroResultado();
			op3.imprimir();
		
		
	
	
	}

	


}
