import java.util.Scanner;

public class TesteString {
    static void main() {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite seu e-mail: ");
        String email = leitor.next();

        if (email.contains("@") && email.contains(".com")){
            System.out.println("E-mail válido.");
        } else {
            System.out.println("E-mail inválido.");
        }

        String emailSemDominio = email.substring(0, email.indexOf("@"));
        System.out.println(emailSemDominio);

        String emailComDominio = email.substring(email.indexOf("@") + 1);
        System.out.println(emailComDominio);

    }
}
