public class Senai extends Professor {
    int horasPesquisa;

    public Senai(String n, String tel, String end, String cpf, int ident, int id, int horas, int hp){
        super(n,tel,end,cpf,ident,id,horas);
        this.horasPesquisa = hp;
    }

    public void calculoSalario(){
        salario = (horasPesquisa * 500) + (horas * 600);
        System.out.println(getSalario());
    }
    public int getHorasPesquisa(){
        return horasPesquisa;
    }
    public void setHorasPesquisa(int h){
        horasPesquisa = h;
    }
}
