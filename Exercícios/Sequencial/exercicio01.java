import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int soma;

        Scanner sc = new Scanner(System.in);

            System.out.println("Digite o primeiro valor: ");
            int x = sc.nextInt();
            System.out.println("Digite o segundo valor: ");
            int y = sc.nextInt();

        soma = x + y;
        System.out.println("Soma = " + soma);

        sc.close();

    }

}
