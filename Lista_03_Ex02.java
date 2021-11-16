import java.util.*;
class Lista_03_Ex02
{
   public static void main (String[]args)
   {
      Scanner sc = new Scanner(System.in);
      int x = 0, soma = 0, big = 0, small = 9999, aux = 0, media = 0;
      while(x!= -1){
         System.out.print("Digite um conjunto de numeros: ");
         x = sc.nextInt();
         if(x != -1){
            soma += x; 
            aux++;
            if(x>big){
               big = x;
            }
            if(x<small){
               small = x;
            }
         }
         
      }
      media = soma/aux;
      System.out.println(small+" É o menor valor.");
      System.out.println(big+" É o maior valor.");
      System.out.println(media+" É a média do valor.");
   }
}
