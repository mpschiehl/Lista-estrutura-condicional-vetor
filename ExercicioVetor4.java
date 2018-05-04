import java.util.Scanner;
public class ExercicioVetor4{
    public static void main(String[] args){
        
        double  [] notas = new double[4];
        Scanner teclado = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        // solicita os dados do Usuario.
        String nome = teclado.nextLine();
        System.out.println("Informe a Disciplina");
        String diciplina = teclado.nextLine();
        
        System.out.println("Informe a primeira nota:");
        notas[0] = Double.parseDouble(teclado.nextLine());
        
        System.out.println("Informe a segunda nota:");
        notas[1] = Double.parseDouble(teclado.nextLine());
        
        System.out.println("Informe a teceira nota:");
        notas[2] = Double.parseDouble(teclado.nextLine());
        
        System.out.println("Informe a quarta nota:");
        notas[3] = Double.parseDouble(teclado.nextLine());
        //calculos
        double media= (notas[0]+notas[1]+notas[2]+notas[3])/notas.length;
        //apresentacao do resultado ao usuario.
        System.out.println("Media da notas "+media);

    }
}