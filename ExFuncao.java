import java.util.*;
class ExFuncao
{
   public static void main (String[]args)
   {
      Scanner leia = new Scanner(System.in);
      int a, fat;
      System.out.println("Digite um numero para ver o fatorial do mesmo:");
      a=leia.nextInt();
      fat = fatorial(a);
      System.out.println("O fatorial de "+a+" é igual "+fat);
   }
   public static int fatorial(int x)
   {
      int fat = 1;
      while(x>=1){
         fat= fat* x;
         x--;
      }
      return fat;
   }
}