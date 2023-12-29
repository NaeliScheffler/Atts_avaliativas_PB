
import java.util.Scanner;

public class CaixaAlta {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String texto;
        String textoCaixaAlta;

        System.out.println("Digite a seu texto que será colocada em caixa ALTA:");
        texto = sc.nextLine();

        textoCaixaAlta = texto.toUpperCase();
        System.out.println("SEU TEXTO EM CAIXA ALTA:");
        System.out.println(textoCaixaAlta);
    }
}
