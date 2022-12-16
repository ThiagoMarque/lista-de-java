package listaexercicio01;

import java.util.Scanner;

public class Exercicio08 {
	
	public static void main(String[]args) {
		
		Scanner dimensao = new Scanner (System.in);
		
		System.out.println("Digite o numero da base");
		float base = dimensao.nextFloat();
		
		System.out.println("Digieto a altura");
		float altura = dimensao.nextFloat();
		
		float resultado = base*altura/2;
		
		System.out.println("o resultado é:"+ resultado);
	}

}
