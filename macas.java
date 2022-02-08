package gitHub;

import java.util.Scanner;

public class macas {

	public static void main(String[] args) {

// As maçãs custam R$0,30 cada se forem compradas menos do que uma dúzia, é R$ 0,25 se forem compradas pelo menos doze. //
//Escreva um programa que leia o número de maçãs compradas, calcule	e escreva o	valor total	da compra. //		

	Scanner sc = new Scanner(System.in);	
		
	System.out.println("Quantas macas voce deseja comprar?");
	int quantidade = sc.nextInt();
	
	double macas;
	
	if (quantidade < 12) {
	    macas = 0.30;
	}
	else {
		macas = 0.25;
	}
		
	double resultado = quantidade * macas;
	
	System.out.println("valor total da compra: R$" + String.format("%.2f", resultado));
	
	
	
	sc.close();
		
	}

}
