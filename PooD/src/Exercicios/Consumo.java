package Exercicios;

	import java.io.IOException;
	import java.util.Scanner;

	public class Consumo {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a distância percorrida");
		int x = sc.nextInt();
		System.out.println("Digite o combustivel gasto");
		double y = sc.nextDouble();
		double media = x / y;
		System.out.println(String.format("%.3f km/l", media));  
		
		sc.close();
		}


	}

