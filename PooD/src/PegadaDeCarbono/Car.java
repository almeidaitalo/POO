package PegadaDeCarbono;

public class Car implements CarbonFootprint {

	private double mediaAno;
	private double mediaPorLitro; // media por litro de gasolina
	private final int kgCO2 = 9; // total de kg CO2 emitido por litro.

	public Car(double media, double PorLitro) {
		mediaAno = media;
		mediaPorLitro = PorLitro;
	}

	public void setMediaAno(double media) {
		mediaAno = media;
	}

	public void setMediaPorLitro(double PorLitro) {
		mediaPorLitro = PorLitro;
	}

	public double getMediaAno() {
		return mediaAno;
	}

	public double getMediaPorLitro() {
		return mediaPorLitro;
	}

	@Override // modificador de metodos
	public String toString() {
		return String.format("%s: %.2f \n%s: %.2f ", "Media por ano ", getMediaAno(), "Media por litro de gasolina ",
				getMediaPorLitro());
	}

	@Override
	public double getCarbonFootprint() {
		return ((getMediaAno() * getMediaPorLitro()) * kgCO2);
	}
}
