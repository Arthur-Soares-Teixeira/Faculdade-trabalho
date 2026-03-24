import java.util.Scanner;

public class exercicio1 {
    public static void main (String[] args){
        Scanner leitor = new Scanner(System.in);

        //entrada de dados
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();

        System.out.println("Digite sua altura: ");
        double altura = leitor.nextDouble();

        //saida de dados
        System.out.println("Seu nome é: " + nome + ", você tem: " + idade + " anos de idade e " + altura + " metros de altura");
        leitor.close();
    }
}