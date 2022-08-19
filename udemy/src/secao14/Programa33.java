package src.secao14;
// interfaces - O que é e quando utilizar.
public class Programa33{
    public static void main(String[] args) {
        Ventilador vent = new Ventilador();

        System.out.println("A marca deste ventilador é: " + vent.MARCA);
        vent.desligar(); // não deve imprimir a mensagem

        vent.ligar(); // deve imprimir a mensagem

        vent.desligar(); // deve imprimir a mensagem.
    }
}