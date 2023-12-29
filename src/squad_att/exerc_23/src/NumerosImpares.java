import java.util.ArrayList;
import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int elementos_lista; // quantidade de elementos da lista
        
        Double aux_num;

        System.out.println("Qual o número de elementos da lista de números:");
        elementos_lista = sc.nextInt();
        ArrayList<Double> array_numeros = new ArrayList<>();

        for (int i = 0; i < elementos_lista; i++) {
            System.out.println("Qual número você quer adicionar na posição " + (i+1) + "º");
            aux_num = sc.nextDouble();
            array_numeros.add(aux_num);
        }
        System.out.println(array_numeros);

        PrintaImpares(array_numeros);

    }

    public static void PrintaImpares(ArrayList<Double> array){
        
        System.out.println("Os números impares são: ");
        for (double numero : array) {
            if (numero % 2 != 0) {
                System.out.print(numero+ " \n");
            }


       
    }
}
    

}
