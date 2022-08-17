public class Empresa implements TRE
{
    String CGC;
    Pessoa funcionario[];
    
    public Empresa(String cgc, int qtd)
    {
        CGC = cgc;
        funcionario = new Pessoa[qtd];
    }
    
    public void calculoDeVotantes(Pessoa obj)
    {
        if (obj.idade < 16)
        {
            obj.situacao = NV;
        }
        else
        {
            if ((obj.idade >= 16) && (obj.idade < 18)) 
            {
                obj.situacao = VF;
            }
            else
            { 
                if (obj.idade >= 65)
                {
                    obj.situacao = VF;
                }
                else
                {
                   obj.situacao = VO;
                }
            }    
        }
    }
    
}
