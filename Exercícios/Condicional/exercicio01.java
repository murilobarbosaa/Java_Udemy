package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        System.out.print("Digite um valor: ");
        Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();

        if (x > 0) {
            System.out.println("NÃO NEGATIVO");
        }
        else {
            System.out.println("NEGATIVO");
        }

        sc.close();

    }

}
