package Exercicios;

import java.util.Scanner;

public class QuestaoUri {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int distancia = 0;

		float combustivel = 0;
		
		System.out.println("Digite a dist�ncia percorrida");  
		distancia = input.nextInt();
		
		System.out.println("Digite o combustivel gasto");
		combustivel = input.nextFloat();

		
		System.out.println("O consumo m�dio do combustivel do seu veiculo �: " + distancia/combustivel);
		
        input.close();
}
}

