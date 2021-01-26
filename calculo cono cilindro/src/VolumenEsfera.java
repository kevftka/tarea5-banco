import java.util.Scanner;

public class VolumenEsfera {
float radio;
float volumen;

//creacion de constante para pi
final float PI = Float.parseFloat("3.1416");



//proceso de operacion

		public void leerNumeros(){
			System.out.print("Ingrese el valor radio=");
			Scanner lee1 = new Scanner (System.in);
			radio=lee1.nextFloat();
			
		}
		public void VolumenEsferaResultado(){
			
			volumen = 4*PI*(radio*radio*radio)/3;
		}
		

		public void imprimir(){
			
			System.out.println("El volumen de la esfera es = "+ volumen);
			
		}
}
