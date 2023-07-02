package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.print("Digite um número: ");

        Scanner sc = new Scanner(System.in);

            double x = sc.nextDouble();

        if (x >= 0 && x <= 100) {
            if (x <= 25) {
                System.out.println("Intervalo [0, 25]");
            }
            else if (x <= 50 ) {
                System.out.println("Intervalo [25, 50]");
            }
            else if (x <= 75) {
                System.out.println("Intervalo [50, 75]");
            }
            else {
                System.out.println("Intervalo [75, 100]");
            }
        }
        else {
            System.out.println("Fora do Intervalo");
        }

        sc.close();

    }

}
