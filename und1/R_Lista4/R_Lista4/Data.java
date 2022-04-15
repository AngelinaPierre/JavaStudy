class Data
{	private byte dia,mes;
	private short ano;

	public Data(byte d,byte m,short a)
	{    if (dataEValida(d,m,a) == true)
	     { dia = d; 
	       mes = m; 
	       ano = a; 
             }
	     else
	     { dia = 0; 
	       mes = 0; 
	       ano=0;   
             }
	}

	boolean dataEValida(byte d,byte m,short a)
	{   if ((d>=1) && (d<=31) && (m>=1) && (m<=12))
	         return true;
	    else
	         return false;
	}
	
	boolean eIgual(Data outraDataSimples)
	{   if ((this.dia == outraDataSimples.dia) &&
	       ( this.mes == outraDataSimples.mes) &&
	       (this.ano == outraDataSimples.ano))
	             return true;
	    else
	            return false;
	}
	
	void mostraData()
	{    System.out.println(dia + "/" + mes + "/" + ano);
	}
	
	public short getAno()
	{
	    return ano;
	}
	
	public byte getMes()
	{
	    return mes;
	}
	
	public byte getDia()
	{
	    return dia;
	}
	
	public void setAno(short ano)
	{
	    this.ano = ano;    
	}   
	
	public void setMes(byte mes)
	{
	    this.mes = mes;    
	}  
	
	public void setDia(byte dia)
	{
	    this.dia = dia;    
	}
	
	public String retornaMes()
	{  String resultado=null;
	   switch(mes)
	   {
	       case 1: resultado = "Janeiro";
	               break;
	       case 2: resultado = "Fevereiro";
	               break;
	       case 3: resultado = "Março";
	               break;
	       case 4: resultado = "Abril";
	               break;
	       case 5: resultado = "Maio";
	               break;
	       case 6: resultado = "Junho";
	               break;
	       case 7: resultado = "Julho";
	               break;
	       case 8: resultado = "Agosto";
	               break;
	       case 9: resultado = "Setembro";
	               break;
	       case 10: resultado = "Outubro";
	                break;
	       case 11: resultado = "Novembro";
	                break;
	       case 12: resultado = "Dezembro";
	                break;
	   }
	   return resultado;
       }       
 }