package listaexercicio02;

import java.util.Scanner;

public class Exercicio05 {
	
      public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a temperatura celsius");
		float celsius = sc.nextFloat();
		
		float conversao = ( 9 * celsius + 160 ) / 5;
		System.out.println("a conversao é :" + conversao);
		
		
		
	}

}
