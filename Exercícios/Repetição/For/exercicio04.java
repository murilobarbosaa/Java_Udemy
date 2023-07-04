import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantas divisões deseja fazer: ");
        int n = sc.nextInt();

        double resultado = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite os valores: ");

            double x = sc.nextDouble();
            double y = sc.nextDouble();

            if (y == 0) {
                System.out.println("Divisão Impossível");
            }
            else {
                resultado = x / y;
                System.out.printf("Resultado: %.1f %n", resultado);
            }
        }

        sc.close();

    }

}