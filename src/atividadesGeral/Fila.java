package atividadesGeral;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Fila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Queue<String> filaClientes = new LinkedList<>();
	        Scanner leia = new Scanner(System.in);

	        int opcao;
	        do {
	            exibirMenu();
	            System.out.print("Escolha uma opção: ");
	            opcao = leia.nextInt();
	            leia.nextLine(); 

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do Cliente: ");
	                    String nomeCliente = leia.nextLine();
	                    adicionarCliente(filaClientes, nomeCliente);
	                    break;
	                case 2:
	                    listarClientes(filaClientes);
	                    break;
	                case 3:
	                    chamarCliente(filaClientes);
	                    break;
	                case 0:
	                    System.out.println("Programa encerrado.");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }

	        } while (opcao != 0);

	        leia.close();
	    }

	    private static void exibirMenu() {
	        System.out.println("\n--- Menu ---");
	        System.out.println("1: Adicionar Cliente");
	        System.out.println("2: Listar Clientes");
	        System.out.println("3: Chamar Cliente");
	        System.out.println("0: Sair");
	    }

	    private static void adicionarCliente(Queue<String> filaClientes, String nomeCliente) {
	        filaClientes.add(nomeCliente);
	        System.out.println("Cliente " + nomeCliente + " adicionado à fila.");
	    }

	    private static void listarClientes(Queue<String> filaClientes) {
	        if (filaClientes.isEmpty()) {
	            System.out.println("A fila está vazia.");
	        } else {
	            System.out.println("Clientes na fila: " + filaClientes);
	        }
	    }

	    private static void chamarCliente(Queue<String> filaClientes) {
	        if (filaClientes.isEmpty()) {
	            System.out.println("A fila está vazia. Não há clientes para chamar.");
	        } else {
	            String clienteChamado = filaClientes.poll();
	            System.out.println("Cliente chamado: " + clienteChamado);
	        }
	    }
	
		
	}


