public class Aviao{
    private int prefixo, qtdAssentos, qtdOcupados;
    private String modelo, fabricante;
    
    public Aviao(int p, int qa, int qo, String m, String f){
        this.prefixo = p;
        this.qtdAssentos = qa;
        this.qtdOcupados = qo;
        this.modelo = m;
        this.fabricante = f;
    }
    
    public int getPrefixo(){
        return prefixo;
    }
    public void imprimePrefixo(){
        System.out.println("O prefixo do aviao = " + prefixo);
    }
}