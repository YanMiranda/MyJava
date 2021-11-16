/*1 - Elaborar um programa que leia um vetor A com 15 elementos inteiros. Construir um vetor B do mesmo tipo, em
que cada elemento de B deva ser o resultado do fatorial correspondente de cada elemento do vetor A. Apresentar A e
B.*/
import java.util.*;
class Ex_01_Vetor
{
   public static void main(String[] args)
   {
      Scanner teclado = new Scanner(System.in);
      int tamvet = 15;
      int fat;
      int[] vet = new int[tamvet]; 
      int[] vetfat = new int[tamvet]; 
      System.out.println("\nLeitura do primeiro vetor\n");
      for (int i = 0; i < tamvet; i++)
      {
         System.out.print("vet1[" + i + "]= ");
         vet[i] = teclado.nextInt();
      }
      for ( int a = 0; a < tamvet; a++ )
      {
         fat = 1;
         for (int i = 1; i <= vet[a]; i++)
            fat = fat * i;
         vetfat[a] = fat;
      }
      System.out.println("\n\nConteúdo do vetor 1\n\n");
      for (int i = 0; i < tamvet; i++)
         System.out.print(vet[i] + "\t");
      System.out.println("\n\nFatorial de cada elemento do vetor 1\n\n");
      for (int i = 0; i < tamvet; i++)
         System.out.print(vetfat[i] + "\t");
      System.out.println();
   }
}