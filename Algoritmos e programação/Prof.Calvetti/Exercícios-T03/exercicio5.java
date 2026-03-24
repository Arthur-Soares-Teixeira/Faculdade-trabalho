import java.util.Scanner;

public class exercicio5{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite sua altura: ");
        Double altura = leitor.nextDouble();

        System.out.println("Digite seu peso: ");
        Double peso = leitor.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Seu indice de massa corporal é: " + imc);
        leitor.close();
    }
}