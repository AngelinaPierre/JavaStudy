public class Movimentacao{
    String descricao;
    float valor;
    String tipo;
    
    public Movimentacao(String desc, float v, String t){
        descricao = desc;
        valor = v;
        tipo = t;
    }
}

//Uma movimentação possui uma 
// descrição, um valor e uma informação se ela é uma movimentação de crédito ou débito.