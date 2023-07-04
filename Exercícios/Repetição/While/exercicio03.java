import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int code = sc.nextInt();
        int alcohol = 0, gas = 0, diesel = 0;

        while (code != 4) {
            if (code == 1) {
                alcohol += 1;
            }
            else if (code == 2) {
                gas += 1;
            }
            else if (code == 3) {
                diesel += 1;
            }
            code = sc.nextInt();
        }

        System.out.println("Muito obrigado");
        System.out.println("Álcool: " + alcohol);
        System.out.println("Gasolina: " + gas);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}