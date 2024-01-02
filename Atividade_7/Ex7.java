import java.util.Scanner;

/*Desenvolva um programa que calcule a média de uma lista de
números fornecidos pelo usuário.
*/

public class Ex7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Monte uma lista de numeros e lhe direi a media deles: ");
        System.out.println("Tamanho da lista: ");
        int tam = in.nextInt();
        Double [] vetorNumeros = new Double[tam];
        Double media = 0.0;

        for (int i = 0; i < tam; i++) {
            System.out.print(i+1 + "° Valor: ");
            vetorNumeros[i] = in.nextDouble();
            media += vetorNumeros[i];
        }

        media = media / tam;

        System.out.println("Media dos valores = " + media); // a

    }
}