public class Linha implements FiguraGeometrica{
    
    int x, y;
    public Linha(int x1, int y1){
        x = x1;
        y = y1;
    }
    public void desenha(){
        System.out.println("Desenhando Linha (" + x + "," + y + ")");
    }
    public void apaga(){
        System.out.println("Apagando Linha (" + x + "," + y + ")");
    }
    public void move(int x1, int y1){
        
        this.apaga();
        x = x1;
        y = y1;
        this.desenha();
    }
}
