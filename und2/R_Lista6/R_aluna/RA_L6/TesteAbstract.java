// CLASSE/PROGRAMA PARA TESTAR O ABSTRACT
public class TesteAbstract{
    public static void main(String args[]){
        
        Quadrado q = new Quadrado(10,10);
        q.desenha();
        q.move(50,50);
        q.apaga();
    }
}
