package squad1_ady;
import java.util.Scanner;

/*Receber uma String e informar o numero de vogais*/

public class atividade_5 {
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		String palavra;
		int tamanhostring;
		int quantidadevogais=0;
		
		System.out.println("Digite uma palavra: ");
		
		palavra= teclado.nextLine();
		tamanhostring= palavra.length();
		
		for (int i=0; i<tamanhostring; i++) {
		
			String letra;
			letra= palavra.substring(i,i+1);
			
			if (letra.equals("a") || letra.equals("A") || letra.equals("e") || letra.equals("E") || letra.equals("i") || letra.equals("I") 
					|| letra.equals("o") || letra.equals("O") || letra.equals("u") || letra.equals("U"))
				
				quantidadevogais ++;
			
		}
		
		System.out.print("Quantidade de vogais: " +quantidadevogais);
	}

}
