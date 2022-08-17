public class Data{

    private int dia, mes, ano;

    public Data(byte d, byte m, short a){
        // initialise instance variables
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    //An example of a method - replace this comment with your own
    
    public void setDia(int d){
        this.dia = d;
    }
    public void setMes(int m){
        this.mes = m;
    }
    public void setAno(int a){
        this.ano = a;
    }
    public int getDia(){
        return dia;
    }
    public int getMes(){
        return mes;
    }
    public int getAno(){
        return ano;
    }
    public void showDate(){
        System.out.println("Data = " + dia + "/" + mes + "/" + ano);
    }
}

