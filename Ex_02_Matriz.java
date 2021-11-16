/*2 ) Faça um procedimento que receba uma matriz passada por parâmetro e  imprima essa matriz. */
import java.util.*;
import java.util.Scanner;
public class Ex_02_Matriz
{
   public static void main(String[] args){
      Scanner leia = new Scanner(System.in);
      int linha,coluna;
      System.out.print("digite o numero de linhas: ");
      linha=leia.nextInt();
      System.out.print("digite o numero de Colunas: ");
      coluna=leia.nextInt();
      
      int[][] matriz=new int[linha][coluna];
      preencherMatriz(matriz);
      imprimeMatriz(matriz);
   }
   public static void imprimeMatriz(int [][] matriz) {
      System.out.println();
      for(int i=0; i<matriz.length; i++)
      {
         for(int j =0; j< matriz[0].length;j++)
         {
            System.out.printf("  %2d ",i,j,matriz[i][j]);
         }
         System.out.println();
      }
   }
   public static void preencherMatriz(int [][]matriz)
   {
      int num =0;
      for(int i=0; i<matriz.length; i++)
      {
         for(int j =0; j<matriz.length; j++)
         {
            matriz[i][j]=num++;
         }
         System.out.println();
      }
   }
}