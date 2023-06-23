import java.util.Locale;
import java.util.Scanner;

public class exercicio02 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double area;
        double pi = 3.14159;

        Scanner sc = new Scanner(System.in);

            System.out.println("Digite o valor do raio: ");
            double raio = sc.nextDouble();

        area = pi * Math.pow(raio, 2.0);
        System.out.println("Área = " + area);

        sc.close();

    }

}
