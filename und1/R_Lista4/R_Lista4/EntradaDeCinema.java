public class EntradaDeCinema
{
    private Data dataDoFilme;
    private float horario;
    private int sala;
    private float valor;

    public EntradaDeCinema(Data dataDoFilme, float horario, int sala, float valor)
    {
        this.dataDoFilme = dataDoFilme;
        this.horario = horario;
        this.sala = sala;
        this.valor = valor;
    }
    
    public void calculaDesconto(Data dataNascimento)
    {
        if((dataDoFilme.getAno()-dataNascimento.getAno())<=12)
        {
            valor = valor/2;
        }
    }
    
    public void calculaDesconto(Data dataNascimento, int numCarteira)
    {   int idade = dataDoFilme.getAno()-dataNascimento.getAno();
        if ((idade > 12)&& (idade <= 15))
        {
            valor = valor - ((40*valor)/100);
        }
        else if ((idade >= 16) && (idade < 20))
        {
            valor = valor - ((30*valor)/100);
        }
        else if (idade >=20 )
        {
            valor = valor - ((20*valor)/100);
        }
    }
    
    public void calculaDescontoHorario()
    {
        if(horario<16)
        {
            valor = valor - ((valor*10)/100);
        }
    }
    
    public void imprimeIngresso()
    {
        System.out.println("Data do Filme: ");
        dataDoFilme.mostraData();
        System.out.println("\nHorario: "+horario+"\nSala: "+sala+"\nValor: "+valor);
    }
}
    
        