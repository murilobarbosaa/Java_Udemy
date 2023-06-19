package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio05 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int c, q;
        double preco;

        System.out.print("Digite o código do lanche (de 1 a 5) e a quantidade desejada: ");

        Scanner sc = new Scanner(System.in);

            c = sc.nextInt();
            q = sc.nextInt();

        if (c == 1) {
            preco = q * 4.0;
            System.out.printf("Total: R$ %.2f %n", preco);
        }
        else if (c == 2) {
            preco = q * 4.5;
            System.out.printf("Total: R$ %.2f %n", preco);
        }
        else if (c == 3) {
            preco = q * 5.0;
            System.out.printf("Total: R$ %.2f %n", preco);
        }
        else if (c == 4) {
            preco = q * 2.0;
            System.out.printf("Total: R$ %.2f %n", preco);
        }
        else {
            preco = q * 1.5;
            System.out.printf("Total: R$ %.2f", preco);
        }

        sc.close();

    }

}