package application;

import java.util.Locale;
import java.util.regex.Pattern;

import java.util.Scanner;

public class exercise_13 {

	// Funcao para substituir todas as ocorrencias
	// do caractere c1 com o caractere c2

	static void replaceCharacter(String str, char c1, char c2) {
		int j = 0;

		// trim = removendo whitespaces
		int n = str.trim().length();
		boolean b = Character.isLetter(c1);
		String trimmedstr = str.trim();
		// passando string para array de char
		char[] c = trimmedstr.toCharArray();
		boolean d = Character.isLetter(c2);

		if (!str.isBlank()) {
			if (Pattern.matches("[a-zA-Z]+", trimmedstr) && b == true && d == true) {
				// array de char utilizada com laço para comparacao de caracteres
				// com os caracteres de c1 e c2 para realizacao da substituicao
				for (int i = 0; i < n; i++) {
					if (c[i] != c1) {
						c[j++] = c[i];
					} else {
						c[j++] = c2;
					}
				}
				System.out.println(c);
			} else {
				System.out.println("outros caracteres dectados");
			}
		} else {
			System.out.println("String vazia");
		}
	}

	public static void main(String[] args) {

		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);

		// string entrada
		System.out.println("Entre uma palavra: ");
		String str = sc.nextLine();

		System.out.println("Entre uma letra: ");
		String c1 = sc.nextLine();
		System.out.println("Entre outra letra: ");
		String c2 = sc.nextLine();

		String trimmedc1 = c1.trim();
		String trimmedc2 = c2.trim();

		char first = trimmedc1.charAt(0);
		char first2 = trimmedc2.charAt(0);

		// chamando funcao de substituicao
		replaceCharacter(str, first, first2);

		// imprime string atualizada
		// System.out.println(c);
		sc.close();

	}

}
