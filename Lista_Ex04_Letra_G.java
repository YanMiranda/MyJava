import java.util.*;
 class Lista_Ex04_Letra_G
 {
  public static void main(String[] args)
  {
   Scanner leia = new Scanner (System.in);
    int k, cat1, cat2, r, total;
     System.out.println("Qual o peso em Kg do saco de ra��o?");
      k = leia.nextInt();
      k = k*1000;
     System.out.println("Qual a quantidade em gramas qua o priemiro gato ir� comer?");
      cat1 = leia.nextInt();
     System.out.println("Qual a quantidade em gramas qua o segundo gato ir� comer?");
      cat2 = leia.nextInt();
      r = cat1 + cat2;
      total = k - r*5 ;
     System.out.println("Ap�s 5 dias restar� "+total+" g de ra��o.");
      
      
  }
 }