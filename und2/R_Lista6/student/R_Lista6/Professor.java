abstract class Professor extends Pessoa{
    float salario;
    int horas;
    
    // constructor
    public Professor(String nome, String tel, String end, String cpf, int ident, int idade, int horas){
        super(nome, tel, end, cpf, ident, idade);
        this.horas = horas;
    }

    abstract void calculoSalario();

    public float getSalario(){
        return salario;
    }

    public int getHoras(){
        return horas;
    }

    public void setSalario(float sal){
        this.salario = sal;
    }

    public void getHoras(int h){
        this.horas = h;
    }

    public void mostraSalario(){
        System.out.println(salario);
    }

}
