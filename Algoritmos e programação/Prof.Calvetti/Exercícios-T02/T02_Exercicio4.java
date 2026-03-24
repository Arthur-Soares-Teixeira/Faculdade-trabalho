import java.util.Scanner;

public class T02_Exercicio4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite a potência do aparelho em watts: ");
        Double pot = leitor.nextDouble();

        System.out.println("Digite a quantidade de horas de uso por dia: ");
        Double horas = leitor.nextDouble();

        System.out.println("Digite a quantidade cobrada por horas de Kilowatts: ");
        Double precoKwh = leitor.nextDouble();

        Double energiaConsumida = (pot * horas * 30) / 1000; 
        Double valorEnergia = energiaConsumida * precoKwh; 

        System.out.printf("o custo mensal desse aparelho sera: R$ %.2f", valorEnergia);

        leitor.close();
    }
}
