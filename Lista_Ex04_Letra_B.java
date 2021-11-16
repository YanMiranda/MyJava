import java.util.*;
 class Lista_Ex04_Letra_B
 {
  public static void main (String[] args)
  {
   Scanner leia = new Scanner(System.in);
    int m1, m2 ,m3, m4, media; 
   System.out.println("Dê o primeiro valor");
    m1 = leia.nextInt(); 
   System.out.println("Dê o segundo valor");
    m2 = leia.nextInt(); 
   System.out.println("Dê o terceiro valor");
    m3 = leia.nextInt(); 
   System.out.println("Dê o quarto valor");
    m4 = leia.nextInt();
    media = (m1+m2+m3+m4) /4;
   System.out.println("A média aritinética é "+media+".");
    
  }
 }