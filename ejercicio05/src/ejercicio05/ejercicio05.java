package ejercicio05;

import java.util.Scanner;

public class ejercicio05 { //Hacer un programa que lea una serie de n�meros por teclado de manera que cuando 
		//el n�mero le�do sea el cero ya no se introduzcan m�s, el programa debe calcular y escribir la suma 
		//de los n�meros de la serie y cu�ntos se han introducido en total.

	private static Scanner teclado;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teclado = new Scanner (System.in);
		
	int n=0,suma=0,contador=0;
	
	  System.out.print("Introduce un n�mero  ");
      n=teclado.nextInt ();

      while (n !=0){
    	  contador = contador + 1;
    	  suma = n + suma;
    	  System.out.print("Introduce un n�mero  ");
          n=teclado.nextInt ();
          
      }
    	  
           System.out.println ("la suma de todos los numeros introducidos es  "+ suma);
           System.out.println("la cantidad de n�meros introducidos es  "+ contador);
	} 
}
