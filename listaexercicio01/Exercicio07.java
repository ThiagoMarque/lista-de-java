package listaexercicio01;

import java.util.Scanner;

public class Exercicio07 {
	
	public static void main(String[]args) {
		
		Scanner dimensao = new Scanner(System.in);
		
		System.out.println("Digite o primeiro valor");
		float base = dimensao.nextFloat();
		
		System.out.println("Digite o segundo valor:");
		float altura = dimensao.nextFloat();
		
		float area = base*altura;
		System.out.println("O valor da area é:" + area);
	}

}
