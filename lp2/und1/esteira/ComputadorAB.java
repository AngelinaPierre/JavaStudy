package produtoAbstrato;

/**
 * 
 * @author Hilton
 */
import produtoIF.ComputadorIF;
import produtoIF.DiscoIF;
import produtoIF.MemoriaIF;
import produtoIF.CPUIF;

public abstract class ComputadorAB 	
	implements ComputadorIF {
    
    protected String nomeDaClasse;
    
    private CPUIF cpu;
    private MemoriaIF memoria;
    private DiscoIF disco;

    /** Construtor padrao da Classe Computador. 
     * Cria um Disco, uma CPU e uma Memoria
     * para este computador.
     */  
     
    public ComputadorAB(){   
        cpu = this.criarCPU();
        memoria = this.criarMemoria();
        disco = this.criarDisco();
    }
    
    protected abstract CPUIF criarCPU();
    
    protected abstract MemoriaIF criarMemoria();
    
    protected abstract DiscoIF criarDisco();
    
    /** M�todo que liga o Computador. */  
    public void ligar(){
      System.out.println("\nClass: " + nomeDaClasse + " / Metodo: ligar()");
      System.out.println("\nSoma: " + cpu.somar(5,6) );
      System.out.println("\nSubtracao: " + cpu.subtrair(11,8) );
      System.out.println("\nMultiplicacao: " + cpu.multiplicar(4,9) );
      System.out.println("\nDivisao: " + cpu.dividir(20,5) );
      System.out.println("\ngetByte: " +  memoria.getByte(118) );
      memoria.setByte(245,'A');
      System.out.println("\ngetBloco: " + disco.getBloco(574) );
      disco.setBloco(587,'F');
    }

    /** M�todo que ldesiga o Computador. */  
    public void desligar(){
      System.out.println("Class: " + nomeDaClasse + " / Metodo: desligar()");
    }
    
}
