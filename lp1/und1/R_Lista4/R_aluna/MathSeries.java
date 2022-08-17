public class MathSeries
{
    // instance variables - replace the example below with your own
    private int y;
    private int x;

    /**
     * Constructor for objects of class MathSeries
     */
    public MathSeries(int x, int y)
    {
        // initialise instance variables
        this.x = x;
        this.y = y;
    }
    public void showElevateTo(){
        System.out.println(elevateTo());
    }
    public float elevateTo(){
        int aux = 1, result;
        result = x;
        while(aux < this.y){
            result = result * x;
            aux++;
        }
        return result;
    }
    public float piSquare8(int qtd){
        float denominator = 1, result = 0;
        do{
            result = result + (1 /(denominator * denominator));
            denominator = denominator + 2;
            qtd--;
        }while(qtd > 0);
        return result;
    }
    public float calculatePI(int qtd){
        int cont = 1;
        float result=2, numerator = 2, denominator = 1;
        while(cont < qtd){
            result = result * (numerator/denominator);
            System.out.println(numerator + "/" + denominator + "=" + result);
            cont++;
            denominator = denominator + 2;
            result = result * (numerator/denominator);
            System.out.println(numerator + "/" + denominator + "=" + result);
            cont++;
            numerator = numerator + 2;
        }
        return result;
    }
    // An example of a method - replace this comment with your own
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
}
