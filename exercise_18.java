package application;

import java.util.Collections;
import java.util.Vector;
import java.util.Locale;
import java.util.Scanner;

public class exercise_18 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);

		Vector<Integer> vec = new Vector<Integer>();

		char answer = '\0';

		do {
			//lendo valores para o vetor
			System.out.println("Entre um valor inteiro: ");
			int num = sc.nextInt();
			vec.add(num);
			System.out.println("");
			//quantidade de valores para o vetor/ param ao inserir 'n'
			System.out.println("digite 'n' para encerrar o programa ou entre outro caractere para continuar!");
			answer = sc.next().charAt(0);
			System.out.println("");
		} while (answer != 'n');

		System.out.println("Elementos do vetor: " + vec);

		System.out.println("O menor elemento do vetor e: " + Collections.min(vec));
		sc.close();
	}

}
