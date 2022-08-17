import java.util.Scanner;
public class MatrixSquareApp
{
    public static void main(String args[]){
        OrderMatrix order;
        int[][] matrix;
        int soma = 0;
        order = new OrderMatrix();
        Scanner kb = new Scanner(System.in);
        
        System.out.println("Type Matrix order[LxC]\n ");
        
        do{
            System.out.println("Type Line : ");    
            order.setLine(kb.nextInt());
            System.out.println("Type Colunm : ");
            order.setColumn(kb.nextInt());
            if(order.getLine() != order.getColumn()){
                System.out.println("Needs Square Matrix! Type Agin..");
            }
        }while(order.getLine() != order.getColumn());
        order.showOrder();
        matrix = new int[order.getLine()][order.getColumn()];
        
        
        for(int i = 0; i < order.getLine(); i++){
            for(int j = 0; j < order.getColumn(); j++){
                System.out.println("Type matrix value [" + i + "][" + j + "] :");
                matrix[i][j] = kb.nextInt();
            }
        }
        System.out.println("Diagonal Secundaria");
        for(int i = 0; i < order.getLine(); i++){
            System.out.println("Matrix [" + i + "][" + (order.getLine() - 1 - i) + "] = " + matrix[i][order.getLine() - 1 - i]);
            soma = soma + matrix[i][order.getLine() - 1 - i];
        }
        System.out.println("Soma Diagonal Secundaria = " + soma);
    }
}
