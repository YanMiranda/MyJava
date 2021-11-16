import java.util.Scanner;
class Ex_05_Vetor
{
   static Scanner leia = new Scanner(System.in);
   public static void main(String[] args)
   {
      int tamvet = 10;
      int[] vet1 = new int[tamvet]; 
      System.out.println("\nLeitura do vetor\n");
      for (int i = 0; i < tamvet; i++)
      {
         System.out.print("vetorA[" + i + "]= ");
         vet1[i] = leia.nextInt();
      }
     
      System.out.println("\n\nvetor Ordenado\n\n");
      for(int i = 0; i < vet1.length; i++)
      {
         System.out.print(vet1[i] + "\t");
      }
      System.out.println();
   }
}