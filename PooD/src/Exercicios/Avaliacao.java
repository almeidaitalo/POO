package Exercicios;

/*3) Crie um programa em Java que 
leia um n�mero inteiro e imprima o seu antecessor e seu sucessor. */

import java.util.Scanner;

public class Avaliacao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero, antecessor, sucessor;

		System.out.println("Informe um n�mero: ");
		numero = scan.nextInt();

		antecessor = numero - 1;
		sucessor = numero + 1;

		System.out.println("O antecessor � " + antecessor + "e o sucessor � " + sucessor);

		scan.close();

	}

}


