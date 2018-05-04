public class ExercicioVetor3{
   public static void main(String[] args){
       //declarando  os vetores
       String [] nomes = new String[7];
       double [] precos = new double [7];
        //atribuindo valores aos vetores.
        nomes[0] = "Lapis";
        precos[0]= 0.79;
        nomes[1] = "Teclado";
        precos[1] = 51;
        nomes[2] = "mouse";
        precos[2]= 38.76;
        nomes[3]= "monitor 15' CRT";
        precos[3]= 0;
        nomes[4]= "TV 23'";
        precos[4] = 2983;
        nomes[5]= "caderno";
        precos[5] = 23.48;
        nomes[6] = "caneta";
        precos[6] = 1.5;
        //Apresentando os valores ao usuario.
        System.out.println(nomes[0]+ "\nR$ "+precos[0]+"\n==============\n"+nomes[1]+ "\nR$ "+precos[1]+"\n==============\n"+nomes[2]+ "\nR$ "+precos[2]+"\n==============\n"+nomes[3]+ "\nR$ "+precos[3]+"\n==============\n"+nomes[4]+ "\nR$ "+precos[4]+"\n==============\n"+nomes[5]+ "\nR$ "+precos[5]+"\n==============\n"+nomes[6]+ "\nR$ "+precos[6]);
   } 
}