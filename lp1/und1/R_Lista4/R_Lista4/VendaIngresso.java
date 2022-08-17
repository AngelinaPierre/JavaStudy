import java.io.*;

class VendaIngresso
{    public static void main(String args[]) throws java.io.IOException 
     {  String aux;
        float horario, valor;
        int sala, estudante;
        byte dia, mes;
        short ano;
        Data dataDaSessao, dataDeNascimento;
        EntradaDeCinema objEntrada;
        
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
        
    System.out.println("****  Informe os dados da sessão ****");
    
    System.out.println("Informe o dia da sessão : ");
    aux=in.readLine();
    dia=Byte.valueOf(aux).byteValue();
    System.out.println("Informe o mês da sessão : ");
    aux=in.readLine();
    mes=Byte.valueOf(aux).byteValue();
    System.out.println("Informe o ano da sessão : ");
    aux=in.readLine();
    ano=Short.valueOf(aux).shortValue();
    
    dataDaSessao = new Data(dia,mes,ano);
    

    System.out.println("Informe o horário da sessão : ");
    aux=in.readLine();
    horario = Float.valueOf(aux).floatValue();
    System.out.println("Informe o valor da sessão : ");
    aux=in.readLine();
    valor = Float.valueOf(aux).floatValue();
    System.out.println("Informe a sala da sessão : ");
    aux=in.readLine();
    sala = Integer.valueOf(aux).intValue();
    
    System.out.println("Informe o dia do nascimento : ");
    aux=in.readLine();
    dia=Byte.valueOf(aux).byteValue();
    System.out.println("Informe o mês do nascimento : ");
    aux=in.readLine();
    mes=Byte.valueOf(aux).byteValue();
    System.out.println("Informe o ano do nascimento : ");
    aux=in.readLine();
    ano=Short.valueOf(aux).shortValue();
    
    dataDeNascimento = new Data(dia,mes,ano);
    
    System.out.println("Informe o numero da carteira de estudante ou digite 0 caso não tenha: ");
    aux=in.readLine();
    estudante = Integer.valueOf(aux).intValue();
    
    objEntrada = new EntradaDeCinema(dataDaSessao, horario, sala, valor);
    
    if(estudante != 0)
    {  objEntrada.calculaDesconto(dataDeNascimento, estudante);  
    }
    else
    {  objEntrada.calculaDesconto(dataDeNascimento);
    }    
    
    objEntrada.calculaDescontoHorario();
    
    objEntrada.imprimeIngresso();
    }
}     