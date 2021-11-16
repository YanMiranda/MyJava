import java.util.*;
import java.util.Scanner;
public class Ex_04_Matriz
{
   public static void main(String[] args){
   //leiturando usando a classe Scanner
      Scanner leia = new Scanner(System.in);
   //declaração de variaveis
      int i,j,imatriz,jmatriz,flag;
      int linha,coluna;
   //declaração da matriz
      System.out.print("Informe o número de linhas: ");
      linha=leia.nextInt();
   
      System.out.print("Informe o número de colunas: ");
      coluna= leia.nextInt();
      int[][] matriz= new int[linha][coluna];
   
      System.out.println();
   
   //imprimindomatriz
      for (i=0;i<matriz.length;i++)
      {
         for(j=0;j<matriz[0].length; j++)
         {
            System.out.printf("matriz[%d][%d] - %2d ",i,j,matriz[i][j]);
            {
               System.out.println();
            }
            System.out.println();
            do
            {
               System.out.print("Informa a posição da linha[i]: ");
               imatriz=leia.nextInt();
               System.out.print("Informa a posição da linha[j]: ");
               jmatriz=leia.nextInt();
               for(i=0;i<matriz.length;i++)
               {
                  for(j=0;j<matriz[0].length;j++)
                  {
                     if(i==imatriz)
                     {
                        if(j==jmatriz)
                           System.out.println("O valor que está na maatriz nesta posição["+i+"]["+j+"] é:"+matriz[i]+matriz[j]);
                     }
                  }
               }
               System.out.println();
            //flag de saida
               System.out.println("Deseja interromper a repetição(FLAG-1): ");
               flag=leia.nextInt();
               System.out.println();
            
            }
            while(flag!=1);
         }
      }
   }
}