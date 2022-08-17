import java.util.Scanner;

public class CalcApp{
    public static void main(String args[]){
        Double n1, n2, result;
        char op;
        Scanner teclado = new Scanner(System.in);
        
        do{
            System.out.println("Digite valor 1: ");
            n1 = teclado.nextDouble();
            System.out.println("Digite valor 2: ");
            n2 = teclado.nextDouble();
            System.out.println("Digite a operação: ");
            teclado.nextLine();
            op = teclado.nextLine().charAt(0);
            Calculator calc = new Calculator(n1,n2,op);
            calc.calculate(n1,n2,op);
        }while(n1!= 0);
        
    }
}