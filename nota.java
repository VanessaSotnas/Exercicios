package gitHub;

import java.util.Locale;
import java.util.Scanner;

public class nota {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	//  Crie um programa que recebe tres notas, faz a sua media, e checa se você passou direto, ficou de recuperação ou foi reprovado na matéria.
	//  Nota 7 ou mais: aprovado;
	//  Entre 5 e 7: de recuperação;
	//  Abaixo de 5: reprovado.

	double nota1, nota2, nota3, resultado;
	
	System.out.print("Digite a primeira nota: ");
	nota1 = sc.nextDouble();
	System.out.print("Digite a segunda nota: ");
	nota2 = sc.nextDouble();
	System.out.print("Digite a terceira nota: ");
	nota3 = sc.nextDouble();
	
	resultado = (nota1 + nota2 + nota3) / 3;
	
	if (resultado >= 7) {
		System.out.println("Aprovado.  Sua media: " + String.format("%.1f", resultado));
	}
	else if (resultado >= 5) {
		System.out.println("Recuperacao. Agende uma prova extra.  Sua media:  " + String.format("%.1f", resultado));
	}
	else {
		System.out.println("Reprovado.  Sua media: " + String.format("%.1f", resultado));
	}
	
	
	sc.close();	
		
	}

}
