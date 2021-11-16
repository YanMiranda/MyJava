import java.util.*;
 class Lista_Ex05_Letra_03
 {
  public static void main(String[]args)
  {
   Scanner leia = new Scanner(System.in);
    int a;
    boolean b, c;
     System.out.println("digite um valor a baixo e o programa dirá se é impar e maior que 100.");
      a = leia.nextInt();
      b = (a %2 !=0); 
      c = (a>100);
     System.out.println("O valor é impar? "+b+".");
     System.out.println("O valor é maior do que 100? "+c+".");
  }
 }