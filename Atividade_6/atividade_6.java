package squad1_ady;
import java.util.Scanner;

/*Receber uma palavra e verificar se é palíndromo (igual de frente p/ trás e de trás p/ frente*/

public class atividade_6 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String palavra="", palavrainversa="";
		int tamanhostring;
		
		System.out.println("Digite uma palavra: ");
		
		palavra= teclado.nextLine();
		tamanhostring= palavra.length();
		
		for (int i=tamanhostring-1; i>=0; i--) {
		
			palavrainversa += palavra.substring(i,i+1); 
		}
		
		if(palavra.equals(palavrainversa)) {
			System.out.println("Eh palindromo");
		}
		else {
			System.out.println("Nao eh palindromo");
		
		}
	}

}
