package ejercicio09;
import java.util.Scanner;
//Un n�mero se dice que es perfecto cuando la suma de sus divisores propios �todos los divisores a excepci�n del propio n�mero-, 
//es igual a dicho n�mero. Hacer un programa que lea un n�mero y nos diga si es perfecto o no.


public class ejercicio09 {
	private static Scanner teclado;
	public static void main (String[]args) {
		teclado = new Scanner (System.in);

		int N , suma=0;
		
		System.out.print ("ingrese un n�:");
		N=teclado.nextInt ();
		 for (int i = 1 ; i < N ; i++){
	            if (N % i == 0){
	       	         suma=suma+i;	
		
	            }
		 }
	           if (N==suma) {
	        		System.out.print ("el n� es perfecto");           	
	            }else  
	            	System.out.print ("el n� no es perfecto");        
	            
		
	}
}
