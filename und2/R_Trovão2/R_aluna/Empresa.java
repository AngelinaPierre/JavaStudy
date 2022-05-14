public class Empresa implements TRE{
    String CGC;
    Pessoa funcionario[];

    public Empresa(String cgc, int qtd){
        CGC = cgc;
        funcionario = new Pessoa[qtd];
    }
    public void calculoDeVotantes(Pessoa objPessoa){
        if(objPessoa.idade < 16){
            objPessoa.situacao = NV;
        }else if((objPessoa.idade >= 16) && (objPessoa.idade < 18)){
            objPessoa.situacao = VF;
        }else if(objPessoa.idade >= 65){
            objPessoa.situacao = VF;
        }else{
            objPessoa.situacao = VO;
        }
    }
}