import java.util.Scanner;

public class exercicio3 {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite a primeira nota: ");
        double nota1 = leitor.nextDouble();

        System.out.println("Digite a segunda nota: ");
        double nota2 = leitor.nextDouble();

        System.out.println("Digite a terceira nota: ");
        double nota3 = leitor.nextDouble();

        //calculo
        double mediaNotas = (nota1 + nota2 + nota3) / 3;

        //saida de dados
        System.out.println("A média da nota é: " + mediaNotas);
        leitor.close();
    }
}