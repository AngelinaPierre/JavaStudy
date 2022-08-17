public class Data
{
    // instance variables - replace the example below with your own
    private byte dia, mes;
    private short ano;

    /**
     * Constructor for objects of class Data
     */
    public Data(byte d, byte m, short a){
        // initialise instance variables
        this.dia = d;
        this.mes = m;
        this.ano = a;
    }

    //An example of a method - replace this comment with your own
    
    public void setDia(byte d){
        this.dia = d;
    }
    public void setMes(byte m){
        this.mes = m;
    }
    public void setAno(short a){
        this.ano = a;
    }
    public byte getDia(){
        return dia;
    }
    public byte getMes(){
        return mes;
    }
    public short getAno(){
        return ano;
    }
    public void showDate(){
        System.out.println("Data = " + dia + "/" + mes + "/" + ano);
    }
}
