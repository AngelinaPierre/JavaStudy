/** 
 * Interface que deve ser implementada por toda classe que deseja implementar
 * o funcionamento de uma CPU.
 */
public interface CPUIF{
    // Retorna o resultado da soma de dois parametros passados, x e y.
    public int somar(int x, int y);
    
    // Retorna o resultado da subtraçao dos dois parametros passados, x e y.
    public int subtrair(int x, int y);
    
    // Retorna o resultado da multiplicaçao dos dois parametros passados, x e y.
    public int multiplicar(int x, int y);
    
    // Retorna o resultado da divisao dos dois parametros passados, x e y.
    public float dividir(int x, int y);
   

}
