import java.util.*;
 class Lista_Ex05_Letra_09
 {
  public static void main (String[] args)
  {
   Scanner leia = new Scanner(System.in);
    int a, b;
    boolean c, d;
     System.out.println("Digite um valor inteiro e o programa dir� se � par");
      a = leia.nextInt();
     System.out.println("Digite um valor inteiro e o programa dir� se � impar");
      b = leia.nextInt();
      c = (a %2 == 0 && a>0);
      d = (b %2 !=0 && b<0);
     System.out.println("Os valores digitados s�o respectivamente: "+c+","+d+"."); 
  }
 }