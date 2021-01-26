import java.util.Scanner;


//volumen cono
public class VolumenCono {

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
					Scanner lee1 = new Scanner (System.in);
					hipotenusa=lee1.nextFloat();
					
				}

				public void VolumenConoResultado(){
					volumen = (PI* (radio*radio)*hipotenusa)/3 ;
				}
				
		
				public void imprimir(){
					
					System.out.println("El volumen del cono es = "+ volumen);
					
				}
	}
	
}
