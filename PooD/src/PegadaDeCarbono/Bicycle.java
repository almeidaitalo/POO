package PegadaDeCarbono;

public class Bicycle implements CarbonFootprint {

	private double milesPorAno;
	private final int perdaCalorias = 34;

	public Bicycle(double miles) {
		milesPorAno = miles;
	}

	public void setMilesPorAno(double miles) {
		milesPorAno = miles;
	}

	public double getMilesPorAno() {
		return milesPorAno;
	}

	@Override
	public String toString() {
		return String.format("%s: %.2f", "Miles por anos ", getMilesPorAno());
	}

	@Override
	public double getCarbonFootprint() {
		return milesPorAno * perdaCalorias;
	}
}
