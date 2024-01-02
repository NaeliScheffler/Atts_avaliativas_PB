import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Monte uma lista de numeros e lhe direi quais sao pares: ");
        System.out.println("Tamanho da lista: ");
        int tam = in.nextInt();
        int [] vetorNumeros = new int[tam];

        for (int i = 0; i < tam; i++) {
            System.out.print(i+1 + "° Valor: ");
            vetorNumeros[i] = in.nextInt();
        }
        System.out.print("Os numeros pares sao: ");
        for (int i = 0; i < tam; i++) {
            if (vetorNumeros[i] % 2 == 0) {
                System.out.print(vetorNumeros[i] + ", ");
            }
        }

    }
}