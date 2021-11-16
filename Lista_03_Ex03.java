import java.util.*; 
class Lista_03_Ex03
{
   public static void main (String[]args)
   {
      Scanner leia = new Scanner(System.in);
      int a, fat;
      System.out.println("Digite um numero para ver o fatorial do mesmo:");
      a=leia.nextInt();
      fat = a;
      while(a>1){
         fat= fat* (a-1);
         System.out.println(a);
         a--;
      }
      System.out.println("O fatorial do "+fat+"");
   }
}