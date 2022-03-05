package Exercicios;

import java.util.Arrays;

public class Ultima {

	public static void main(String[] args) {

		Ultima array = new Ultima();
		array.executaArray();
	}

	void executaArray() {
		ordenaArray(new int[] { 10, 4, 32, 34, 543, 3456, 654, 667, 87 });
	}

	void ordenaArray(int x[]) {
		Arrays.sort(x);
		for (int i = x.length - 1; i >= 0; --i) {
			if (x[i] % 2 == 0) {
				System.out.println(x[i]);

			}
		}
		for (int i = x.length - 1; i >= 0; --i) {
			if (x[i] % 2 == 0) {
				System.out.println(x[i]);

			}
		}

	}
}
