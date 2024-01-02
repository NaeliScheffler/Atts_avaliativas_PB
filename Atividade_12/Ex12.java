import java.util.Scanner;

public class Ex12 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int[] vetor = {10, 5, 14, -8, 0};
        int variavelAuxiliar;
        
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = i + 1; j < vetor.length; j++) {
                if (vetor[i] > vetor[j]) {
                    variavelAuxiliar = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = variavelAuxiliar;
                }
            }
        }
        System.out.println("Valores em ordem crescente: ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + ", ");
        }
    }


}