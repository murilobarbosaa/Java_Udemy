import java.util.Locale;
import java.util.Scanner;

public class exercicio01 {

    public static void main (String[] args) {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int senha = 2002;

        System.out.print("Digite a senha: ");

        int tentativa = sc.nextInt();

        while (tentativa != senha) {
            System.out.println("Senha Inválida");
            tentativa = sc.nextInt();
        }

        System.out.println("Acesso Permitido");

        sc.close();

    }
}