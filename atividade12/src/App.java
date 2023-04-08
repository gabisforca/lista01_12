import java.util.Scanner;
class Main {
  public static void main(String[] args){
    //passo 1:variavel
    double altura;
    double pesoideal;
    
    //passo 2: entrada de dados 
    Scanner teclado = new Scanner(System.in);
    System.out.println("Qual sua altura:");
    altura = teclado.nextDouble();
    
    // passo 3: calcular peso ideal
    pesoideal = (72.7 * altura) - 58;
    // passo 4: exibir pesoideal
    System.out.println("O seu peso ideial é:" + pesoideal);
  }
}   