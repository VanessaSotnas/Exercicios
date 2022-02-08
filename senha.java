package gitHub;

import java.util.Scanner;

public class senha {

	public static void main(String[] args) {
		
	//Escreva um programa que verifique a validade de uma senha fornecida pelo usuário.
	//A	senha válida é o número	1234. Se a senha for valida, deve aparecer ACESSO PERMITIDO, se não, ACESSO NEGADO.
		
	Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a senha: ");
		int senha = sc.nextInt();
		
		
		while (senha != 1234) {
		System.out.println("ACESSO NEGADO.");
		System.out.println("Digite a senha: ");
		senha = sc.nextInt();
		}
		
		if (senha == 1234) {
			System.out.println("ACESSO PERMITIDO.");
		}
	

	sc.close();
	}

}
