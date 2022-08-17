public class OrderMatrix
{
    // instance variables - replace the example below with your own
    private int line, column;
    //Constructor for objects of class OrderMatrix

    public OrderMatrix(int l, int c){
        this.line = l;
        this.column = c;
    }
    public OrderMatrix(){
    }
    public void showOrder(){
        System.out.println("Matrix Order = [" + line + "][" + column + "]");
    }
    //setters and getters
    public void setLine(int l){
        this.line = l;
    }
    public void setColumn(int c){
        this.column = c;
    }
    public int getLine(){
        return line;
    }
    public int getColumn(){
        return column;
    }

}
