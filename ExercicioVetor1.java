
public class ExercicioVetor1 {
    public static void main(String[] args){
        int [] numeros = new int[16];
        numeros[0] = 99;
        numeros[1] = 63;
        numeros[2] = 95;
        numeros[3] = 77;
        numeros[4]=  2;
        numeros[5] = 69;
        numeros[6] = 33;
        numeros[7] = 41;
        numeros[8] = 12;
        numeros[9]= 65;
        numeros[10] = 74;
        numeros[11]=96;
        numeros[12]=36;
        numeros[13] = 98;
        numeros[14] = 52;
        numeros[15] = 11;
        int soma = numeros[0]+numeros[1]+numeros[2]+numeros[3]+numeros[4]+numeros[5]+numeros[6]+numeros[7]+numeros[8]+numeros[9]+numeros[10]+numeros[11]+numeros[12]+numeros[13]+numeros[14]+numeros[15];
        System.out.println("Soma de todos os valores do vetor " +soma);
    }
    
}