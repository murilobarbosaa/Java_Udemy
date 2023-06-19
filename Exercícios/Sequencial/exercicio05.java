import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int c1, n1, c2, n2;
        double v1, v2, total;

        Scanner sc = new Scanner(System.in);

            System.out.println("Digite o código, o número e o valor das peças: ");
            c1 = sc.nextInt();
            n1 = sc.nextInt();
            v1 = sc.nextDouble();
            c2 = sc.nextInt();
            n2 = sc.nextInt();
            v2 = sc.nextDouble();

        total = (n1 * v1) + (n2 * v2);

        System.out.printf("Valor a pagar: R$ %.2f", total);

        sc.close();

    }

}
