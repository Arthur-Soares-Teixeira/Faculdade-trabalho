import java.util.Scanner;

public class exercicio6{
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite os segundos: ");
        double segundos = leitor.nextDouble();

        double segundoHora = segundos / 3600;
        double segundoMinuto = segundos / 60;
        double segundoSegundos = segundos / 1;

        System.out.println("a conversão deu: " + segundoHora + " horas, " + segundoMinuto + " minutos, " + segundoSegundos + " segundos");
        leitor.close();
    }
}