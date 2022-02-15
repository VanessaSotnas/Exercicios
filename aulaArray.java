package array;

import java.util.Scanner;

public class aulaArray {

	public static void main(String[] args) {
		
	Scanner sc = new Scanner(System.in);

	System.out.println("Quantas numeros serao digitadas");
	int n = sc.nextInt();
	
	double[] vect = new double[n];
	
	for (int i = 0; i < n ; i++) {
		System.out.print("Digite o numero da posicao " + i + " do programa: ");
		vect[i] = sc.nextDouble();
	}
	
    double soma = 0;
    for (int i = 0; i < n; i++) {
         soma += vect[i];	
    }
    
    double media = 0;
    media = soma / n;
	
    System.out.println("A soma dos valores e de: " + soma);
    System.out.println("A media dos valores e de: " + media);
	
	}

}
