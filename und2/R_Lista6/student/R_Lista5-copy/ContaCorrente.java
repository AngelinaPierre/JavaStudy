public class ContaCorrente{
    int numero, especial;
    float saldo;
    float limite;
    Movimentacao objMovimentacao[]; // vetor
    int movimentos = 0;
    
    public ContaCorrente(int n, int esp, float s, float lim){
        numero = n;
        especial = esp;
        saldo = s;
        limite = lim;
        // instanciamento do vetor de movimentos com limite de 100
        objMovimentacao = new Movimentacao[100];
        movimentos = 0; // indice de controle para o vetor de movimentos.
    }
    
    public void movimento(String desc, float v, String t){
        // instanciando uma unica movimentacao(com valores) e colocando no vetor de movimentacoes.
        objMovimentacao[movimentos] = new Movimentacao(desc,v,t);
        movimentos++;
    }
    public void emiteExtrato(ContaCorrente obj){
        for(int i = 0; i < obj.movimentos; i++){
            System.out.println("Descricao = " + obj.objMovimentacao[i].descricao);
            System.out.println("Valor = " + obj.objMovimentacao[i].valor);
            System.out.println("Tipo = " + obj.objMovimentacao[i].tipo);
            System.out.println("*************************************");            
        }
    }
}