import java.util.Locale;
import java.util.Scanner;

public class exercicio03 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de casos desejada: ");
        int n = sc.nextInt();

        double media = 0;

        for (int i = 0; i < n ; i++ ) {
            System.out.print("Digite suas notas: ");
            double nota1 = sc.nextDouble();
            double nota2 = sc.nextDouble();
            double nota3 = sc.nextDouble();

            media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10;

            System.out.printf("Média das notas: %.1f %n ", media);
        }

        sc.close();

    }

}