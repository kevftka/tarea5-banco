import java.util.Scanner;

public class VolumenEsfera {
float radio;
float volumen;


final float PI = Float.parseFloat("3.1416");



//proceso de operacion

		public void leerNumeros(){
			System.out.print("Ingrese el valor radio=");
			Scanner lee1 = new Scanner (System.in);
			radio=lee1.nextFloat();
			
		}
		public void VolumenEsferaResultado(){
			volumen = (3/4)*PI*(radio*radio*radio);
		}
		

		public void imprimir(){
			
			System.out.println("El volumen de la esfera es = "+ volumen);
			
		}
}
