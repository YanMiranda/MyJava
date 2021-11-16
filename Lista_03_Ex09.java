import java.util.*;
class Lista_03_Ex09
{
   public static void main(String[] args)
   {
      Random gerador = new Random ();
      Scanner entrada = new Scanner(System.in);
        
      int cara, coroa;
      for (int i =0; i<10; i++)
      {
         System.out.print("Digite um numero entre 0 e 1: ");
         cara = entrada.nextInt();
         coroa = gerador.nextInt(2);
        
         if (cara == coroa)
         {
            System.out.println("Cara ");
            System.out.println("Cara: " + cara);
         }
         else {
            System.out.println("Coroa ");
            System.out.println("Coroa: " + coroa);
         }
      }
   }
}