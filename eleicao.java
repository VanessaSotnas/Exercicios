package gitHub;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class eleicao {

	public static void main(String[] args) throws ParseException {
		
	// Escreva um programa para ler a data de nascimento de uma pessoa.	
	// Verificar se ela pode ou nao votar esse ano (Menor de 16 anos ou maiores de 60).
	// Adicionar no programa a data atual.
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat formatar = new SimpleDateFormat ("dd/MM/yyyy");
		Date datadehoje = new Date();
		
	System.out.println("Justica eleitoral.");	
	System.out.println("Para verificar se voce tem direito de votar, digite sua data de nascimento (dd/mm/aaaa): ");
	Date dataNascimento = formatar.parse(sc.next());
	
	System.out.println("Voce nasceu em " + formatar.format(dataNascimento) + ".");
	System.out.println("Hoje é " + formatar.format(datadehoje) + ".");
	
	long diferencaEmMil = Math.abs(datadehoje.getTime() - dataNascimento.getTime());
	int dias = (int)(diferencaEmMil / (1000 * 60 * 60 * 24));
	int anos = dias / 365;
	
	System.out.println("Voce tem " + anos + " anos.");
	
	if (anos < 16) {
		System.out.println("Voce nao pode votar esse ano.");
	}
	else if (anos < 60){
		System.out.println("Voce pode votar esse ano.");
	}
	else {
		System.out.println("Nao é obrigatorio seu voto esse ano.");
	}

		
	sc.close();
		
	}

}
