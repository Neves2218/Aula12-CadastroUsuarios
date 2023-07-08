import java.util.Scanner;

public class Ola {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] nome = new String[5];
        int[] idade = new int[5];
        String[] sexo = new String[5];

        for (int i= 0; i < 5; i++) {
            System.out.println("-----Cadastro de Usuário------");
            System.out.print("Digite o nome: ");
            nome[i] =sc.next();
            System.out.print("Digite a idade do usuário: ");
            idade[i] =sc.nextInt();
            System.out.print("Digite o sexo do usuário: ");
            sexo[i] =sc.next();

        }

        System.out.print("lista users");

        for (int i= 0; i < 5; i++) {
            System.out.println("Nome: " + nome[i] + " - idade: " + idade[i] + " - Sexo: " + sexo[i]);

        }
    }
}
