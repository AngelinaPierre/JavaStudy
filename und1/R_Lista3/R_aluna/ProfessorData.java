public class ProfessorData
{
    // instance variables - replace the example below with your own
    private Data dataAdmissao;
    private int numRegistro;
    private String nomeProfessor, nomeDepartamento;

    /**
     * Constructor for objects of class Professor
     */
    public ProfessorData(String np,String nd, Data da,int numR){
        this.dataAdmissao = da;
        this.numRegistro = numR;
        this.nomeProfessor = np;
        this.nomeDepartamento = nd;
    }

    //setter and getters
    
    // metodos especificos
    public void showData(){
        System.out.println("Nome Professor = " + nomeProfessor);
        System.out.println("Nome Departamento = " + nomeDepartamento);
        System.out.println("Numero do Registro = " + numRegistro);
        dataAdmissao.showDate();
    }
    
}
