import java.util.*;
 class Lista_Ex05_Letra_02
 {
  public static void main(String[] agrs)
   {
    Scanner leia = new Scanner(System.in);
     int a;
     boolean b;
      System.out.println("Digite um valor a abaixo e o programa dirá se é impar.");
       a = leia.nextInt();
       b = (a %2 != 0);
      System.out.println("O valor dado é impar?"+b+".");
   }
 }