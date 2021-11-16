//3 – utilizando variáveis globais

import java.util.*;
class Lista_modulo_03
{
   static int a=1, b=1, c, n, sinal=1, den=2;
   static double fra, soma=0;
   public static void main (String[]args)
   {
      Scanner sc = new Scanner (System.in);
      System.out.println("Escolha um numero maior do que 2 para o Fibonacci:");
      n = sc.nextInt();
      fra = sinal*(double) a/den;
      soma = soma + fra;
      System.out.println(a+"/"+den);
      den = den + 2;
      sinal = 1;
      fra = sinal*(double) b/den;
      soma = soma + fra;
      System.out.println(b+"/"+den);
      for(int i=2;i<n;i++)
      {
         c=a+b;
         den = den+2;
         sinal = sinal*(-1);
         fra = sinal*(double) c/den;
         soma = soma + fra;
         System.out.println(c+"/"+den);
         a=b;
         b=c;
      }
      System.out.println("O resultado é:"+soma+".");
   }
}