import java.util.Scanner;

public class VolumenCilindro {
	
	float radio;
	float hipotenusa;
	float volumen;
		
		
		final float PI = Float.parseFloat("3.1416");

		
		
		//proceso de operacion
		
				public void leerNumeros(){
					System.out.print("Ingrese el valor radio=");
					Scanner lee1 = new Scanner (System.in);
					radio=lee1.nextFloat();
					System.out.print("Ingrese el valor hipotenusa=");
					Scanner lee2 = new Scanner (System.in);
					hipotenusa=lee2.nextFloat();
					
				}
				
				public void VolumenCilindroResultado(){
					volumen = PI*(radio*radio)*hipotenusa  ;
				}
				
		
				public void imprimir(){
					
					System.out.println("El volumen del Cilindro es = "+ volumen);
					
				}
		

	
}
