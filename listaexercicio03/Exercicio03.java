package listaexercicio03;

import java.util.Scanner;

public class Exercicio03 {
	
	public static void main(String[]args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite o o primeiro numero");
	float numero = sc.nextFloat();
	
	System.out.println("Digite o segundo numero");
	float numero1 = sc.nextFloat();
	
	
	float diferenca = numero - numero1 ;
	
	float quadrado = diferenca * 2;
	System.out.println("o quadrado é :" + quadrado);
	
	}

}
