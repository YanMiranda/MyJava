import java.util.*;
 class Lista_Ex05_Letra_05
 {
  public static void main (String []args)
  {
   Scanner leia = new Scanner (System.in);
    int a;
    boolean b;
     System.out.println("Digite um valor e o programa dirá se está entre 25 e 75.");
      a = leia.nextInt();
      b = (a>25 && a<75);
      System.out.println("A resposta correta é: "+b+".");
  }
 }
     