import java.io.*;

public class SomaDiagonalQuadrada{
    public static void main(String[] args) throws java.io.IOException{
        int [][] matrix;
        int linha, coluna, soma=0;
        String aux;
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entre com a ordem da matrix (linha, coluna):");
        aux = kb.readLine();
        linha = Integer.valueOf(aux).intValue();
        // verificação matrix quadrada linhas=colunas
        do{
            aux = kb.readLine();
            coluna = Integer.valueOf(aux).intValue();
        }while(coluna != linha);
        System.out.println("Entre com os numeros da matriz:");
        matrix = new int[linha][coluna];
        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                aux = kb.readLine();
                matrix[i][j] = Integer.valueOf(aux).intValue();
            }
        }
        //soma da diagonal secundaria. linha = coluna
        for(int i = 0; i < linha; i++){
            for(int j =0; j < coluna; j++){
                if( i == j){
                    soma = soma + matrix[i][j];
                }
            }
        }
        System.out.println("A soma da diagonal secundaria é: " + soma);
    }
}