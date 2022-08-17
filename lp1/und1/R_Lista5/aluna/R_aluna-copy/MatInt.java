public class MatInt
{
    // instance variables - replace the example below with your own
    private int[][] matrixInt;
    private int line, column;
    //Constructor for objects of class MatInt
    public MatInt(OrderMatrix o){
        line = o.getLine();
        column = o.getColumn();
        this.matrixInt = new int[line][column];
        for(int i = 0; i < o.getLine() ; i++){
            for(int j = 0; j < o.getColumn(); j++){
                this.matrixInt[i][j] = 0;
            }
        }
        // int value = 0;
        // for( int[] l : matrixInt){
            // for( int el : l){
                // value = el;
                // System.out.println(value);
            // }   
        // }
    }
    // setter and getters
    public void addMatrixInt(int l, int c, int v){
        if(l > matrixInt.length || c > matrixInt.length){
            System.out.println("Out of Matrix Order");
        }
        matrixInt[l][c] = v;
    }
    public boolean isSquare(MatInt m){
        if(line > column){
            return false;
        }else{
            return true;
        }
    }
    public int MatrixTotalValue(){
        int total = 0;
        for(int[] line : matrixInt){
            for(int el : line){
                total = total + el;
            }
        }
        return total;
    }
    public int SearchValueInLine(int val){
        int line = 0;
        for(int i = 0; i < matrixInt.length; i++){
            for(int j = 0; j < matrixInt.length; j++){
                if( val == matrixInt[i][j]){
                    System.out.println("Value: " + val + "is in Line: " + i );
                    line = i;
                    return line;
                }else{
                    line = -1;
                }
            }   
        }
        return line;
    }
}
