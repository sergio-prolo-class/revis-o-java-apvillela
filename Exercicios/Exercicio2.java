import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nota 1: ");
        double nota1 = sc.nextDouble();
        System.out.println("Nota 2: ");
        double nota2 = sc.nextDouble();
        System.out.println("Nota 3: ");
        double nota3 = sc.nextDouble();

        double notaFinal = ((((nota1 * 2) + (nota2 * 3)) / 5) * (0.9)) + (nota3 * (0.1));
        System.out.println("Nota final: " + notaFinal);

    }
}
