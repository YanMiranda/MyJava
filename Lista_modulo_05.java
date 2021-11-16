//5 – utilizando função passando N como parâmetro e retornando o valor

import java.util.*;
class Lista_modulo_05
{  
   static int n;
   static double soma=0;
   public static void main (String[]args)
   {
      Scanner sc = new Scanner (System.in);
      System.out.println("Escolha um numero maior do que 2 para o Fibonacci:");
      n = sc.nextInt();
      System.out.println("O resultado é:"+soma(soma)+".");
   }
   public static double soma (double x)
   {
      int a=1, b=1, c, sinal=1, den=2;
      double fra;
      fra = sinal*(double) a/den;
      x = x + fra;
      System.out.println(a+"/"+den);
      den = den + 2;
      sinal = 1;
      fra = sinal*(double) b/den;
      x = x + fra;
      System.out.println(b+"/"+den);
      for(int i=2;i<n;i++)
      {
         c=a+b;
         den = den+2;
         sinal = sinal*(-1);
         fra = sinal*(double) c/den;
         x = x + fra;
         System.out.println(c+"/"+den);
         a=b;
         b=c;
      }
      return x;
   }
}