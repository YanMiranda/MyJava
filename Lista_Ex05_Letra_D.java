import java.util.*;
 class Lista_Ex05_Letra_04
 {
  public static void main (String []args)
  {
   Scanner leia = new Scanner (System.in);
    int a;
    boolean b, c;
     System.out.println("digite um valor a baixo e o programa dir� se � par e menor que 100, ou �mpar e maior que 100.");
      a = leia.nextInt();
      b = (a %2 !=0 && a>100 ); 
      c = (a % 2 == 0 && a<100);
     System.out.println("A resposta respctivamente ser�: "+b+", "+c+".");
  }
 }