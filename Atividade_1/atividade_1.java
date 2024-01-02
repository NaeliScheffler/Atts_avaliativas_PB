package squad1_ady;
import java.util.Scanner;

/*Receber dois numeros e exibir: soma, subtração, multiplicação e divisão entre eles*/

public class atividade_1 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		int val1, val2, soma, subtracao, divisao, multiplicacao;
		
		System.out.println("Digite o primeiro valor: ");
		val1= teclado.nextInt();
		
		System.out.println("Digite o segundo valor: ");
		val2= teclado.nextInt();
		
		soma = (val1 + val2);
		subtracao = (val1 - val2);
		divisao = (val1 / val2);
		multiplicacao = (val1 * val2);
	
		System.out.println("soma: " + soma);
		System.out.println("subtracao: " + subtracao);
		System.out.println("divisao: " + divisao);
		System.out.println("multiplicacao: " + multiplicacao);
		
		
	}

}
