package src.secao13;

public class TreinamentoFimTemporada extends Treinamento{
    
    @Override
    public void preparoFisico() {
        System.out.println("Preparo fisico fim de temporada.");
    }
    @Override
    public void jogoTreino() {
        System.out.println("Jogo treino fim de temporada");        
    }

    
}