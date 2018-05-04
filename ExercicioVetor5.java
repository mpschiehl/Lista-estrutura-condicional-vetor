import java.util.Scanner;

public class ExercicioVetor5{
    public static void main(String[]args){
        double [] pesos = new double[5];
        Scanner teclado = new Scanner(System.in);

        // Solicitacao de dados
        System.out.println("Informe o 1° peso");
        pesos[0] = Double.parseDouble(teclado.nextLine());

        System.out.println("Informe o 2° peso");
        pesos[1] = Double.parseDouble(teclado.nextLine());

        System.out.println("Informe o 3° peso");
        pesos[2] = Double.parseDouble(teclado.nextLine());

        System.out.println("Informe o 4° peso");
        pesos[3] = Double.parseDouble(teclado.nextLine());

        System.out.println("Informe o 5° peso");
        pesos[4] = Double.parseDouble(teclado.nextLine());

        //calculos

        double soma = pesos[0]+pesos[1]+pesos[2]+pesos[3]+pesos[4] , media = soma/pesos.length;

        //Apresentado resuldados

        System.out.println("A soma do pesos: "+ soma + "\nA media dos pesos "+ media);
    }
}