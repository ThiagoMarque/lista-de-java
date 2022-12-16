package listaexercicio03;

import java.util.Scanner;

public class Exercicio09 {
	
	    public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o ano do seu aniversario : ");
		int salariomensal = sc.nextInt();
		
		System.out.println("Digite quantos meses passou do seu aniversario :");
		int percentualreajuste = sc.nextInt();
		
		int idade = salariomensal + (salariomensal * percentualreajuste / 100);
		 System.out.println("valor do salario novo é : " + salariomensal );
		
		
		
	}


}
