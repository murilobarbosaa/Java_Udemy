import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double total;

        Scanner sc = new Scanner(System.in);

            System.out.println("Digite o código, o número e o valor das peças: ");
            int c1 = sc.nextInt();
            int n1 = sc.nextInt();
            double v1 = sc.nextDouble();
            int c2 = sc.nextInt();
            int n2 = sc.nextInt();
            double v2 = sc.nextDouble();

        total = (n1 * v1) + (n2 * v2);

        System.out.printf("Valor a pagar: R$ %.2f", total);

        sc.close();

    }

}
