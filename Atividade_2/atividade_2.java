package squad1_ady;
import java.util.Scanner;

/*Receber um numero e determinar se é par ou ímpar*/

public class atividade_2 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int val1;
		
		System.out.println("Digite um valor: ");
		val1= teclado.nextInt();
	
		if (val1%2==0) {
			System.out.println("Eh par");
		}
		
		else {
			System.out.println("Eh impar");
		}
		


	}

}
