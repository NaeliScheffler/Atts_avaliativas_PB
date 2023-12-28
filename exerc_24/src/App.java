import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int soma,numero;
        String aux_numero;


        numero = sc.nextInt(); //entra um int para que não possoa colocar letras
        aux_numero= Integer.toString(numero);

       
        if (aux_numero.charAt(0) == '-') { // retirar o - em caso de numero negativo
            aux_numero = aux_numero.substring(1);
        }

        soma = 0; 
        for (char digito : aux_numero.toCharArray()) {
            int d = Character.getNumericValue(digito);
            soma += d;
        }

        System.out.println(soma);
    }
}
