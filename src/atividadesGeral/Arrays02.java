package atividadesGeral;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Arrays02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Set<Integer> numerosSet = new HashSet<>();
	        numerosSet.add(10);
	        numerosSet.add(20);
	        numerosSet.add(30);
	        numerosSet.add(40);
	        numerosSet.add(50);
	        numerosSet.add(60);
	        numerosSet.add(70);
	        numerosSet.add(80);
	        numerosSet.add(90);
	        numerosSet.add(100);

	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Digite um número inteiro de 0 a 100: ");
	        int numeroDigitado = scanner.nextInt();

	        
	        if (numerosSet.contains(numeroDigitado)) {
	            System.out.println("Número " + numeroDigitado + " Encontrado!");
	        } else {
	            System.out.println("O número " + numeroDigitado + " não foi encontrado!");
	        }
	    }
	
		
	}


