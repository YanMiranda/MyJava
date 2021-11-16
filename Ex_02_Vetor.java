/*02-Construir um programa que leia dois vetores A e B com 10 elementos quaisquer inteiros. Construir um vetor C, 
sendo este o resultado da união dos elementos de A e B sem repetição. Apresentar C.
*/

import java.util.Scanner;
class Ex_02_Vetor
{
   public static void main(String[] args)
   {
      Scanner leia = new Scanner(System.in);
      
      int tamvet = 10;
      int[] vet1 = new int[tamvet]; 
      int[] vet2 = new int[tamvet];     
      int[] soma = new int[tamvet]; 
      
      System.out.println("\nLeitura do primeiro vetor\n");
      for (int i = 0; i < tamvet; i++)
      {
         System.out.print("vet1[" + i + "]= ");
         vet1[i] = leia.nextInt();
      }
      System.out.println("\nLeitura do segundo vetor\n");
      for (int i = 0; i < tamvet; i++)
      {
         System.out.print("vet2[" + i + "]= ");
         vet2[i] = leia.nextInt();
      }
      
      for (int i = 0; i < tamvet; i++)
         soma[i] = vet1[i] + vet2[i];
      System.out.println("\nConteúdo do vetor A:\n");
      for (int i = 0; i < tamvet; i++)
         System.out.print(vet1[i] + "\t");
      System.out.println("\nConteúdo do vetor B:\n");
      for (int i = 0; i < tamvet; i++)
         System.out.print(vet2[i] + "\t");
      System.out.println("\nConteúdo do vetor soma:\n");
      for (int i = 0; i < tamvet; i++)
         System.out.print(soma[i] + "\t");
   }
}