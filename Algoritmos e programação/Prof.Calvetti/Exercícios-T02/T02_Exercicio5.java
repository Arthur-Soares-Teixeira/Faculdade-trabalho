import java.util.Scanner;

public class T02_Exercicio5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o raio da praça: ");
        Double raio = leitor.nextDouble();

        System.out.println("Digite o o valor do metro quadrado: ");
        Double metroQuadPreco = leitor.nextDouble();

        Double areaPraca = Math.pow(raio, 2) * Math.PI;
        Double valorFinal = areaPraca * metroQuadPreco;

        System.out.printf("O valor final do produto é: R$ %.2f", valorFinal);

        leitor.close();
    }
}
