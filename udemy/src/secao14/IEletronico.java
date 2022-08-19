package src.secao14;

/*
Interface para servir de contrato para produtos eletronicos. Todo produto eletronico que implementar esta interface OBRIGATORIAMENTE deverão implementar os métodos abstratos.
*/
public interface IEletronico{
    public String MARCA = "Geek";

    public void ligar();

    public void desligar();
}