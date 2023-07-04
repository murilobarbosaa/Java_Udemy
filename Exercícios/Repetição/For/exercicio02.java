import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int in = 0, out = 0;

        System.out.println("Digite a quantidade de valores desejado: ");
        int n = sc.nextInt();

        System.out.println("Agora digite os valores: ");
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();

            if (x >= 10 && x <= 20) {
                in += 1;
            }
            else {
                out += 1;
            }
        }

        System.out.println(in + " in");
        System.out.println(out + " out");

        sc.close();

    }

}