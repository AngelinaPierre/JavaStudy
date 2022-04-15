public class Calculator
{
    // instance variables - replace the example below with your own
    private double value1, value2,result;
    private char simbolo;

    // Constructor for objects of class Calculator

    public Calculator(double v1, double v2, char sim){
        // initialise instance variables
        this.value1 = v1;
        this.value2 = v2;
        this.simbolo = sim;
    }
    // setters and getters
    public void setValue1(double v1){
        this.value1 = v1;
    }
    public void setValue2(double v2){
        this.value2 = v2;
    }
    public void setSimbolo(char sim){
        this.simbolo = sim;
    }
    public double getValue1(){
        return value1;
    }
    public double getValue2(){
        return value2;
    }
    public char getSimbolo(){
        return simbolo;
    }
    // An example of a method - replace this comment with your own
    public void showData(){
        System.out.println("O resultado eh: " + result);
    }
    public void calculate(double n1, double n2, char sim){
        switch(simbolo){
            case '+':
                result = value1 + value2;
                System.out.println(" Soma\n ");
                break;
            case '-':
                result = value1 - value2;
                System.out.println(" Subtração\n ");
                break;
            case '*':
                result = value1 * value2;
                System.out.println(" Multiplicação\n ");
                break;
            case '/':
                if(value2 == 0){
                    System.out.println("Não é possivel dividir por 0");
                }else{
                    result = value1/value2;
                    System.out.println(" Divisão\n ");
                }
                break;
            default:
                System.out.println("Este operador não é valido");
                return;                
        }
        showData();
    }
    
}
