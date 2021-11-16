import java.util.*;
 class Lista_Ex04_Letra_C
 {
  public static void main (String[] args)
  {
   Scanner leia = new Scanner(System.in);
    double n1, n2, n3, p1, p2, p3, media, sp;
    System.out.println("Qual o valor da primeira nota?");
     n1 = leia.nextDouble();
     System.out.println("Qual o valor do primeiro peso?");
     p1 = leia.nextDouble();
     System.out.println("Qual o valor da segunda nota?");
     n2 = leia.nextDouble();
     System.out.println("Qual o valor do segundo peso?");
     p2 = leia.nextDouble();
     System.out.println("Qual o valor da terceira nota?");
     n3 = leia.nextDouble();
     System.out.println("Qual o valor do terceiro peso?");
     p3 = leia.nextDouble();
     sp = p1+p2+p3;
     media = (n1*p1+n2*p2+n3*p3) /sp;
     System.out.println("A média ponderada será: "+media+".");
   }
 }
