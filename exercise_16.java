package application;

import java.util.Locale;
import java.util.Scanner;

public class exercise_16 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.UK);
		Scanner sc = new Scanner(System.in);

		int cont = 0;
		double sum = 0;
		double sumW = 0;

		while (cont < 3) {
			cont++;
			System.out.println("entre sua nota: ");
			double grade = sc.nextFloat();
			System.out.println("entre peso " + cont + ": ");
			double w = sc.nextFloat();
//soma da notas vezes os seus pesos
			sum = sum + grade * w;
			//soma dos pesos das notas
			sumW = sumW + w;

		}
//imprime a media ponderada atraves de sua respectiva formula
		System.out.printf("%.2f%n", sum / sumW);

		sc.close();
	}

}
