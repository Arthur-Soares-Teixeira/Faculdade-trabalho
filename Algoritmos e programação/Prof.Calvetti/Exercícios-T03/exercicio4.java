import java.util.Scanner;

public class exercicio4 {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite o valor monetário: ");
        double valor = leitor.nextDouble();

        //calculo
        double conversão = valor * 5;

        //saida de dados
        System.out.println("R$" + valor + " em doláres é: " + "$" + conversão);
        leitor.close();
    }
}