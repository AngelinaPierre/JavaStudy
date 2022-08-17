
/**
 * Interface de Memoria. Declara quais s�o os m�todos que dever�o ser implementados
 * por qualquer classe que implemente esta Interface.
 *
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public interface MemoriaIF{
   /** Metodo que insere um byte recebido como parametro em uma posiçao recebida como par�metro.
   * @param end Endereço onde sera armazenado o byte <CODE>b</CODE>.
   * @param b Byte a ser armazenado na posiçao <CODE>end</CODE>.
   */ 
  
  public void setByte(int end, char b);
  
  /** Metodo que retorna um byte armazenado em um determindao endereço de memoria.
   * @param end Endereoo onde esta armazenado o byte desejado.
   * @return Retorna o byte armazenado na posiçao informada.
   */  
  public char getByte(int end);
}
