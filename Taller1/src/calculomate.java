import java.util.Scanner;
public class calculomate {
int altura;
int base;
int recA, triA;

public void leernumeros(){
	System.out.print("Ingrese el valor A=");
	Scanner lee1 = new Scanner (System.in);
	altura=lee1.nextInt();
	System.out.print("ingrese valor B=");
	Scanner lee2 = new Scanner (System.in);
	base=lee2.nextInt();
}
public void rectanguloarea(){
	recA = base * altura/2;
}
public void trianguloarea(){
	triA = base * altura/2;
}
public void imprimir(){
	System.out.println("Universidad Tcnologica de Panama");
	System.out.println("Imprimir aqui su nombre, cedula y grupo + integrantes");
	System.out.println("Uso del constructor OperacionMatematica");
	System.out.println("El area del rectangulo es = "+ recA);
	System.out.println("El area del triangulo es = "+ triA);
}
}
