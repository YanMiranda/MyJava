import java.util.*;
class Lista_03_Ex04
{
   public static void main (String [] args)
    {
      Scanner ler = new Scanner (System.in);
      int i, num, numerador, denominador, sinal;
      double s, fracao;
      System.out.println("Digite a quantidade de termos: ");
      num=ler.nextInt();
      numerador=1;
      denominador=1;
      sinal=+1;
      s=0;
      for (i=1; i<=num; i++)
      {
         fracao=sinal*numerador/(Math.pow(denominador,3));
         System.out.println(i+ ": " +sinal+" "+numerador+" "+denominador);
         s=s+fracao;
         numerador=1;
         denominador=denominador+2;
         sinal=sinal*(-1);
      }
      System.out.println("S="+s);
   }
}
