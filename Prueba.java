package entornos;

import java.util.Scanner;

/*
1.- Realiza un programa que pida al usuario tres números: uno de tipo entero, otro de tipo flotante y otro de tipo doble.
 A continuación se tienen que mostrar en pantalla los tres números en una sola fila de la consola de salida.
*/
public class Prueba {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Introduzca un número entero;");
		int numEntero = sc.nextInt();
		
		System.out.println("Introduzca un número flotante;");
		float numFlotante = sc.nextFloat();
		
		System.out.println("Introduzca un número double;");
		double numDoble = sc.nextDouble();
				
		System.out.println ("El número entero es: " + numEntero +
		". El número flotante es : " + numFlotante +
		".El número doble es: "+ numDoble);
		
		System.out.println("Modificacion 2");
		System.out.println("Modificacion 3");
		

	}

}
