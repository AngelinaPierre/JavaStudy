public class ConcessionariaDeAutomoveis
{
    public static void imprime(Automovel a){
        System.out.println("Dados do automovel escolhido: ");
        System.out.println(a.toString());
        System.out.println("Valor : R$" + a.quantoCusta());
        System.out.println(a.quantasPrestacoes() + "prestações de " + (a.quantoCusta()/a.quantasPrestacoes()));
        
    }
    public static void main(String args[]){
        
        Automovel objA1 = new Automovel("Fiat","bege",Automovel.movidoAAlcool);
        AutomovelBasico objA2 = new AutomovelBasico("Corsa","cinza",Automovel.movidoAGasolina);
        
        // O metodo IMPRIME() recebe um objeto da classe Automovel como parametro. Observe que, nesse exemplo
        // chamamos o metodo passando (OBJA1) e (OBJA2). ou seja, objetos de classes diferentes mas da mesma
        // HIERARQUIA DE CLASSES, caracterizando dessa forma a utilização de polimorfismo.
        imprime(objA1);
        imprime(objA2);
    }
    
}
