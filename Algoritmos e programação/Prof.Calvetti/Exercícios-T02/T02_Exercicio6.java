import java.util.Scanner;

public class T02_Exercicio6 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite o tamanho do primeiro cateto: ");
        Double cateto1 = leitor.nextDouble();

        System.out.println("Digite o tamanho do segundo cateto: ");
        Double cateto2 = leitor.nextDouble();

        Double pot1 = Math.pow(cateto1, 2);
        Double pot2 = Math.pow(cateto2, 2);

        Double hip = Math.sqrt(pot1 + pot2);

        System.out.println("O valor da hipotenusa do triangulo é: " + hip);

        leitor.close();
    }
}