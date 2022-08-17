package produtoIF;


/**
 * 
 * @author Hilton
 */
/** Interface que deve ser implementada por toda classe que deseja implementar
 * o funcionamento de uma CPU.
 */
public interface CPUIF{

  /** Retorna o resultado da soma dos dois parametros passados,
   * x e y.
   * @param x 1o numero a somar
   * @param y 2o numero a somar
   * @return Retorna a soma de x+y
   */  
  public int somar(int x, int y);

  /** Retorna o resultado da subtracao dos dois parametros passados,
   * x e y.
   * @param x Subtraendo
   * @param y Subtrator
   * @return Retorna a subtracao de x-y
   */  
  public int subtrair(int x, int y);

  /** Retorna o resultado da multiplicacao dos dois parametros passados,
   * x e y.
   * @param x Multiplicando
   * @param y Multiplicador
   * @return Retorna a multiplicacao de x*y
   */  
  public int multiplicar(int x, int y);
  
  /** Retorna o resultado da divisao dos dois parametros passados,
   * x e y.
   * @param x Dividendo
   * @param y Divisor
   * @return Retorna a divisao de x por y
   */  
  public float dividir(int x, int y);
    
}