
/** Classe Disco, pertence a arquitetura Intel. */
public class Disco implements DiscoIF
{
    /** Variavel que contem o nome da classe atual.
   * @see #setBloco()
   * @see #getBloco()
   */
   
  protected String nomeDaClasse = "Disco";
  
  char blocos[];
  
  // COnstrutor padrao da classe disco
  
  public Disco(){
      blocos = new char[1024];
      for(int i = 0; i < 1024; i++){
          blocos[i] = '0';
      }
  }
  
  /** Metodo que insere o byte <CODE>b</CODE> no endereço <CODE>end</CODE> do disco.
   * @param end Endereço onde sera armazenado o byte <CODE>b</CODE>.
   * @param b Byte a ser armazenado no endereço <CODE>end</CODE>.
   */ 
  public void setBloco(int end, char b){
      try{
          blocos[end] = b;
          System.out.println("Class: " + nomeDaClasse +" / Metodo: setBloco() / Param: end=" + end + " ; b=" + b);
      }catch(Exception error){
          System.out.println("Erro: " + error);
      }
  }
  
  /** M�todo que retorna o byte contido no endere�o <CODE>end</CODE> do disco.
   * @param end Posi��o do disco de onde ser� retornado o valor.
   * @return Retorna o valor do byte contido na posi��o <CODE>end</CODE>.
   */  
  public char getBloco(int end){
      char temp = '0';
      try{
          temp = blocos[end];
          System.out.println("Class: " + nomeDaClasse +" / Metodo: getBloco() / Param: end=" + end);
      }catch(Exception e){
          System.out.println("Erro: " + e);
      }
      return temp;
  }
}
