package gitHub;

import java.util.Scanner;

public class dez {

	public static void main(String[] args) {
		
// Solicite ao usuário para digitar um número, e mostre-o por extenso. Este número deverá
// variar entre 1 e 10. Se o usuário introduzir um número que não está neste intervalo, 
// mostre a mensagem: “Número inválido”.

	Scanner sc = new Scanner(System.in);
		
	System.out.print("Digite um numero de 1 a 10:");
	int numero = sc.nextInt();
	
	switch (numero) {
	case 1:
		System.out.println("Você digitou o número um.");
	    break;
	case 2:
		System.out.println("Você digitou o número dois.");
		break;
	case 3:
		System.out.println("Você digitou o número três");
		break;
	case 4:
		System.out.println("Você digitou o número quatro.");
		break;
	case 5:
		System.out.println("Você digitou o número cinco.");
		break;
	case 6:
		System.out.println("Você digitou o número seis.");
		break;
	case 7:
		System.out.println("Você digitou o número sete.");
		break;
	case 8:
		System.out.println("Você digitou o número oito.");
		break;
	case 9:
		System.out.println("Você digitou o número nove.");
		break;
	case 10:
		System.out.println("Você digitou o número dez.");
		break;
	default:
		System.out.println("Número inválido.");
	}
	
		
		
		
	sc.close();	
	}

}
