import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número: ");
        int n = sc.nextInt();

        int fatorial = 1;
        for (int i = 1; i <= n ; i++) {
            fatorial = fatorial * i;
        }

        System.out.print("Fatorial: " + fatorial);

        sc.close();

    }

}