public class AppAutomovel
{
    public static void main(String args[]){
        // instancia de um objeto da classe automovel;
        Automovel objA = new Automovel("Fusca","verde",Automovel.movidoAAlcool);
        
        System.out.println(objA.toString());
        System.out.println(objA.quantoCusta());
        System.out.println(objA.quantasPrestacoes());
        
        // instancia de um objeto da classe AUTOMOVELBASICO
        AutomovelBasico objAB = new AutomovelBasico("COrsa","cinza",Automovel.movidoAGasolina,true,true,false);
        
        System.out.println(objAB.toString());
        System.out.println(objAB.quantoCusta());
        System.out.println(objAB.quantasPrestacoes());
    }
    // Observe que o metodo quantasPrestacoes() esta sendo acessado atraves ded um objeto da classe AUtomovelBasico. Isso so é
    // possivel porque a classe AUTOMOVELBASICO herda da classe AUTOMOVEL, assim todos os ATRIBUTOS e METODOS da CLASSE BASE
    // podem ser usados pela CLASSE DERIVADA.
}
