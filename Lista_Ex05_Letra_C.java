import java.util.*;
 class Lista_Ex05_Letra_03
 {
  public static void main(String[]args)
  {
   Scanner leia = new Scanner(System.in);
    int a;
    boolean b, c;
     System.out.println("digite um valor a baixo e o programa dir� se � impar e maior que 100.");
      a = leia.nextInt();
      b = (a %2 !=0); 
      c = (a>100);
     System.out.println("O valor � impar? "+b+".");
     System.out.println("O valor � maior do que 100? "+c+".");
  }
 }