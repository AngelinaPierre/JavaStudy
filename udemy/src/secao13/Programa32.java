package src.secao13;

public class Programa32{
    public static void main(String[] args) {
        System.out.println("\nInicio do programa\n");

        TreinamentoInicioTemporada tit = new TreinamentoInicioTemporada();
        
        tit.TreinoDiario(); // metodo principal

        TreinamentoFimTemporada tif = new TreinamentoFimTemporada();

        tif.TreinoDiario(); // metodo principal

        System.out.println("\nFim do programa\n");
    }
}