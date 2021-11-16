/*04-Elaborar um programa que leia 10 elementos do tipo inteiro em um vetor A. Crie um vetor ParImpar de 2 posições
e armazene no índice 0 quantos elementos de A são par e no índice 1 quantos elementos de A são ímpar. Apresentar
vetor ParImpar. Obs.: não utilize o comando condicional se.
*/
import java.util.Scanner;
class Ex_04_Vetor
{
   public static void main(String[] args)
   {
      Scanner leia = new Scanner(System.in);
      
      int tamvet = 10, aux = 0;
      int[] vet1 = new int[tamvet];  
      int[] ParImpar = new int[]{0,0};       
      System.out.println("\nLeitura do vetor A:\n");
      
      for (int i = 0; i < tamvet; i++)
      {
         System.out.print("vet1[" + i + "]= ");
         vet1[i] = leia.nextInt();
      }
      
      for(int a = 0; a < tamvet; a++)
      {
         aux = vet1[a]%2;
         ParImpar[aux] += 1; 
         aux = 0;
      }
         
      System.out.print("\nConteúdo do vetor ParImpar: ");
      
      for (int i = 0; i < 2; i++)
         System.out.print(ParImpar[i] + "\t");
      System.out.println();
   }
}