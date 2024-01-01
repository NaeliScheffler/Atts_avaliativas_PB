package application;

import java.util.Locale;
import java.util.Scanner;


public class exercise_17 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre uma palavra: ");
		String str = sc.nextLine();
		//usando trim para remover os whitespaces pre and pos string
		String trimmedstr = str.trim();
		System.out.println(trimmedstr);

		sc.close();
	}

}
