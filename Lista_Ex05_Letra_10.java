import java.util.*;
 class Lista_Ex05_Letra_10
 {
  public static void main (String[] args)
  {
   Scanner leia = new Scanner(System.in);
    double a, b;
    boolean c, d, e;
     System.out.println("Digite um valor.");
      a = leia.nextDouble();
     System.out.println("Digite um segundo valor.");
      b = leia.nextDouble();
      c = (a>b);
      d = (a<b);
      e = (a==b);
     System.out.println("O primeiro valor é, maior, menor ou igual: "+c+","+d+","+e+"."); 
  }
 }