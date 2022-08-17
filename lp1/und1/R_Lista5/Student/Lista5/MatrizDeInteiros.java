public class MatrizDeInteiros{
    // atributo
    int[][] matrix;
    
    // construcotr params : ordem matrix
    public MatrizDeInteiros(int linha, int coluna){
        // instanciando matrix
        matrix = new int [linha][coluna];
        // inicializando matrix com 0
        for(int i = 0; i < linha; i++){
            for(int j = 0; j < coluna; j++){
                matrix[i][j] = 0;
            }
        }
    }
    // metodo inserção
    public void add(int linha, int coluna, int value){
        if( (linha >= 0) && (linha < matrix.length) && (coluna >=0) && (coluna < matrix[0].length) ){
            matrix[linha][coluna] = value;
        }else{
            System.out.println("Não foi possivel inserir o número. [ERR] = Indices fora de ordem.");
        }
    }
    public boolean eQuadrada(){
        // verificação tamanho linha-> coluna
        if(matrix.length == matrix[0].length){
            return true;
        }else{
            return false;
        }
    }
    public int pesquisa(int search){
        int linha=1;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == search){
                    linha = i;
                }
            }
        }
        return linha;
    }
    public void mostra(){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; i < matrix[0].length; j++){
                System.out.println(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public void soma(){
        int soma = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                soma = soma + matrix[i][j];
            }
        }
        System.out.println("A soma da Matriz é: " + soma);
    }
}