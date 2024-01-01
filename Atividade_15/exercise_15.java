package application;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Pattern;

public class exercise_15 {

	static void countCharacter(String str, char c1) {
		int cont = 0;

		// trim = removendo whitespaces
		int n = str.trim().length();
		boolean b = Character.isLetter(c1);
		String trimmedStr = str.trim();
		// passando string para array de char
		char[] c = trimmedStr.toCharArray();

		if (!str.isBlank()) {
			if (Pattern.matches("[a-zA-Z]+", trimmedStr) && b == true) {
				// array de char utilizada com laço para comparacao de caracteres
				// com o caracteres de c1 para realizacao da contagem de ocorrencias
				for (int i = 0; i < n; i++) {
					if (c[i] == c1) {
						cont = cont + 1;
					}
				}
				System.out.println(
						"numero de vezes que a determinada letra " + c1 + " aparece na palavra " + trimmedStr + ": " + cont);
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
		String trimmedStr = str.trim();
		System.out.println("Entre uma letra: ");
		String letter = sc.nextLine();
		String trimmedLetter = letter.trim();
		char first = trimmedLetter.charAt(0);

		// chamando funcao de contagem de caractere
		countCharacter(trimmedStr, first);
		sc.close();
	}

}

