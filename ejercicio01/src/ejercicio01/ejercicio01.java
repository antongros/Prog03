package ejercicio01;

import java.util.Scanner;

public class ejercicio01 {
	private static Scanner teclado;
	public static void main (String[]args) {
		teclado = new Scanner (System.in);
		int A  , B ;
		int resultado;
		int indice;      //tendra los valores desde A+1 hasta B-1

		
		System.out.print ("ingrese primer valor:");
		A=teclado.nextInt ();
		System.out.print ("ingrese segundo valor:");
		B=teclado.nextInt ();
		
		resultado = 0;
		indice = A+1;
		while (indice<=B-1) {               //tambien se puede poner (indice=b) 
			
			resultado = resultado + indice ;
			indice = indice + 1 ;
				}
		System.out.print (resultado);
			}
		}