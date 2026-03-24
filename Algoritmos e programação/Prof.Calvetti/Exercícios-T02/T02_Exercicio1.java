import java.util.Scanner;

public class T02_Exercicio1 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite a distância em Km: ");
        Double km = leitor.nextDouble();

        System.out.print("Digite o tempo gasto em horas: ");
        Double horas = leitor.nextDouble();

        Double mediaKm = km / horas;
        Double mediaMs = mediaKm / 3.6;

        String kmFormatado = String.format("%.2f", mediaKm); //testando esse maneira de formatação
        String msFormatado = String.format("%.2f", mediaMs);
        System.out.println("A velocidade média é: " + kmFormatado + " em Km/h" + " ou " + msFormatado + " em m/s");

        leitor.close();

    }

}
