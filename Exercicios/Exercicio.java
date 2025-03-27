import java.util.Scanner;

class Exercicio {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe seu nome: ");
        String nome = sc.nextLine();

        System.out.println("Entre com o ano que nasceu: ");
        int anoNascimento = sc.nextInt();

        System.out.println("Entre com o ano atual: ");
        int anoAtual = sc.nextInt();

        int idade = anoAtual - anoNascimento;

        if (idade == 1) {
            System.out.println(nome + ", possui " + idade + " ano");
        } else

            System.out.println(nome + ", possui " + idade + " anos");

    }
}
