public class Aeroporto{
    private String codigo, nome;
    private boolean internacional;
    private Aeroporto parte[], chega[];
    private Aviao patio[];
    private int Tparte=0, Tchega=0, Tpatio=0;
    
    public Aeroporto(String c, String n, boolean status){
        this.codigo = c;
        this.nome = n;
        this.internacional = status;
        // instanciando os vetores
        parte = new Aeroporto[40];
        chega = new Aeroporto[40];
        patio = new Aviao[40];
    }
    
    public void setInternacional(char tipo){
        if((tipo == 's') || (tipo == 'S')){
            internacional = true;
        }else{
            internacional = false;
        }
    }
    public boolean getInternacional(){
        return internacional;
    }
    public String getCodigo(){
        return codigo;
    }
    
    public void addParte(Aeroporto objAeroporto){
        parte[Tparte] = objAeroporto;
        Tparte++;
    }
    public void addChega(Aeroporto objAero){
        chega[Tchega] = objAero;
        Tchega++;
    }
    public void addPatio(Aviao a){
        patio[Tpatio] = a;
        Tpatio++;
    }
    
    public boolean iguais(Aeroporto objAeroporto){
        if(getCodigo().equals(objAeroporto.getCodigo())){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean pousado(int pref){
        int i = 0; 
        boolean achou = false;
        while((i < Tpatio) && (achou == false)){
            if(patio[i].getPrefixo() == pref){
                achou = true;
            }
            i++;
        }
        return achou;
    }
    
    public boolean vooDireto(Aeroporto aeroporto){
        int i = 0;
        boolean achou = false;
        while((i < Tparte) && (achou == false)){
            if(parte[i].getCodigo().equals(aeroporto.getCodigo())){
                achou = true;
            }
            i++;
        }
        return achou;
    }
    
}