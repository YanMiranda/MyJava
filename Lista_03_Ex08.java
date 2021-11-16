/*  O numero 3025 possui a seguinte característica:
30 + 25 = 55
55^2 = 3025
Quantos e quais são os números de 4 dígitos possuem essa característica? Qual a média dos números encontrados?
*/
import java.util.Scanner;
public class Lista_03_Ex08
{
   public static void main (String[] args)
   {
      Scanner leia = new Scanner (System.in);
   
      int x=1000, soma, aux, qtde=0;
      while(x <= 9999)
      {  
         soma=(x/100) + (x%100);
         aux = (int)Math.pow(soma,2);
         if(aux==x)
         {
            System.out.println(x);
            qtde++;
         }
         x++;
      }
      System.out.println(qtde+" números possuem essa caracteristica");
   }
}