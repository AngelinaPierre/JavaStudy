
/**
 * Interface de Disco, qualquer classe que queira simular o funcionamento
 * de um disco deve implementar os metodos aqui descritos.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface DiscoIF{
   /** Metodo que insere o byte <CODE>b</CODE> no endereeo <CODE>end</CODE> do disco.
   * Qualquer classe que queira implementar esta interface deve implementar este
   * metodo.
   * @param end Endereço onde sera armazenado o byte <CODE>b</CODE>.
   * @param b Byte a ser armazenado no endereço <CODE>end</CODE>.
   */ 
  public void setBloco(int end, char b);
  
  
  /** M�todo que retorna o byte contido no endere�o <CODE>end</CODE> do disco.
   * Qualquer classe que queira implementar esta interface deve implementar este
   * m�todo.
   * @param end Endere�o do disco de onde ser� retornado o valor.
   * @return Retorna o valor do byte contido na posi��o <CODE>end</CODE>.
   */  
  public char getBloco(int end);
  
}
