// definição da CLASSE ABSTRATA atraves da palavra ABSTRACT
abstract class Figura{
    
    int x; 
    int y;
    
    // a classe pode ter um CONSTRUTOR, mesmo que não possa instanciar objetos.
    public Figura(int x1, int y1){
        x = x1;
        y = y1;
    }
    // Declaração dos metodos abstratos. Esses metodos devem OBRIGATORIAMENTE ser implementados nas classes derivadas.
    public abstract void desenha();
    public abstract void apaga();
    
    // Declaração de um METODO NORMAL que poderá ser utilizado pelos objetos de classes derivadas;
    public void move(int x1, int y1){
        apaga();
        x = x1;
        y = y1;
        desenha();
    }
    
}
