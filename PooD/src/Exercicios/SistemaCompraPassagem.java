package Exercicios;

import java.util.Scanner;

public class SistemaCompraPassagem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean[] PrimeiraClasse = new boolean[10];
		boolean[] classeEconomica = new boolean[10];
		int opcao;

		/*
		 * Primeira Classe: digite o numero um 5 vezes, até chegar o fim loop, assim
		 * classe ficará lotada, automaticamente irá para a proxima classe econômica
		 */

		do {
			System.out.println(
					"Menu de opção:\n1.Por favor, Digite 1 para Primeira Classe\n2.digite 2 para Classe Econômica");
			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				for (int count = 0; count <= 5; count++) {
					if (PrimeiraClasse[count] == false) {
						PrimeiraClasse[count] = true;
						System.out.println("\tCartão de embarque:\nPrimeira Classe\nPoltrona Nº:" + (count + 1));

						break;
					}
				}

				if (PrimeiraClasse[4] == true) {
					System.out.println(
							"Primeira Classe está lotada, gostaria de outra poltrona na classe econômica? (S/N)");
					scan.nextLine();
					String classe = scan.next();

					if (classe.equalsIgnoreCase("S/N")) {

						System.out.println("vôo parte as 3 horas.");

						for (int count = 0; count <= 5; count++) {
							if (classeEconomica[count] == false) {
								classeEconomica[count] = true;
								System.out.println("\tCartão de embarque:\n1.Poltrona Nº \n2.Primeira Classe");

								break;
							}
						}
						if (classeEconomica[5] == true) {
							System.out.println("Não existem poltrona disponiveis nas classes");

						}
					}
				}
				break;

			case 2:
				for (int count = 0; count <= 5; count++) {
					if (classeEconomica[count] == false) {
						classeEconomica[count] = true;
						System.out.println("\tCartão de embarque:\nClasse Econômica\nPoltrona Nº:" + (count + 1));

						break;
					}
				}

				if (classeEconomica[5] == true) {
					System.out.println(
							"Classe econômica está lotada, gostaria de outra poltrona na primeira classe? (S/N)");
					scan.nextLine();
					String classe = scan.next();

					if (classe.equalsIgnoreCase("S/N")) {
						System.out.println("vôo parte as 3 horas.");

						break;
					}
				}
				if (PrimeiraClasse[5] == true) {
					System.out.println("Não existem poltrona disponiveis nas classes");

				}

				break;

			case 3:
				System.out.println("Sistema Finalizado!");
			}

		}

		while (opcao != 3);
        scan.close();
	}

}
