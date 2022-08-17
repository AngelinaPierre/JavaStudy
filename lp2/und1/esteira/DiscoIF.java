package produtoIF;

/**
 * 
 * @author Hilton
 */
/** Interface de Disco, qualquer classe que queira simular o funcionamento de um
 * disco deve implementar os m�todos aqui descritos.
 */
public interface DiscoIF {
  
  /** M�todo que insere o byte <CODE>b</CODE> no endere�o <CODE>end</CODE> do disco.
   * Qualquer classe que queira implementar esta interface deve implementar este
   * m�todo.
   * @param end Endere�o onde ser� armazenado o byte <CODE>b</CODE>.
   * @param b Byte a ser armazenado no endere�o <CODE>end</CODE>.
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
