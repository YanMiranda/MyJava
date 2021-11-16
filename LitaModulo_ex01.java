import java.util.*;
class LitaModulo_ex01
{
   public static void main (String[]args)
   {
   calculaIdade();
   
   }
   public static void calculaIdade()
   {
      Scanner sc = new Scanner (System.in);
      int anos, mes, dias, soma;
      System.out.println("Você tem quantos anos de idade?");
      anos = sc.nextInt();
      System.out.println("E quantos meses?");
      mes = sc.nextInt();
      System.out.println("E dias?");
      dias = sc.nextInt();
      soma = (dias+(anos*365)+(mes*30));
      System.out.println("Você tem "+soma+" dias de vida");
   }
}