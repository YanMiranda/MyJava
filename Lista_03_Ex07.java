import java.util.*;
 class Lista_03_Ex07
{
   public static void main (String[] args)
   {   
      int quociente, unidade, dezena, centena, milhar, invertido, qtde=0;
      
      System.out.println("Todos os números palíndromos de 10000 a 99999:");
      
      for(int x=10000; x<=99999; x++)
      {
         quociente=x;
         milhar=quociente/1000;
         centena=quociente%100;
         dezena=centena/10;
         unidade=centena%10;   
         invertido=unidade*10+dezena;
         
         if (milhar == invertido)
         {
            System.out.println("- "+x);
            qtde++;
         }
      }
      System.out.println("\n"+qtde+" números são palíndromos nesse intervalo.");
   }
}