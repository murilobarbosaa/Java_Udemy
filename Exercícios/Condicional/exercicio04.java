package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int duracao;

        System.out.print("Digite a hora inicial e final do jogo: ");

        Scanner sc = new Scanner(System.in);

            int i = sc.nextInt();
            int f = sc.nextInt();

        if (i > f) {
            duracao = Math.abs(i - 24) + f;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
        else if (f > i) {
            duracao = f - i;
            System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
        }
        else {
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }

        sc.close();

    }

}
