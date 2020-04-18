
package ar.edu.unlam.pb2.Calculadora;

import java.util.Scanner;
public class Calculadora {

	public static void main(String[] args) {
		Integer a;
		Integer b;
		Integer opcion;
        Integer resultado = null;

		Scanner teclado = new Scanner(System.in);
		do {
			System.out.println(
					"Ingrese su operación \n 1 para multiplicar \n 2 para restar \n 3 para sumar \n 4 para dividir");
			opcion = teclado.nextInt();
            }                                   
            while (opcion < 1 || opcion > 4);
		System.out.println("Ingrese el primer numero");
		a = teclado.nextInt();

		System.out.println("Ingrese el segundo numero");
		b = teclado.nextInt();

            switch(opcion){
            case 1:
                System.out.println("Has seleccionado la opcion 1");
			resultado = a * b;
                break;
            case 2:
                System.out.println("Has seleccionado la opcion 2");
			resultado = restarEnteros(a,b);
                break;
             case 3:
                System.out.println("Has seleccionado la opcion 3");
			resultado = sumarEnteros(a,b);
                break;
             case 4:
            	    System.out.println("Has seleccionado la opcion 4");
			resultado = a / b;
                break;
             default:
                System.out.println("Solo números entre 1 y 4");
		}

		System.out.println("El resultado es " + resultado.toString());
	}
	
	public static Integer sumarEnteros(int a, int b) {
		return a+b;
	}
	
	public static Integer restarEnteros(int a, int b) {
		return a-b;
	}
}