import java.util.*;
 class Lista_Ex04_Letra_D
 {
  public static void main (String[] args)
  {
   Scanner leia = new Scanner(System.in);
    double c ,res;
     System.out.println("Qual a temperatura em celsius?");
      c = leia.nextDouble();
      res = c*9/5+32;
     System.out.println("O valor da converção para fahrenheit é: "+res+".");      
  }
 }