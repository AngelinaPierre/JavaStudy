public class Professor
{
    // instance variables - replace the example below with your own
    private byte da,ma;
    private short aa;
    private int numRegistro;
    private String nomeProfessor, nomeDepartamento;

    /**
     * Constructor for objects of class Professor
     */
    public Professor(byte dia, byte mes, short ano,int numR, String np,String nd){
        this.da = dia;
        this.ma = mes;
        this.aa = ano;
        this.numRegistro = numR;
        this.nomeProfessor = np;
        this.nomeDepartamento = nd;
    }

    //setter and getters
    
    // metodos especificos
    private void showData(){
        System.out.println("Nome Professor = " + nomeProfessor);
        System.out.println("Nome Departamento = " + nomeDepartamento);
        System.out.println("Numero do Registro = " + numRegistro);
        System.out.println("data Admissao = " );
    }
    
}
