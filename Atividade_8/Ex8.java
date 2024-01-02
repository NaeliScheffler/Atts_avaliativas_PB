import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int [] vetor = {1, 10, 6, -8, 0};
        int maior = vetor[0];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        System.out.println("Maior valor dentro do vetor = " + maior);
    }
}