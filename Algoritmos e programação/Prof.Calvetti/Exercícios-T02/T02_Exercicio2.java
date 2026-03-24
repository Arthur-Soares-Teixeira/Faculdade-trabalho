import java.util.Scanner;

public class T02_Exercicio2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o valor em reais: ");
        Double reais = leitor.nextDouble();

        System.out.println("Digite a cotação atual do dólar: ");
        Double cotaçao = leitor.nextDouble();

        Double conversao = reais * cotaçao;

        String conversãoFormatada = String.format("%.2f", conversao);
        System.out.println("O valor em dólares é: " + conversãoFormatada);

        leitor.close();


    }
}
