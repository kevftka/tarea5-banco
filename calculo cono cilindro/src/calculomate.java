import java.util.Scanner;

//clase de entrada
public class CalculoMate {
float altura;
float base;
float recA, triA;

//proceso de operacion

		public void leerNumeros(){
			System.out.print("Ingrese el valor A=");
			Scanner lee1 = new Scanner (System.in);
			altura=lee1.nextFloat();
			System.out.print("ingrese valor B=");
			Scanner lee2 = new Scanner (System.in);
			base=lee2.nextFloat();
		}
		public void rectanguloarea(){
			recA = base * altura/2;
		}
		public void trianguloarea(){
			triA = base * altura/2;
		}
		public void imprimir(){
			System.out.println("Universidad Tcnologica de Panama");
			System.out.println("Elias Vega 8-938-562, Kevin Castillo 8-928");
			System.out.println("Uso del constructor OperacionMatematica");
			System.out.println("El area del rectangulo es = "+ recA);
			System.out.println("El area del triangulo es = "+ triA);
		}
}
