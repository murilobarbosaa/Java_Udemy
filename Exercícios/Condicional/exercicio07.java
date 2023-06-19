package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio07 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double x, y;

        System.out.print("Digite dois valores: ");

        Scanner sc = new Scanner(System.in);

            x = sc.nextDouble();
            y = sc.nextDouble();

        if (x == 0.0 && y == 0.0) {
            System.out.println("Origem");
        }
        else if (x == 0) {
            System.out.println("Eixo Y");
        }
        else if (y == 0) {
            System.out.println("Eixo X");
        }
        else if (x > 0.0 && y > 0.0) {
            System.out.println("Q1");
        }
        else if (x < 0.0 && y > 0.0) {
            System.out.println("Q2");
        }
        else if (x < 0.0 && y < 0.0) {
            System.out.println("Q3");
        }
        else {
            System.out.println("Q4");
        }

        sc.close();

    }

}