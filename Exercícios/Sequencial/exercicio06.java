import java.util.Locale;
import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        double triangulo, circulo, trapezio, quadrado, retangulo;

        Scanner sc = new Scanner(System.in);

            System.out.println("Digite os valores : ");
            double a = sc.nextDouble();
            double b = sc.nextDouble();
            double c = sc.nextDouble();

        triangulo = (a * c) / 2;
        circulo = 3.14159 * Math.pow(c, 2.0);
        trapezio = (a + b) * c / 2;
        quadrado = b * b;
        retangulo = a * b;

        System.out.printf("TRIÂNGULO = %.2f %n", triangulo);
        System.out.printf("CÍRCULO = %.2f %n", circulo);
        System.out.printf("TRAPÉZIO = %.2f %n", trapezio);
        System.out.printf("QUADRADO = %.2f %n", quadrado);
        System.out.printf("RETÂNGULO = %.2f %n", retangulo);

        sc.close();

    }

}
