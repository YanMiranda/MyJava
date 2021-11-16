import java.util.*;
class ExParametro
{
   static int fat = 1;
   public static void main (String[]args)
   {
      Scanner leia = new Scanner(System.in);
      int a;
      System.out.println("Digite um numero para ver o fatorial do mesmo:");
      a=leia.nextInt();
      fatorial(a);
   }
   public static void fatorial(int x)
   {
      while(x>=1){
         fat= fat* x;
         x--;
      }
      System.out.println("O fatorial é igual a "+fat+".");
   }
}