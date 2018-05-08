import java.util.Scanner;

public class ExercicioVetor6{
    public static void main(String[] args){
        int[] idades = new int[9];
        String[] nomes = new String[9];
        Scanner keyboard = new Scanner (System.in);
        String nomeMaior = "";
        int idadeMaior =0;

        System.out.println("Informe seu Nome");
        nomes[0] =keyboard.nextLine();

        System.out.println("Informe sua idade");
        idades[0] = Integer.parseInt(keyboard.nextLine());
        if(idadeMaior<idades[0]){
            idadeMaior = idades[0];
            nomeMaior = nomes[0];
        }
        System.out.println("Informe seu Nome");
        nomes[1] =keyboard.nextLine();

        System.out.println("Informe sua idade");
        idades[1] = Integer.parseInt(keyboard.nextLine());
        if(idadeMaior<idades[1]){
            idadeMaior = idades[1];
            nomeMaior = nomes[1];
        }
        System.out.println("Informe seu Nome");
        nomes[2] =keyboard.nextLine();

        System.out.println("Informe sua idade");
        idades[2] = Integer.parseInt(keyboard.nextLine());
        if(idadeMaior<idades[2]){
            idadeMaior = idades[2];
            nomeMaior = nomes[2];
        }
        System.out.println("Informe seu Nome");
        nomes[3] =keyboard.nextLine();

        System.out.println("Informe sua idade");
        idades[3] = Integer.parseInt(keyboard.nextLine());
        if(idadeMaior<idades[3]){
            idadeMaior = idades[3];
            nomeMaior = nomes[3];
        }
        System.out.println("Informe seu Nome");
        nomes[4] =keyboard.nextLine();

        System.out.println("Informe sua idade");
        idades[4] = Integer.parseInt(keyboard.nextLine());
        if(idadeMaior<idades[4]){
            idadeMaior = idades[4];
            nomeMaior = nomes[4];
        }

        System.out.println("Informe seu Nome");
        nomes[5] =keyboard.nextLine();

        System.out.println("Informe sua idade");
        idades[5] = Integer.parseInt(keyboard.nextLine());
        if(idadeMaior<idades[5]){
            idadeMaior = idades[5];
            nomeMaior = nomes[5];
        }

        System.out.println("Informe seu Nome");
        nomes[6] =keyboard.nextLine();

        System.out.println("Informe sua idade");
        idades[6] = Integer.parseInt(keyboard.nextLine());
        if(idadeMaior<idades[6]){
            idadeMaior = idades[6];
            nomeMaior = nomes[6];
        }

        System.out.println("Informe seu Nome");
        nomes[7] =keyboard.nextLine();

        System.out.println("Informe sua idade");
        idades[7] = Integer.parseInt(keyboard.nextLine());
        if(idadeMaior<idades[7]){
            idadeMaior = idades[7];
            nomeMaior = nomes[7];
        }

        System.out.println("Informe seu Nome");
        nomes[8] =keyboard.nextLine();

        System.out.println("Informe sua idade");
        idades[08 = Integer.parseInt(keyboard.nextLine());
        if(idadeMaior<idades[8]){
            idadeMaior = idades[8];
            nomeMaior = nomes[8];
        }

        System.out.println(idadeMaior + "\n"+ nomeMaior);
    }
}