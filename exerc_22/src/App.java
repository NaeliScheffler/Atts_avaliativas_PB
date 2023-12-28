import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma string: ");
        String palavra = scanner.nextLine();

        boolean ehPalindromo = true;

        for (int i = 0; i < palavra.length() / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(palavra.length() - 1 - i)) { //o -1 para pegar o ultimo da lista, por causa da indexação da string começar em 0
                ehPalindromo = false;
                break;
            }
        }

        if (ehPalindromo) {
            System.out.println("A string é um palíndromo.");
        } else {
            System.out.println("A string não é um palíndromo.");
        }
    }
}