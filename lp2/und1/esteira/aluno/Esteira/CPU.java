/**
 * Classe CPU, reponsavel pelo processamento das quatros operacoes
 * basicas em 16 bits.
 *
 * @author Marcelo Benjamin
 */
public class CPU implements CPUIF
{
    /** Variavel que contem o nome da classe atual.
   * @see #somar()
   * @see #subtrair()
   * @see #multiplicar()
   * @see #dividir()
   */
  
  protected String nomeDaClasse = "CPU";
  
  /** Retorna o resultado da soma dos dois parametros passados,
   * x e y.
   * @param x 1o numero a somar
   * @param y 2o numero a somar
   * @return Retorna a soma de x+y
   */
  
  public int somar(int x, int y){
      int soma = 0;
      try{
          soma = x + y;
          System.out.println("Class: " + nomeDaClasse + " / Metodo: somar() / Param: x=" + x + "; y=" + y);
      }catch(Exception error){
          System.out.println("Error: " + error);
      }
      return soma;
  }
  
  /** Retorna o resultado da subtracao dos dois parametros passados,
   * x e y.
   * @param x Subtraendo
   * @param y Subtrator
   * @return Retorna a subtracao de x-y
   */
  
  public int subtrair(int x, int y){
      int sub = 0;
      try{
          sub = x - y;
          System.out.println("Class: " + nomeDaClasse + " / Metodo: subtrair() / Param: x=" + x + " ; y=" + y);
      }catch(Exception err){
          System.out.println("Erro: " + err);
      }
      return sub;
  }
  
  /** Retorna o resultado da multiplicacao dos dois parametros passados,
   * x e y.
   * @param x Multiplicando
   * @param y Multiplicador
   * @return Retorna a multiplicacao de x*y
   */
  
  public int multiplicar(int x, int y){
      int mult = 0;
      try{
          mult = x * y;
          System.out.println("Class: " + nomeDaClasse + " / Metodo: multiplicar() / Param: x=" + x + " ; y=" + y);
      }catch(Exception e){
          System.out.println("Error: " + e);
      }
      return mult;
  }
  
  /** Retorna o resultado da divisao dos dois parametros passados,
   * x e y.
   * @param x 1o Dividendo
   * @param y 2o Divisor
   * @return Retorn a divisao de x por y
   */
  public float dividir(int x, int y){
      int div = 0;
    try{
      div = x / y;
      System.out.println("Class: " + nomeDaClasse + " / Metodo: dividir() / Param: x=" + x + " ; y=" + y);
    }catch(Exception e){
      System.out.println("Erro: " + e);
    }
    return div;
  }
}
