import java.util.Scanner;
class Lista_03_Ex06
{
   public static void main(String [] args)
   {
      int n,contador,exp,sinal,x,den,a;
      double s,fat;
      Scanner teclado = new Scanner(System.in);
      System.out.print("Digite a quantidade de termos da serie : ");
      n = teclado.nextInt();
      System.out.print("Digite o valor de x : ");
      x = teclado.nextInt();
      s = 0;
      sinal = -1;
      exp = 2;
      den = 1;
      for ( contador = 1; contador <= n; contador = contador + 1 )
      {
         fat = 1;
         for ( a = 1; a <= den; a = a + 1 )
            fat = fat * a;
         s = s + sinal*Math.pow(x,exp) / fat;
         sinal = -sinal;
         exp = exp + 1;
         den = den + 1;
      }
      System.out.println("Soma dos termos da série : " + s);
   }
}