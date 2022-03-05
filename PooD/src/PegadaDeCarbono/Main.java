package PegadaDeCarbono;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		ArrayList<CarbonFootprint> opcao = new ArrayList<CarbonFootprint>();
		// Digite todos os dados para aparecer o resultado da pegada de carbono de todas
		// classes
		System.out.println("\tClasse carro");
		System.out.println("Digite a quantidade de anos:");
		double mediaAno = entrada.nextDouble();
		System.out.println("Digite a quantidade de litros de gasolina:");
		double mediaPorLitro = entrada.nextDouble();
		Car s = new Car(mediaAno, mediaPorLitro);
		s.setMediaAno(mediaAno);
		s.setMediaPorLitro(mediaPorLitro);
		opcao.add(s);

		System.out.println("\tClasse edificio \nQuantidade de energia gasta na construção \npor hora durante 12 meses");
		System.out.println("Digite o consumo mensal kwh:");
		double mediaConsumoMensalKwh = entrada.nextDouble();
		Building e = new Building(mediaConsumoMensalKwh);
		e.setMediaConsumoMensalKwh(mediaConsumoMensalKwh);
		opcao.add(e);

		System.out.println("\tClasse Bicycle \nA perda de calorias utilizando bicicleta");
		System.out.println("Digite miles anuais:");
		double milesPorAno = entrada.nextDouble();
		Bicycle b = new Bicycle(milesPorAno);
		b.setMilesPorAno(milesPorAno);
		opcao.add(b);

		for (CarbonFootprint currentObject : opcao) {
			System.out.printf("\n%s: %s \n%s %s: %.2f\n", "Informacões sobre ", currentObject.getClass().getName(),
					currentObject.toString(), "\nCarbono footprint é ", currentObject.getCarbonFootprint());
		}
		entrada.close();
	}
}
