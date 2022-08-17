package produtoIF;

/**
 * 
 * @author Hilton
 */
/** Interface de Memoria. Declara quais s�o os m�todos que dever�o ser implementados
 * por qualquer classe que implemente esta Interface.
 */
public interface MemoriaIF{

  /** M�todo que insere um byte recebido como par�metro em uma posi��o recebida como par�metro.
   * @param end Endere�o onde ser� armazenado o byte <CODE>b</CODE>.
   * @param b Byte a ser armazenado na posi��o <CODE>end</CODE>.
   */  
  public void setByte(int end, char b);

  /** M�todo que retorna um byte armazenado em um determindao endere�o de mem�ria.
   * @param end Endere�o onde est� armazenado o byte desejado.
   * @return Retorna o byte armazenado na posi��o informada.
   */  
  public char getByte(int end);
  
}