package atividadesGeral;

import java.util.Scanner;
import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Stack<String> pilhaLivros = new Stack<>();
	        Scanner leia = new Scanner(System.in);

	        int opcao;
	        do {
	            exibirMenu();
	            System.out.print("Escolha uma opção: ");
	            opcao = leia.nextInt();
	            leia.nextLine(); 

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do livro: ");
	                    String nomeLivro = leia.nextLine();
	                    adicionarLivro(pilhaLivros, nomeLivro);
	                    break;
	                case 2:
	                    listarLivros(pilhaLivros);
	                    break;
	                case 3:
	                    retirarLivro(pilhaLivros);
	                    break;
	                case 0:
	                    System.out.println("Programa encerrado.");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }

	        } while (opcao != 0);

	       
	    }

	    private static void exibirMenu() {
	        System.out.println("\n--- Menu ---");
	        System.out.println("1: Adicionar Livro");
	        System.out.println("2: Listar Livros");
	        System.out.println("3: Retirar Livro");
	        System.out.println("0: Sair");
	    }

	    private static void adicionarLivro(Stack<String> pilhaLivros, String nomeLivro) {
	        pilhaLivros.push(nomeLivro);
	        System.out.println("Livro " + nomeLivro + " adicionado à pilha.");
	    }

	    private static void listarLivros(Stack<String> pilhaLivros) {
	        if (pilhaLivros.isEmpty()) {
	            System.out.println("A pilha está vazia.");
	        } else {
	            System.out.println("Livros na pilha: " + pilhaLivros);
	        }
	    }

	    private static void retirarLivro(Stack<String> pilhaLivros) {
	        if (pilhaLivros.isEmpty()) {
	            System.out.println("A pilha está vazia. Não há livros para retirar.");
	        } else {
	            String livroRetirado = pilhaLivros.pop();
	            System.out.println("Livro retirado: " + livroRetirado);
	        }
	    }
	
		
	}


