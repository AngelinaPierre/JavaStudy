import java.io.*;

public class MaiorMatriz{
    public static void main(String args[]) throws java.io.IOException{
        // declarando matrix
        int[][] matrix;
        int linha, coluna, maior= -32000;
        String aux;
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entre com a ordem da matrix (linha, coluna) :");
        aux = kb.readLine();
        linha = Integer.valueOf(aux).intValue();
        aux = kb.readLine();
        coluna = Integer.valueOf(aux).intValue();
        System.out.println("Entre com os numeros da matriz");
        matrix = new int[linha][coluna];
        for(int i=0; i< linha; i++){
            for(int j=0; j< coluna; j++){
                aux = kb.readLine();
                matrix[i][j] = Integer.valueOf(aux).intValue();
                if(matrix[i][j] > maior){
                    maior = matrix[i][j];
                }
                
            }
        }
        System.out.println("O maior numero da matrix é: " + maior);
    }
}