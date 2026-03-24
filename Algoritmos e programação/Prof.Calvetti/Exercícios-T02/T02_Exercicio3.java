import java.util.Scanner;

public class T02_Exercicio3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o raio da base do cilindro em metros: ");
        Double raio = leitor.nextDouble();

        System.out.println("Digite a altura do cilindro em metros: ");
        Double altura = leitor.nextDouble();

        Double volume = Math.PI * Math.pow(raio, 2) * altura;

        String volFormatado = String.format("%.2f", volume);
        System.out.println("A capacidade de armazenamento do cilindro é em litros é: " + volFormatado + "L");

        leitor.close();
    }
    
}
