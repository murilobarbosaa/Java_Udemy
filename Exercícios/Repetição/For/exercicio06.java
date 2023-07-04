import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        int n = sc.nextInt();

        System.out.print("Divisores de " + n + " :");
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.print(" " + i);
            }
        }

        sc.close();

    }

}