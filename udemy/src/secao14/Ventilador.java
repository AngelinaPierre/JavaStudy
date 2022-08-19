package src.secao14;

public class Ventilador implements IEletronico{

    private boolean ligado = false;

    @Override
    public void desligar() {
        if(this.ligado){
            this.ligado = false;
            System.out.println("Desliguei o aparelho!");
        }        
    }

    @Override
    public void ligar() {
        if(!this.ligado){
            this.ligado = true;
            System.out.println("Liguei o aparelho!");
        }        
    }
    
}