import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Informe numeros e lhe direi se eles sao primos (digite 0 para terminar: )");
        int numero;
        while (true) {
            System.out.print("Numero: ");
            numero = in.nextInt();
            if (numero == 0) {
                System.out.println("Encerrando programa...");
                break;
            }
            if (numero == 2 || numero == 3 || numero == 5 || numero == 7) {
                System.out.println("O numero " + numero + " eh primo!");
            } else if (numero % 2 != 0 && numero % 3 != 0 && numero % 5 != 0 && numero % 7 != 0) {
                System.out.println("O numero " + numero + " eh primo!");
            }
        }
    }
}