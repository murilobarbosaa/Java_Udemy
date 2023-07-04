import java.util.Locale;
import java.util.Scanner;

public class exercicio07 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantas linhas deseja: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            double segundo = Math.pow(i, 2);
            double terceiro = Math.pow(i, 3);

            System.out.printf("%d %.0f %.0f %n", i, segundo, terceiro);
        }

        sc.close();

    }

}