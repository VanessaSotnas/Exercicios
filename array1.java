package array;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class array1 {

	public static void main(String[] args) {

    List<String> list = new ArrayList<>();

    // add - Adiciona elementos na lista.
    list.add("Vanessa");
    list.add("Marcela");
    list.add("Maria");
    list.add("Luciane");
    list.add(2, "Caju");
    
    // Para cada String 'x' pertencente (:) a lista 'list':
    for (String x : list) {
    	System.out.println(x);
    }
    
    System.out.println("------------------");
   
    // removeIf - remova se
    // 'x' tal que / pertencente (->) em 'x' caracter na posicao (chatAt) = 'M'. 
    list.removeIf(x -> x.charAt(0) == 'M');
    
    for (String x : list) {
    	System.out.println(x);
    }

   System.out.println("------------------");  
   System.out.println(list); // Lista impressa de outra forma.
   System.out.println("------------------"); 
  
   // Index of - Encontrar a posicao de um elemento. Retorna Int.
   System.out.println("Index  of Caju: " + list.indexOf("Caju"));
  
   // Quando nao ha um elemento na lista, o indexOf retorna (-1).
   System.out.println("Index  of Mariana: " + list.indexOf("Mariana")); 
  
   System.out.println("------------------"); 
   
   // Deixar na lista somente nomes que começam com 'V':
   // Declare uma nova lista;
   // Funcoes LAMBDA - diminue a quantidade de codigos necessarios em algumas funcoes;
   // O 'filter' (recebe um predicado, ou o que vc deseja fazer) e retorna um 'stream'(Lambda);
   // 'stream' nao eh compativel com 'list'.Para converter para lista, usar 'collect' ;
   // Importar 'Collectors".
   
   List<String> result = list.stream().filter(x -> x.charAt(0) == 'V').collect(Collectors.toList());
   
   for (String x : result) {  // result
   	System.out.println(x);
   }
   
   System.out.println("------------------"); 
   // Encontar o primeiro nome que comeca com a letra 'M'.
   // Denominar o nome da funcao 'name', chamar a lista onde deseja procurar 'list.'
   // Utilizar funcao '.find.First()' - Ache o primeiro;
   // Colocar a funcao '.orElse" - Para retornar 'null' caso nao exista o que deseja. 
   
   String name = list.stream().filter(x -> x.charAt(0) == 'C').findFirst().orElse(null);
   
   System.out.println(name);
   
   
	}

}
