package PegadaDeCarbono;

public class Building implements CarbonFootprint {

	private double mediaConsumoMensalKwh;
	private final int mesesDoAno = 12;

	public Building(double consumoMensal) {
		mediaConsumoMensalKwh = consumoMensal;
	}

	public void setMediaConsumoMensalKwh(double consumoMensal) {
		mediaConsumoMensalKwh = consumoMensal;
	}

	public double getMediaConsumoMensalKwh() {
		return mediaConsumoMensalKwh;
	}

	@Override
	public String toString() {
		return String.format("%s: %.2f", "O Consumo de meses é ", getMediaConsumoMensalKwh());
	}

	@Override
	public double getCarbonFootprint() {
		return getMediaConsumoMensalKwh() * mesesDoAno;
	}
}
