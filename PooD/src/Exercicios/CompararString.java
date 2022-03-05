package Exercicios;

public class CompararString {
	public static void main(String[] args) {
		String s1 = "Deus";
		String s2 = "Amor";
		int comprimento = s1.length();

		if (s1.equals(s2)) {
			System.out.println("São iguais!");
		} else {
			System.out.println("São diferentes!");
		}
		System.out.println(s2 += s1);
		System.out.println(comprimento);

	}

}
