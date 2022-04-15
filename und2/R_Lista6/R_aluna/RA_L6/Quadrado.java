class Quadrado extends Figura{
    public Quadrado(int x1, int y1){
        // utilização do CONSTRUTOR DA CLASSE BASE.
        super(x1,y1);
    }
    // implementação OBRIGATORIA dos METODOS definidos na CLASSE ABSTRATA.
    public void desenha(){
        System.out.println("Desenhando quadrado(" + x + "," + y + ")");
    }
    public void apaga(){
        System.out.println("Apagando quadrado(" + x + "," + y + ")");
    }
}
