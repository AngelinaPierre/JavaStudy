package produtoConcreto.memoria;

/**
 * 
 * @author Hilton
 */
import produtoIF.MemoriaIF;


/** Classe Memoria, pertence a arquitetrua Intel. */
public class Memoria implements MemoriaIF{

  /** Variavel que contem o nome da classe atual.
   * @see #getBloco()
   * @see #setBloco()
   */  
  protected String nomeDaClasse = "Memoria";
  
  private char dados[];  
    
  /** Construtor padrao da classe Memoria. */  
  public Memoria(){
    dados = new char[1024];
    for ( int i=0 ; i<1024 ; i++){
      dados[i]='0';
    }
  }
  
  /** M�todo que insere um byte recebido como par�metro em uma posi��o recebida como par�metro.
   * @param end Endere�o onde ser� armazenado o byte <CODE>b</CODE>.
   * @param b Byte a ser armazenado na posic��o <CODE>end</CODE>.
   */  
  public void setByte(int end, char b){
    try{
      dados[end] = b;
      System.out.println("Class: " + nomeDaClasse +" / Metodo: setByte() / Param: end=" + end + " ; b=" + b);
    }catch(Exception e){
      System.out.println("Erro: " + e);
    }
  }

  /** M�todo que retorna um byte armazenado em um determindao endere�o de mem�ria.
   * @param end Endere�o onde est� armazenado o byte desejado.
   * @return Retorna o byte armazenado na posi��o informada.
   */  
  public char getByte(int end){
    char temp = '0';
    try{
      temp = dados[end];
      System.out.println("Class: " + nomeDaClasse +" / Metodo: getByte() / Param: end=" + end);
    }catch(Exception e){
      System.out.println("Erro: " + e);
    }
    return temp;
  }
  
}