public class Lista01Ex03{
public static void main (String[] args) {
// definir dados
int x = 0 ; // definir variavel com valor inicial
double y = 3.5; // definir variavel com valor inicial
char z = 'A'; // definir variavel com valor inicial
boolean w = false; // definir variavel com valor inicial
// identificar
System.out.printf ( "%s\n", "EXEMPLO- Programa - v0.0" );
System.out.printf ( "%s\n", "Autor: Yan Miranda" );
System.out.printf ( "\n" ); // mudar de linha
// mostrar valores iniciais
System.out.printf ( "01. %s%d\n", "x = ", x );
System.out.printf ( "02. %s%f\n", "y = ", y );
System.out.printf ( "03. %s%c\n", "z = ", z );
// converter entre tipos de dados (type casting)
x = (int) z; // codigo inteiro equivalente ao caractere
System.out.printf ( "04. %s%d -> %c\n", "x = ", x, z );
x = (int) y; // parte inteira de real
System.out.printf ( "05. %s%d -> %f\n", "x = ", x, y );
x = 97;
z = (char) x; // caractere equivalente ao codigo inteiro
System.out.printf ( "06. %s%c -> %d\n", "z = ", z, x );
x = (int) '0'; // codigo inteiro equivalente ao caractere
z = (char) x; // caractere equivalente ao codigo inteiro
System.out.printf ( "07. %s%c -> %d\n", "z = ", z, x );
x = w ? 1:0; // / se verdadeiro então ( 1 ), senão ( 0 )
System.out.printf ( "08. %s%b -> %s%d\n", "w = ",w," x = ", x);
w=true;
x = w ? 1:0; // / se verdadeiro então ( 1 ), senão ( 0 )
System.out.printf ( "09. %s%b -> %s%d\n", "w = ",w," x = ", x);
}
}