class Data   
{   
    byte dia, mes;  
    short ano;
    
    public Data(byte dia, byte mes, short ano)
    {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    public void imprimirData()
    {
       System.out.println(dia+"/"+mes+"/"+ano);
    }   
}
