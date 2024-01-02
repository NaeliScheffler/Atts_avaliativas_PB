import java.util.Scanner;
import java.lang.Math;

public class Ex10 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Me diga um numero e calcularei a raiz quadrada dele: ");
        int numero = in.nextInt();
        
        double raizQuadrada = Math.sqrt(numero);

        System.out.printf("Raiz quadrada de %d = %.2f\n", numero, raizQuadrada);
        
    }
}