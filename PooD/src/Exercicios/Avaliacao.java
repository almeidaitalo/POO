package Exercicios;

/*3) Crie um programa em Java que 
leia um número inteiro e imprima o seu antecessor e seu sucessor. */

import java.util.Scanner;

public class Avaliacao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int numero, antecessor, sucessor;

		System.out.println("Informe um número: ");
		numero = scan.nextInt();

		antecessor = numero - 1;
		sucessor = numero + 1;

		System.out.println("O antecessor é " + antecessor + "e o sucessor é " + sucessor);

		scan.close();

	}

}


