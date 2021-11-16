import java.util.*;
import java.io.IOException;
class Lista_De_Exercicios_02
{
//comando para limpar a tela ap�s a escolha do exerc�cio
   static void limpaTela() {
      for(int i=0; i < 1000; i++)     {
         System.out.println(); 
      }
   }
   public static void main(String[]args)throws IOException
   {
      Scanner leia = new Scanner(System.in);
      int a;
      System.out.println("+----------------------------------------------------+");
      System.out.println("|1- Programa que informa se o numero � par ou impar. |");
      System.out.println("|2-                  M�dia do aluno.                 |");
      System.out.println("|3-                  Estado da agua.                 |");
      System.out.println("|4-              Avalia��o do valor de x.            |");
      System.out.println("|5-      impress�o de 3 valores sequencialmente.     |");
      System.out.println("|6-                Teste de divis�es.                |");
      System.out.println("|7-               Verifica um numero.                |");
      System.out.println("|8-  Ler um n�mero e mostrar o nome correspondente.  |");
      System.out.println("|9-            N�meros pal�ndromos ou n�o.           |");
      System.out.println("|10-     Calcula a conta de �gua para a SANEAGO.     |");
      System.out.println("+----------------------------------------------------+");
      System.out.print("      Digite apenas o numero do exerc�cio desejado: ");
      a = leia.nextInt();
      limpaTela();
      switch(a)
      {
         case 1:
            ex01();
            break;     
         case 2:
            ex02();
            break;
         case 3:
            ex03();
            break;
         case 4:
            ex04();
            break;
         case 5:
            ex05();
            break; 
         case 6:
            ex06();
            break; 
         case 7:
            ex07();
            break; 
         case 8:
            ex08();
            break; 
         case 9:
            ex09();
            break;
         case 10:
            ex10();
            break;     
         default:
            System.out.println("Exerc�cio inexistente.");
            break;
      }
   }
   //Fazer um algoritmo que leia um numero inteiro e mostre uma mensagem indicando se este numero e par ou impar.
   public static void ex01()
   {
      Scanner leia = new Scanner(System.in);
      int a;
      System.out.println("+--------------------------------------------------Quest�o 01-----------------------------------------------------+");
      System.out.println("|   Fazer um algoritmo que leia um numero inteiro e mostre uma mensagem indicando se este numero e par ou impar.  |");
      System.out.println("+-----------------------------------------------------------------------------------------------------------------+");
      System.out.println();
      System.out.print("Digite um valor e o programa dir� se � par ou impar: ");  
      a = leia.nextInt();
      if(a %2 ==0){
         System.out.println("O valor informado � par!");
      }
      else{
         System.out.println("O valor informado � impar!");
      }
   }
    /*Fazer um algoritmo pe�a o nome e as 3 notas de um aluno e mostre, al�m do nome e do valor da media do aluno,
    uma mensagem de Aprovado, caso a media seja igual ou superior a 6, ou a mensagem reprovado, casocontrario.*/
   public static void ex02()
   {
      
      Scanner leia = new Scanner(System.in);
      double a, b, c, media;
      String nome;
      System.out.println("+--------------------------------------------------Quest�o 02-----------------------------------------------------+");
      System.out.println("|   Fazer um algoritmo pe�a o nome e as 3 notas de um aluno e mostre, al�m do nome e do valor da media do aluno,  |");
      System.out.println("|   uma mensagem de Aprovado, caso a media seja igual ou superior a 6, ou a mensagem reprovado, caso contrario.   |");
      System.out.println("+-----------------------------------------------------------------------------------------------------------------+");
      System.out.println();
      System.out.print("Insira o seu nome: ");
      nome = leia.next();
      System.out.println("Qual o valor da primeira nota?");
      a = leia.nextDouble();
      System.out.println("Qual o valor da segunda nota?");
      b = leia.nextDouble();
      System.out.println("Qual o valor da terceira nota?");
      c = leia.nextDouble();
      media = (a+b+c)/2;
      System.out.println("A m�dia do aluno "+nome+" � "+media+".");
      if(media >= 6){
         System.out.println("Aprovado");
      }
      else{
         System.out.println("Reprovado");
      }
   
   }
   //Fazer um algoritmo que leia a temperatura da �gua e mostre se est� no estado solido, l�quido ou gasoso.
   public static void ex03()
   {
      Scanner leia = new Scanner(System.in);
      int a;
      System.out.println("+------------------------------------------------Quest�o 03--------------------------------------------------+");
      System.out.println("|   Fazer um algoritmo que leia a temperatura da �gua e mostre se est� no estado solido, l�quido ou gasoso.  |");
      System.out.println("+------------------------------------------------------------------------------------------------------------+");
      System.out.print("Insira a temperatura da �gua em celsius: ");
      System.out.println();
      a= leia.nextInt();
      if(a >= 100){
         System.out.println("A �gua est� em forma gasosa.");
      }
      else{ 
         if(a <= 0){
            System.out.println("A �gua est� em forma s�lida.");
         }
         else{
            System.out.println("A �gua est� em forma l�quida.");
         }
      }
     
   }
   //Leia um valor X e se ele for menor que 0 avalie Y = x2 + 4. Se ele for maior que 0 avalie x3 -3 e se ele for igual a 0 de uma mensagem de erro.
   public static void ex04()
   {
      Scanner leia = new Scanner(System.in);
      int x, y;
      System.out.println("+------------------------------------------Quest�o 04----------------------------------------+");
      System.out.println("|   Se o valor de X for menor que 0 avalie Y = x2 + 4. Se ele for maior que 0 avalie x3 -3   |");
      System.out.println("|                   e se ele for igual a 0 de uma mensagem de erro.                          |");
      System.out.println("+--------------------------------------------------------------------------------------------+");
      System.out.println();
      System.out.print("Digite um valor para 'X': ");
      x = leia.nextInt();
      if(x < 0){
         y = x*2 + 4;
         System.out.println("Como o valor de 'X' � menor do que '0', o resutado ser�: "+y+".");
      }
      else{
         if(x > 0){
            y = x * 3 - 3;
            System.out.println("Como o valor de 'X' � maior do que '0', o resutado ser�: "+y+".");
         }
         else{
            System.out.print("-ERRO!- X n�o pode ser igual a 0.");
         }
      }
   
   }
   /*Construa um algoritmo que receba como entrada tr�s valores (A,B e C). Ap�s o processamento o menor valor
    dever� estar em A e o maior valor em C, e o valor intermedi�rio em B. Imprima A,B e C*/
   public static void ex05()
   {
      Scanner leia = new Scanner(System.in);
      int a, b, c, aux;
      System.out.println("+----------------------------------------Quest�o 05----------------------------------------+");
      System.out.println("|   Um algoritmo que receba como entrada tr�s valores (A,B e C). Ap�s o processamento      |");
      System.out.println("|      o menor valor estar em A e o maior valor em C, e o valor intermedi�rio em B.        |");
      System.out.println("+------------------------------------------------------------------------------------------+");
      System.out.println();
      System.out.println("Digite o primeiro valor:");
      a = leia.nextInt();
      System.out.println("Digite o segundo valor:");
      b = leia.nextInt();
      System.out.println("Digite o terceiro intermedi�rio:");
      c = leia.nextInt();
      if (a>b){
         aux=a;
         a=b;
         b=aux;
      } 
      if(a>c){
         aux=a;
         a=c;
         c=aux;
      }
      if(b>c){
         aux=b;
         b=c;
         c=aux;
      }
      System.out.println("Organizando os valores em ordem fir�: "+a+b+c+".");
      
   }
   //Desenvolver um algoritmo que leia tr�s n�meros inteiros: X, Y, Z e verifique se o n�mero X � divis�vel por Y e por Z.
   public static void ex06()
   {
      Scanner leia = new Scanner(System.in);
      int x, y, z;
      System.out.println("+----------------------------------------Quest�o 06----------------------------------------+");
      System.out.println("|  Ler tr�s n�meros inteiros: X, Y, Z e verifique se o n�mero X � divis�vel por Y e por Z. |");
      System.out.println("|       o n�mero � divis�vel por Y e Z//o n�mero � divis�vel por Y mas n�o por Z           |");
      System.out.println("|   o n�mero � divis�vel por Z mas n�o por Y.//o n�mero n�o � divis�vel nem Y nem por Z    |");
      System.out.println("+------------------------------------------------------------------------------------------+");
      System.out.println();
      System.out.println("Informe um valor para 'X': ");
      x = leia.nextInt();
      System.out.println("Informe um valor para 'Y': ");
      y = leia.nextInt();
      System.out.println("Informe um valor para 'Z': ");
      z = leia.nextInt();
      if(x %y == 0 && x %z == 0){
         System.out.println("O "+x+" � divisivel por "+y+" e por "+z+".");
      }
      else{
         if(x %z==0 && x %y!=0){
            System.out.println("O "+x+" � dividivel apenas pelo "+z+" e n�o pelo "+y+".");
         }
         else{
            if(x %z!=0 && x %y==0){
               System.out.println("O "+x+" � dividivel apenas pelo "+y+"e n�o pelo"+z+".");
            }
            else{
               System.out.println("O "+x+" n�o � divisivel por nenhum dos outros dois valores informados.");
            }
         }
      }
   }
   //Fazer um algoritmo que dado um numero de 4 d�gitos (verifique se o n�mero pertence a faixa) calcule e escreva se ele possui ou n�o esta caracter�stica.
   public static void ex07()
   {
      Scanner leia = new Scanner(System.in);
      int x, soma, aux; 
      System.out.println("+-------------------------------------------Quest�o 07--------------------------------------------+");
      System.out.println("|   Fazer um algoritmo que dado um numero de 4 d�gitos (verifique se o n�mero pertence a faixa)   |");
      System.out.println("|                  calcule e escreva se ele possui ou n�o esta caracter�stica.                    |");
      System.out.println("+-------------------------------------------------------------------------------------------------+");
      System.out.print("Digite um n�mero de 4 d�gitos : ");
      x=leia.nextInt();
      if (x >= 1000 && x <= 9999)
      {
         soma = (x/100) + (x%100);
         aux = (int)Math.pow(soma,2);
         if (x == aux) 
         {
            System.out.println("O n�mero "+x+" pertence a faixa e possui esta caracter�stica.");
         }
         else
         {
            System.out.println("O n�mero "+x+" pertence a faixa, mas n�o possui esta caracter�stica.");
         }
      }
      else
      {
         System.out.println("O n�mero "+x+" n�o pertence a faixa e nem possui a mesma caracter�stica que o n�mero 3025.");
      }
   }
   //Ler um c�digo do teclado e mostrar o nome correspondente, de acordo com a lista
   public static void ex08()
   {
      Scanner leia = new Scanner(System.in);
      int a;
      System.out.println("+-------------------------------Quest�o 03-----------------------------------------+");
      System.out.println("| Ler um c�digo do teclado e mostrar o nome correspondente, de acordo com a lista: |");
      System.out.println("|              221 Bernardo;211 Eust�quio;311 Luiz;312 M�rio;332 Artur              |");
      System.out.println("+----------------------------------------------------------------------------------+");
      System.out.println("Escolha entre os c�digos 211,221,311,312,332 para saber o nome na lista");
      a = leia.nextInt();  
      if(a==211){
         System.out.println("211 = Eust�quio.");
      }
      else{
         if(a==221){
            System.out.println("221 = Bernardo.");
         }
         else{
            if(a==311){
               System.out.println("311 = Luiz.");
            }
            else{
               if(a==312){
                  System.out.println("312 = M�rio.");
               }
               else{
                  if(a==332){
                     System.out.println("221 = Artur.");
                  }
                  else{
                     System.out.println("O numero "+a+" � inexistente na lista.");
                  }
               }
            }
         }
      }
   }

