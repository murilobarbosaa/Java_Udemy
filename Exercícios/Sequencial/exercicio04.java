import java.util.Locale;
import java.util.Scanner;

public class exercicio04 {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        int numero, horas;
        double valor, salario;

        Scanner sc = new Scanner(System.in);

            System.out.println("Digite seu número, suas horas trabalhadas e o valor que recebe por hora: ");
            numero = sc.nextInt();
            horas = sc.nextInt();
            valor = sc.nextDouble();

        salario = horas * valor;

        System.out.println("NUMBER = " + numero);
        System.out.println("SALARY = U$ " + salario);

        sc.close();

    }

}
