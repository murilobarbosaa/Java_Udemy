import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int dif;

        Scanner sc = new Scanner(System.in);

            System.out.println("Digite 4 valores: ");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

        dif = (a * b) - (c * d);
        System.out.println("Diferença = " + dif);

        sc.close();
    }

}
