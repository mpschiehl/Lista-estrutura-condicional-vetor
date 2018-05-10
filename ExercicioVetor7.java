import java.util.Scanner;

public class ExercicioVetor7{
    public static void main(String[] args){
        double [] alturas = new double [4];
        Scanner keyboard = new Scanner (System.in);
        double altura = Double.MAX_VALUE;

        System.out.println("Informe a altura do animal");
        alturas[0] = Double.parseDouble(keyboard.nextLine());
        if(alturas[0]<altura){
            altura = alturas[0];
        }
        System.out.println("Informe a altura do animal");
        alturas[1] = Double.parseDouble(keyboard.nextLine());
        if(alturas[1]<altura){
            altura = alturas[1];
        }
        System.out.println("Informe a altura do animal");
        alturas[2] = Double.parseDouble(keyboard.nextLine());
        if(alturas[2]<altura){
            altura = alturas[2];
        }
        System.out.println("Informe a altura do animal");
        alturas[3] = Double.parseDouble(keyboard.nextLine());
        if(alturas[3]<altura){
            altura = alturas[3];
        }    
        
        
        System.out.print(altura);
    }
}