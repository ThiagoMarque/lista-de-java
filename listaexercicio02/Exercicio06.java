package listaexercicio02;

import java.util.Scanner;

public class Exercicio06 {
	
     public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a Fahrenheit :");
		float Fahrenheit = sc.nextFloat();
		
		float conversao = (Fahrenheit-32) *(5/9) ;
		System.out.println("a conversao é :" + conversao);
		
		
		
	}

}
