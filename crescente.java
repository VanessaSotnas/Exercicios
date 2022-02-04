package exercicios;
import java.util.Locale;
import java.util.Scanner;

public class crescente {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
// Faça um programa que leia dois numeros inteiros e diz se estão em ordem crescente ou decrescente. //
// O programa para quando sao digitados dois numeros iguais. //	
		
		int x, y;
					
		System.out.println("Digite dois numero e veja se estao em ordem crescente ou decrescente: ");
		System.out.print("Primeiro numero: ");
		x = sc.nextInt();
		System.out.print("Segundo numero: ");
		y = sc.nextInt();

		while (x != y) {
			if (x < y) { 
				System.out.println("Crescente.");
			}
			else {
				System.out.println("Decrescente");
		}
			System.out.println("Digite outros dois numeros: ");
			System.out.print("Primeiro numero: ");
			x = sc.nextInt();
			System.out.print("Segundo numero: ");
			y = sc.nextInt();
		}
		
		
	sc.close();	
		
	}

}
