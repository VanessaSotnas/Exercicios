package gitHub;

import java.util.Scanner;

public class operadora {

	public static void main(String[] args) {
// Uma operadora de telefonia cobra R$ 50.00 por um plano básico que dá direito a 100 minutos de
// telefone. Cada minuto que exceder a franquia de 100 minutos custa R$ 2.00. Fazer um programa para
// ler a quantidade de minutos que uma pessoa consumiu, daí mostrar o valor a ser pago. 
 
   Scanner sc = new Scanner(System.in);		
		
   System.out.println("Quantos minutos foram consumidos no ultimo mes?");
   int minutos = sc.nextInt();
   
   double valorPago;
   
   if (minutos <= 100) {
	   valorPago = 50.0;
   }
   else {
	   int minutosExtra = minutos - 100;
       valorPago = (minutosExtra * 2.0) + 50.0;
   }
	
   System.out.println("Valor a ser pago: R$" + String.format("%.2f", valorPago));
   
		
  sc.close();	
  
	}

}
