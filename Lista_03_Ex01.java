import java.util.*;
class Lista_03_Ex01
{
   public static void main(String[]args)
   {
      Scanner sc = new Scanner(System.in);
      int x = 0, par=0, impar=0;
      
      while(x!=9999){
         System.out.print("Digite um valor: ");
         x = sc.nextInt();
         par = 0;
         impar = 0;
         for(int i = 1; i<=x; i++){
            System.out.println(i);
            if(i%2==0){
               par = par+ 1;
            }
            if(i%2!=0){
               impar = impar + 1;
            }
         
         }
         System.out.println(par+"= Numeros pares.");
         System.out.println(impar+"= Numeros impares.");
      
      }
   
   }
}
