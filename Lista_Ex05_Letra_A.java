import java.util.*;
 class Lista_Ex05_Letra_01
 {
  public static void main (String[] args)
  {
   Scanner leia = new Scanner(System.in);
    int a;
    boolean b;
     System.out.println("Digite um valor inteiro e o programa dirá se é par");
     a = leia.nextInt();
     b = (a %2 == 0);
     System.out.println("O valor digitado é: "+b+"."); 
  }
 }