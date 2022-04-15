// CLASSE BASE
public class Automovel
{
    // DECLARAÇÃO DE CONSTANTES
    public static final byte movidoAGasolina = 1;
    public static final byte movidoAAlcool = 2;
    public static final byte movidoADisel = 3;
    public static final byte numeroMaximoDePrestacoes = 24;
    
    // ATRIBUTOS
    private String modelo, cor;
    private byte combustivel;
    
    // CONSTRUTOR
    public Automovel(String m, String c, byte comb){
        modelo = m;
        cor = c;
        combustivel = comb;
    }
    public byte quantasPrestacoes(){
        return numeroMaximoDePrestacoes;
    }
    public float quantoCusta(){
        float preco = 0;
        switch(combustivel){
            case movidoAGasolina:
                preco = 12000.0f;
                break;
            case movidoAAlcool:
                preco = 10500.0f;
                break;
            case movidoADisel:
                preco = 11000.0f;
                break;
        }
        return preco;
    }
    public String toString(){
        String resultado;
        resultado = modelo + "" + cor + "\n";
        switch(combustivel){
            case movidoAGasolina:
                resultado += "Gasoline \n";
                break;
            case movidoAAlcool:
                resultado += "Alcool \n";
                break;
            case movidoADisel:
                resultado += "Disel \n";
                break;
        }
        return resultado;
    }
}
