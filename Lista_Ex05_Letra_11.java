import java.util.*;
 class Lista_Ex05_Letra_11
 {
  public static void main (String[] args)
  {
   Scanner leia = new Scanner(System.in);
    double a, b,c;
    boolean d;
     System.out.println("Digite um valor.");
      a = leia.nextDouble();
     System.out.println("Digite um segundo valor.");
      b = leia.nextDouble();
     System.out.println("Digite um terceiro valor.");
      c = leia.nextDouble();
      d = (a<b && b> c);
     System.out.println("O segundo valor está entre os outros dois?  "+d+"."); 
  }
 }