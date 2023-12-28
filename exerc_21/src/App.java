import java.util.ArrayList;
import java.util.Scanner;

public class App {
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
        CalculaMedia(array_numeros);


    }
    public static void CalculaMedia(ArrayList<Double> array){
        double media = 0;//obrigado a inicializar a variavel
        
        for (Double numero : array){
            media += numero;

        }
        media /= array.size();
        System.out.println("A média é: "+media);
    }
}
