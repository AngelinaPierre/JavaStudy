public class continente{
    private String nome;
    pais paises[];
    int total;
    
    public continente(String nome){
        this.nome = nome;
        paises = new pais[40];
        total = 0;
    }
    
    public void addPais(pais objPais){
        paises[total] = objPais;
        total++;
    }
    
    public void setNome(String n){
        this.nome = n;
    }
    public String getNome(){
        return nome;
    }
    public int getTotal(){
        return total;
    }
    
    public float dimensaoContinental(){
        float dimensao = 0;
        for(int i = 0; i < getTotal(); i++){
            dimensao = dimensao + paises[i].getDimensao();
        }
        return dimensao;
    }
}