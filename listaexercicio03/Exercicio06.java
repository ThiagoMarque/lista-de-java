package listaexercicio03;

import java.util.Scanner;

public class Exercicio06 {
	
	public static void main(String[]args) {
		
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Digite a cotação dolar :");
	double valora = sc.nextDouble();
	
	System.out.println("Digite quantos dolar tem : ");
	double valorb = sc.nextDouble();
	
	System.out.println("Digite quantos dolar tem : ");
	double valorc = sc.nextDouble();
	
	
	double quadra_a = Math.pow(valora, 2);
	double quadra_b = Math.pow(valorb, 2);
	double quadra_c = Math.pow(valorc, 2);
	
	double soma = quadra_a + quadra_b + quadra_c; 
	
	System.out.println("A soma dos quadrados é : " + soma);
	
	}

}
