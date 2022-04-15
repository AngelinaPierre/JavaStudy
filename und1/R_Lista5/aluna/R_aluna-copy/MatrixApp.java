import java.util.Scanner;
public class MatrixApp
{
    public static void main(String args[]){
        int bigger = 0;
        OrderMatrix order;
        int[][] matrix;
                
        order = new OrderMatrix();
        
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Type Matrix order[LxC]\n ");
        System.out.println("Type Line : ");
        order.setLine(kb.nextInt());
        System.out.println("Type Colunm : ");
        order.setColumn(kb.nextInt());
        order.showOrder();
        matrix = new int[order.getLine()][order.getColumn()];
        
        for(int i = 0; i < order.getLine(); i++){
            for(int j = 0; j < order.getColumn(); j++){
                System.out.println("Type matrix value [" + i + "][" + j + "] :");
                matrix[i][j] = kb.nextInt();
            }
        }
        for(int i = 0; i < order.getLine(); i++){
            for(int j = 0; j < order.getColumn(); j++){
                System.out.println("Matrix [" + i + "][" + j + "] = " + matrix[i][j]);
                if(matrix[i][j] > bigger){
                    bigger = matrix[i][j];
                }
            }
        }
        System.out.println("\n Biggest Number = " + bigger);                  
    }
}

