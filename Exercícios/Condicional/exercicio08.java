package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio08 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double salario,imposto;

        System.out.print("Digite seu salario: ");

        Scanner sc = new Scanner(System.in);

            salario = sc.nextDouble();

        if (salario <= 2000.0) {
            imposto = 0.0;
        }
        else if (salario <= 3000.0) {
            imposto = (salario - 2000.0) * 0.08;
        }
        else if (salario <= 4500.0) {
            imposto = (salario - 3000.0) * 0.18 + 1000.0 * 0.08;
        }
        else {
            imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
        }

        if (imposto == 0.0) {
            System.out.println("Isento");
        }
        else {
            System.out.printf("R$ %.2f%n", imposto);
        }

        sc.close();

    }

}