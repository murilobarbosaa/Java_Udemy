package Condicional;

import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args){

        Locale.setDefault(Locale.US);

        System.out.print("Digite 2 números: ");

        Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();
            int y = sc.nextInt();

        if (x % y == 0 || y % x == 0)  {
            System.out.println("São múltiplos");
        }
        else {
            System.out.println("Não são múltiplos");
        }

        sc.close();

    }

}
