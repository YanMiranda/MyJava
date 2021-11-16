import java.io.IOException;
import java.util.*;
 public class Lista_Ex05_Letra_14
 {
  public static void main (String[] args) throws IOException
  {
   Scanner leia = new Scanner (System.in);
    char x, y, z;
    boolean a;
     System.out.println("Digite a baixo o primeiro caracter"); 
      x = (char)System.in.read();
      leia.nextLine();
     System.out.println("Digite a baixo o segundo caracter");  
      y = (char)System.in.read();
      leia.nextLine();
     System.out.println("Digite a baixo o terceiro caracter");
      z = (char)System.in.read();
      leia.nextLine();
      a = (x < y && y < z);
     System.out.println("A ordem está: "+a+".");
  }   
}
