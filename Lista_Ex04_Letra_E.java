import java.util.*;
 public class Lista_Ex04_Letra_E
 {
  public static void main (String[] args)
  {
   Scanner leia = new Scanner(System.in);
    double s, a, p;
     System.out.println("Digite a baixo o seu sal�rio:");
      s = leia.nextDouble();
     System.out.println("Qual � a porcentagem do seu aumento?");
      a = leia.nextDouble();
      p = (s*a/100)+s;
     System.out.println("O seu novo sal�rio ser�: "+p+".");
  }
 }