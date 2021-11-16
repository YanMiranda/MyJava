import java.util.*;
 class Lista_Ex04_Letra_J
 {
  public static void main (String[] args)
  {
   Scanner leia = new Scanner(System.in);
    double a1, a2, n, r, an, sn;
     System.out.println("Qual o valor do primeiro termo?");
      a1 = leia.nextDouble();
     System.out.println("Qual o valor do segundo termo?");
      a2 = leia.nextDouble();
     System.out.println("Qual a quantidade de termos?");
      n = leia.nextDouble();
      r = a2-a1;
      an = a1 + (n-1)*r;
      sn = n*(a1+an)/2;
     System.out.println("A soma dos termos é: "+sn+".");
  }
 }