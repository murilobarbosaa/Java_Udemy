package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int x;

        System.out.print("Digite um valor: ");

        Scanner sc = new Scanner(System.in);

            x = sc.nextInt();

        if (x % 2 == 0) {
            System.out.println("PAR");
        }
        else {
            System.out.println("ÍMPAR");
        }

        sc.close();

    }

}