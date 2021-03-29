package com.ti2cc;

import java.util.Scanner;

public class Principal {
	public static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		DAO dao = new DAO();
		dao.conectar();
		
		//Inserir um elemento na tabela
		int opcao = -1;
	    do{
			System.out.println("\n==================================================");
			System.out.println(" 1) Listar         							    ");
	        System.out.println(" 2) Inserir        	 							 	");
			System.out.println(" 3) Exluir         	  							 	");
	        System.out.println(" 4) Atualizar      	 							    ");
			System.out.println(" 0) Sair           							    ");
			System.out.println("==================================================\n");

			System.out.print("\n Selecione uma Opcao! \n");
			opcao = entrada.nextInt();

			switch (opcao) {
			case 1:
	                System.out.println("==== Mostrar Players === ");
	                Player[] players = dao.getPlayer();
	                for(int i = 0; i < players.length; i++) {
	                    System.out.println(players[i].toString());
	                }

				break;
			case 2:
				Player player = new Player(145, "playerAnna@gmail.com", "anna1", "Artemis",'F');
	            if(dao.inserirPlayer(player) == true) {
	                System.out.println("Inserção com sucesso -> " + player.toString());
	            }
				break;

	        case 3:
	            //Excluir Nick
	            dao.excluirPlayer(player.getNickName());
				break;    
	                   
			case 4:
	            //Atualizar player
				player.setCodigo(000);
	            dao.atualizarPlayer(player);
				break;

			case 0:
				break;
			default:
				System.out.println("Opção Inválida!");
				break;
			}
		} while(opcao != 0);

		dao.close();
	}
}
