package squad1_ady;
import java.util.Scanner;

/*Receber um nome completo e exibir a quantidade de caracteres deste nome*/

public class atividade_3 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String nome; 
		
		System.out.println("Digite seu nome completo: ");
		
		nome= teclado.nextLine();
		
		System.out.println("quantidade de caracteres do nome: " +nome.length());
		 
	
	}

}
