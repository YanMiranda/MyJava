import java.util.*;
 class Lista_Ex04_Letra_H
 {
  public static void main(String[] args)
  {
   Scanner leia = new Scanner (System.in);
    int a, b, c;
     System.out.println("Dê o primeiro valor:");
      c = leia.nextInt();
     System.out.println("Dê o segundo valor:");
      b = leia.nextInt();
      a = b;
      b = c;     
     System.out.println("Invertendo os valores de a e b, ficam respectivamente: "+a+" e "+b+".");
  }
 }