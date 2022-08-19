package src.secao13;

// Template method
public abstract class Treinamento{


    final void TreinoDiario(){
        preparoFisico();
        jogoTreino();
        treinoTatico();
    }

    public abstract void preparoFisico();
    public abstract void jogoTreino();
    public final void treinoTatico(){
        System.out.println("Treino Tatico\n");
    }
}