package exercicios;

import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

// Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo,
// tamanho e elementos do vetor A multiplicados por 2 . B[i] = A[i] * 2     
    
   int[] A = new int[8];  
   int[] B = new int[A.length];
   
   System.out.println("Digite os dados do vetor A:");
   
   for (int i = 0; i< A.length; i++) {
	   System.out.print("Elemento " + (i + 1) + ": ");
	   A[i] = sc.nextInt();
   }
   
   System.out.println();
   System.out.println("Elementos do vetor B: ");
   for (int i = 0; i < B.length; i++) {
	   B[i] = A[i] * 2;
	   System.out.print(B[i] + "  ");
   }
   
   
   
	}

}
