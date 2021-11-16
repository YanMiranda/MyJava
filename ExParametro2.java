import java.util.*;
class ExParametro2
{
   static int fib;
   public static void main(String[]args)
   {
   fibinacci
   }
   public static void fibonacci (String[]args)
   {
      Scanner leia = new Scanner(System.in);
      int n1, n2, n3, x;
      n1 = 1;
      n2 = 1;
      n3 = 1;
      System.out.println("Digite o enesimo numero maior que 2");
      x = leia.nextInt();
      if(x>2){
         fib = 2;
         while(fib<x){
            n3=n1+n3;
            fib++;//cont = cont+1; cont+=1;
            n1=n2;
            n2=n3;
         }
      }
      else{
         System.out.println("Insira um numero maior do que 2.");
      }
      System.out.println(n3);
   }
}