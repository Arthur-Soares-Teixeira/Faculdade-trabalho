import java.util.Scanner;

public class exercicio2 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite o tamanho do lado do quadrado: ");
        double tamanhoLado = leitor.nextDouble();

        //calculo
        double areaQuadrado = tamanhoLado * tamanhoLado;

        //saida de dados
        System.out.println("Área do quadrado é igual: " + areaQuadrado);

        leitor.close();
    }
}