package entornos;

import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int resultado = 0;
		
		System.out.println("Primer Numero");
		int num1 = sc.nextInt();
		
		System.out.println("Segundo Numero");
		int num2 = sc.nextInt();
		
		System.out.println("Menu");
		System.out.println("Pulsa 1 para sumar");
		System.out.println("Pulsa 2 para restar");
		int opcion = sc.nextInt();
		
		if (opcion == 1) {
			resultado = num1 + num2;
		}
		
		if (opcion == 2) {
			resultado = num1 - num2;
		}
		
		System.out.println("Resultado " + resultado);
		


	}

}