   //Fazer um algoritmo que dado um numero de 5 d�gitos; calcule e escreva se este e ou n�o pal�ndromo.
   public static void ex09()
   {
      Scanner teclado = new Scanner(System.in);
      int x,quociente,unidade,dezena,centena,milhar,dm;
      System.out.println("+-----------------------------------------Quest�o 09-------------------------------------------+");
      System.out.println("|   Algoritmo que dado um numero de 5 d�gitos; calcula e escreve se este � ou n�o pal�ndromo.  |");
      System.out.println("+----------------------------------------------------------------------------------------------+");
      System.out.print("Digite um valor inteiro de 5 algarismos: ");
      x = teclado.nextInt();
      if ( x >= 10000 && x <= 99999 )
      {
         quociente = x;
         unidade = quociente % 10;
         quociente = quociente / 10;
         dezena = quociente % 10;
         quociente = quociente / 10;
         centena = quociente % 10;
         quociente = quociente / 10;
         milhar = quociente % 10;
         quociente = quociente / 10;
         dm = quociente % 10;
         if ( unidade == dm && dezena == milhar )
            System.out.println(x + " � palindromo.");
         else
            System.out.println(x + " N�o � palindromo.");
      }
      else
         System.out.println(x + "N�o � um n�mero de 5 algarismos");
   }
   /*Desenvolver um algoritmo para calcular a conta de �gua para a SANEAGO. O custo da �gua varia dependendo do tipo do
consumidor - residencial, comercial ou industrial. A regra para calcular a conta e:
� (R)Residencial: R$ 75,00 de taxa mais R$ 3,50 por m3 gastos;
� (C)Comercial: R$ 500,00 para os primeiros 80 m3 gastos mais R$ 5,50 por m3 gastos acima dos 80 m3;
� (I)Industrial: R$ 800,00 para os primeiros 100 m3 gastos mas R$ 8,00 por m3 gastos acima dos 100 m3;
O algoritmo devera ler a conta do cliente, seu tipo (residencial, comercial e industrial) e o seu consumo de �gua em metros cubos.
Como resultado imprimir o valor a ser pago pelo mesmo.*/
   public static void ex10()
   {
      Scanner leia = new Scanner(System.in);
      char tipo;
      double consumo, taxa;
      System.out.println("+-----------------------------------------------Quest�o 10----------------------------------------------+");
      System.out.println("| um algoritmo para calcular a conta de �gua para a SANEAGO. O custo da �gua varia dependendo do tipo do|");
      System.out.println("|            consumidor - residencial= R$ 75,00, comercial=R$ 500,00 ou industrial=R$ 800,00            |");
      System.out.println("+-------------------------------------------------------------------------------------------------------+");
      System.out.print("Digite o tipo da sua conta (R) Residencial | (C) Comercial | (I) Industrial : ");
      tipo = leia.next().charAt(0);
      System.out.print("Digite o seu consumo de �gua : ");
      consumo=leia.nextDouble();
      if (tipo == 'R' || tipo == 'r')
      {
         taxa = 75 + 3.50 * consumo;   
         System.out.println("Valor a ser pago : "+taxa);
      } 
      else
      {
         if (tipo == 'C' || tipo == 'c')
         {
            if (consumo <= 80)
            {
               taxa = 500;
               System.out.println("Valor a ser pago : "+taxa);
            }
            else 
            {
            // Pra pegar quem extrapolou o limite pegamos o consumo e subtraimos do limite que � 80
               taxa = 500 + (consumo - 80) * 5.50;
               System.out.println("Valor a ser pago : "+taxa);
            }
         }
         else 
         {
            if (tipo == 'I' || tipo == 'i')
            {
               if (consumo <= 100)
               {
                  taxa = 800;
                  System.out.println("Valor a ser pago : "+taxa);
               }
               else
               {
               // Pra pegar quem extrapolou o limite pegamos o consumo e subtraimos do limite que � 100
                  taxa = 800 + (consumo - 100) * 8.00;
                  System.out.println("Valor a ser pago : "+taxa);
               }
            }
            else 
            {
               System.out.println("\nTipo Inv�lido!");
            }
         }
      }
   }

   

}
   
      

