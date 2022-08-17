
/** Classe Memoria, pertence a arquitetrua Intel. */
public class Memoria implements MemoriaIF
{
    /** Variavel que contem o nome da classe atual.
   * @see #getBloco()
   * @see #setBloco()
   */  
    protected String nomeDaClasse = "Memoria";
    private char dados[], dadosXYZ[];
    
    /** Construtor padrao da classe Memoria. */  
    public Memoria(){
        dados = new char[1024];
        for(int i = 0; i < 1024; i++){
            dados[i] = '0';
        }
    }
    
    public Memoria(char xyz){
        dadosXYZ = new char[1024];
        for(int i = 0; i < 1024; i++){
            dadosXYZ[i] = '0';
        }
    }
    
    
    public void setByte(int end, char b){
        try{
            dados[end] = b;
            System.out.println("Class: " + nomeDaClasse +" / Metodo: setByte() / Param: end=" + end + " ; b=" + b);
        }catch(Exception err){
            System.out.println("Erro: " + err);
        }
    }
    
    
    public char getByte(int end){
        char temp = '0';
        try{
            temp = dados[end];
            System.out.println("Class: " + nomeDaClasse +" / Metodo: getByte() / Param: end=" + end);
        }catch(Exception er){
            System.out.println("Erro: " + er);
        }
        return temp;
    }
}
