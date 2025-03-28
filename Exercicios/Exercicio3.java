import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entre com a quantidade de alunos: ");
        int quantidadeAlunos = scanner.nextInt();

        System.out.print("Entre com a nota dos alunos separadas por espaço: ");
        int[] notas = new int[quantidadeAlunos];
        for (int i = 0; i < quantidadeAlunos; i++) {
            notas[i] = scanner.nextInt();
        }
        int[] faixas = new int[4]; // Índices: 0 = 0-2, 1 = 3-5, 2 = 6-8, 3 = 9-10

        for (int nota : notas) {
            if (nota >= 0 && nota <= 2) {
                faixas[0]++;
            } else if (nota >= 3 && nota <= 5) {
                faixas[1]++;
            } else if (nota >= 6 && nota <= 8) {
                faixas[2]++;
            } else if (nota >= 9 && nota <= 10) {
                faixas[3]++;
            }
        }
        String[] labels = { "0 − 2", "3 − 5", "6 − 8", "9 − 10" };
        for (int i = 0; i < faixas.length; i++) {
            System.out.print(labels[i] + " | ");
            for (int j = 0; j < faixas[i]; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        scanner.close();
    }
}