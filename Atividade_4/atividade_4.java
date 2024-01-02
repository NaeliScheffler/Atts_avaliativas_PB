package squad1_ady;
import java.util.Scanner;

/*Receber uma String e inverte-la*/

public class atividade_4 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String palavra;
		int tamanhostring;
		
		System.out.println("Digite uma palavra: ");
		
		palavra= teclado.nextLine();
		tamanhostring= palavra.length();
		
		for (int i=tamanhostring-1; i>=0; i--) {
		
			System.out.print(palavra.substring(i,i+1));
		}
	}

}
