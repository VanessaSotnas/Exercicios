package exercicios;

import java.util.Scanner;

public class quadradoVetor {

	public static void main(String[] args) {
	
// Criar um vetor com 15 elementos inteiros. Construir um vetor B
// de mesmo tipo e tamanho, sendo os elementos do vetor B serem o 
// quadrados dos repectivos elementos do vetor A. B[i] = A[i] * A[i].		

	Scanner sc = new Scanner(System.in);	
	
	int[] A = new int[15];
	int[] B = new int[A.length];
	
	System.out.println("Digite os valores do vetor A: ");
	
	for (int i = 0; i< A.length; i++) {
	     System.out.print("Elemento " + (i + 1) + ": ");
		 A[i] = sc.nextInt();
	   }
	
	System.out.println();
	System.out.println("Elementos do vetor B: ");
	
	for (int i = 0; i < B.length; i++) {
	   B[i] = A[i] * A[i];	   
	   System.out.print(B[i] + "  ");
	  
	   }
	
		
	sc.close();
	
	}

}
