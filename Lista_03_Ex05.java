import java.util.*;  
class Lista_03_Ex05
{
   public static void main (String[]args)
   {
      Scanner leia = new Scanner(System.in);
      int n1, n2, n3, x, cont;
      n1 = 1;
      n2 = 1;
      n3 = 1;
      System.out.println("Digite o enesimo numero maior que 2");
      x = leia.nextInt();
      if(x>2){
         System.out.println(n1);
         System.out.println(n2);
         cont = 2;
         while(cont<x){
            n3=n1+n3;
            System.out.println(n3);
            cont++;//cont = cont+1; cont+=1;
            n1=n2;
            n2=n3;
         }
      }
      else{
         System.out.println("Insira um numero maior do que 2.");
      }
   }
}