package Exercicios;

import java.util.Scanner;

public class SistemaCompraPassagem {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		boolean[] PrimeiraClasse = new boolean[10];
		boolean[] classeEconomica = new boolean[10];
		int opcao;

		/*
		 * Primeira Classe: digite o numero um 5 vezes, at� chegar o fim loop, assim
		 * classe ficar� lotada, automaticamente ir� para a proxima classe econ�mica
		 */

		do {
			System.out.println(
					"Menu de op��o:\n1.Por favor, Digite 1 para Primeira Classe\n2.digite 2 para Classe Econ�mica");
			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				for (int count = 0; count <= 5; count++) {
					if (PrimeiraClasse[count] == false) {
						PrimeiraClasse[count] = true;
						System.out.println("\tCart�o de embarque:\nPrimeira Classe\nPoltrona N�:" + (count + 1));

						break;
					}
				}

				if (PrimeiraClasse[4] == true) {
					System.out.println(
							"Primeira Classe est� lotada, gostaria de outra poltrona na classe econ�mica? (S/N)");
					scan.nextLine();
					String classe = scan.next();

					if (classe.equalsIgnoreCase("S/N")) {

						System.out.println("v�o parte as 3 horas.");

						for (int count = 0; count <= 5; count++) {
							if (classeEconomica[count] == false) {
								classeEconomica[count] = true;
								System.out.println("\tCart�o de embarque:\n1.Poltrona N� \n2.Primeira Classe");

								break;
							}
						}
						if (classeEconomica[5] == true) {
							System.out.println("N�o existem poltrona disponiveis nas classes");

						}
					}
				}
				break;

			case 2:
				for (int count = 0; count <= 5; count++) {
					if (classeEconomica[count] == false) {
						classeEconomica[count] = true;
						System.out.println("\tCart�o de embarque:\nClasse Econ�mica\nPoltrona N�:" + (count + 1));

						break;
					}
				}

				if (classeEconomica[5] == true) {
					System.out.println(
							"Classe econ�mica est� lotada, gostaria de outra poltrona na primeira classe? (S/N)");
					scan.nextLine();
					String classe = scan.next();

					if (classe.equalsIgnoreCase("S/N")) {
						System.out.println("v�o parte as 3 horas.");

						break;
					}
				}
				if (PrimeiraClasse[5] == true) {
					System.out.println("N�o existem poltrona disponiveis nas classes");

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
