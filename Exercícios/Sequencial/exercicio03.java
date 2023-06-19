import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int a, b, c, d, dif;

        Scanner sc = new Scanner(System.in);

            System.out.println("Digite 4 valores: ");
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            d = sc.nextInt();

        dif = (a * b) - (c * d);
        System.out.println("Diferença = " + dif);

        sc.close();
    }

}
