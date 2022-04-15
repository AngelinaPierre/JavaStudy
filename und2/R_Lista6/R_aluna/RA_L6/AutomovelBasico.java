// USO DO EXTENDS PARA AUTOMOEL BASICO HERDAR DE AUTOMOVEL
public class AutomovelBasico extends Automovel{
    // atributos
    private boolean retrovisorDoLadoDoPassageiro;
    private boolean limpadorDoVidroTraseiro;
    private boolean radioAMFM;
    
    public AutomovelBasico(String m, String c, byte comb, boolean r, boolean l, boolean af){
        // SUPER -> INDICA QUE DEVE SER USADO O CONSTRUTOR DA CLASSE PAI.
        super(m,c,comb);
        retrovisorDoLadoDoPassageiro = r;
        limpadorDoVidroTraseiro = l;
        radioAMFM = af;
    }
    public AutomovelBasico(String m, String c, byte comb){
        super(m,c,comb);
        retrovisorDoLadoDoPassageiro = true;
        limpadorDoVidroTraseiro = true;
        radioAMFM = true;
    }
    // OS DOIS METODOS A SEGUIR POSSUEM A MESMA ASSINATURA DA CLASSE AUTOMOVEL, O QUE CARACTERIZA UMA REDEFINIÇÃO DE METODOS DA CLASSE BASE.
    public float quantoCusta(){
        float preco = super.quantoCusta();
        if(retrovisorDoLadoDoPassageiro == true){
            preco = preco + 280;
        }
        if(limpadorDoVidroTraseiro == true){
            preco = preco + 650;
        }
        if(radioAMFM == true){
            preco = preco + 190;
        }
        return preco;
    }
    // SUPER -> INDICA QUE DEVE SER CHAMADO O METODO QUANTOCUSTA() E TOsTRING() DA CLASSE BASE.
    public String toString(){
        String resultado = super.toString();
        if(retrovisorDoLadoDoPassageiro == true){
            resultado += "Com limpador traseiro \n";
        }
        if(limpadorDoVidroTraseiro == true){
            resultado += "Com limpador traseiro \n";
        }
        if(radioAMFM == true){
            resultado += "Com radio \n";
        }
        return resultado;
    }
        
}

