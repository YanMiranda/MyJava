import java.util.Scanner;
 class Lista_Ex04_Letra_F
 {
  public static void main(String[] args)
  {
   Scanner teclado = new Scanner(System.in);
    float base, altura, area;
   System.out.println("Digite um valor para a base do tri�ngulo: ");
    base = teclado.nextFloat();
   System.out.println("Digite um valor para a altura do tri�ngulo: ");
    altura = teclado.nextFloat();
    area = base * altura / 2;
   System.out.println("A area do tri�ngulo �: "+area+".");
    
  }
 }