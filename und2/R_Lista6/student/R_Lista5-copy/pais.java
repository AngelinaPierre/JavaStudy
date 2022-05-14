public class pais{
    private String nome, capital;
    private float dimensao;
    private pais fronteira[]; // vetor/lista de paises que fazem fronteira
    private int total; // indice do vetor/lista de paises que fazem fronteira
    
    // construtor
    public pais(String n, String c, float d){
        // uso do this para referencia ao objeto
        this.nome = n;
        this.capital = c;
        this.dimensao = d;
        // instanciando o vetor/lista de paises que fazem fronteira
        fronteira = new pais[40];
        total = 0;
    }
    
    public void addVizinhos(pais objPais){
        fronteira[total] = objPais;
        total++;
    }    
    // setters and getters
    public void setNome(String n){
        this.nome = n;
    }
    public void setCapital(String c){
        this.capital = c;
    }
    public void setDimensao(float d){
        this.dimensao = d;
    }
    public int getTotal(){
        return total;
    }
    public String getNome(){
        return nome;
    }
    public String getCapital(){
        return capital;
    }
    public float getDimensao(){
        return dimensao;
    }
    
    public boolean equals(pais outro){
        if((this.getNome().equals(outro.getNome()) && (this.getCapital().equals(outro.getCapital())))){
            return true;
        }else{
            return false;
        }
    }
    
    public boolean limitrofe(pais objPais){
        int i = 0;
        boolean achou = false;
        while((achou != true) && (i < total)){
            if((objPais.getNome().equals(this.fronteira[i].getNome()))){
                achou = true;
            }
            i++;
        }
        return achou;
    }
    
    public void vizinhosComuns(pais objPais){
        System.out.println("**** Vizinhos Comuns **** ");
        for(int i = 0; i < getTotal(); i++){
            for(int j = 0; j < objPais.getTotal(); j++){
                if(this.fronteira[i].getNome().equals(objPais.fronteira[j].getNome())){
                    System.out.println(this.fronteira[i].getNome());
                }
            }
        }
    }
    
}