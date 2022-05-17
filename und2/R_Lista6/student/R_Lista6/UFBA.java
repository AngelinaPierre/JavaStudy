public class UFBA extends Professor {
    int horasAtendimento;

    // constructor
    public UFBA(String nome, String tel, String end, String cpf,int ident, int id, int h, int horasAtendimento){
        super(nome, tel, end, cpf, ident, id, h);
        this.horasAtendimento = horasAtendimento;
    }

    public void calculoSalario(){
        salario = (horasAtendimento * 400) + (horas * 600);
        System.out.println(getSalario());
    }
    public int getHorasAtendimento(){
        return horasAtendimento;
    }
    public void setHorasAtendimento(int h){
        horasAtendimento = h;
    }
}
