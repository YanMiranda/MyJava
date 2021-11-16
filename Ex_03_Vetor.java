/*3 - Elaborar um programa que leia 20 elementos do tipo real em um vetor A, em seguida crie um procedimento que 
inverta os elementos armazenados. Ou seja, o primeiro elemento de A passará a ser o ultimo, o segundo elemento 
passará a ser o penúltimo e assim por diante. Apresentar A.*/
import java.util.Scanner;
class Ex_03_Vetor
{
   public static void main(String[] args)
   {
   
      Scanner ent = new Scanner(System.in);
      
      
      int[] vet = new int[20];
      
      
      for(int i = 0; i < vet.length; i++){
         System.out.println("Digite um número");
         vet[i] = ent.nextInt();
      }
      
      
      for(int i = vet.length-1; i >= 0; i--){
         System.out.println(vet[i]);
      }
      
   }

}