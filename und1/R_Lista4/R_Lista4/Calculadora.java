public class Calculadora
{
    private double n1, n2, resultado;
    private char operador;
    
    public Calculadora(double n1, double n2, char operador)
    {
        this.n1 = n1;
        this.n2 = n2;
        this.operador = operador;
    }
    
    public void operacao()
    {
        switch(operador)
        {
            case '+': resultado = n1+n2; 
            break;
            case '-': resultado = n1-n2;
            break;
            case '*': resultado = n1*n2;
            break;
            case '/': 
            {
                if (n2==0)
                {
                    System.out.println("Nao é possivel fazer divisao por 0");
                    return;
                }
                else
                {
                    resultado = n1/n2;
                }
            }
            break;
            default : 
            {      System.out.println("Este operador não é válido");
                   return;
            }       
        }
        imprimeResultado();
    }
    
    public void imprimeResultado()
    {
        System.out.println("O resultado eh: "+resultado);
    }
    
    public void setN1(float n1)
    {
        this.n1 = n1;
    } 
    
    public void setN2(float n2)
    {
        this.n2 = n2;
    }
    
    public void setOperador(char operador)
    {
        this.operador = operador;
    }
    
    public double getN1()
    {
        return n1;
    }
    
    public double getN2()
    {
        return n2;
    }
    
    public char getOperador()
    {
        return operador;
    }
        
}