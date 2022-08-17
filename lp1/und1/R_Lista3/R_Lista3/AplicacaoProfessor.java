import java.io.*;  
class AplicacaoProfessor
{ public static void main(String args[])
      throws java.io.IOException  
  {   BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String nome, departamento, aux;
      int numero;
      byte dia,mes;
      short ano;
      
      Professor_5 Obj1=null, Obj2=null, Obj3=null;
    
      for(int i=1;i <=3; i++) 
      {   System.out.println("***** Informe os dados do Professor "+i+"******");
          System.out.println("Entre com o nome : ");
          nome = in.readLine(); 
          System.out.println("Entre com o departamento : ");
          departamento = in.readLine(); 
          System.out.println("Entre com o número : ");
          aux = in.readLine();
          numero = Integer.valueOf(aux).intValue();
          System.out.println("Entre com o dia da admissão : ");
          aux = in.readLine();
          dia = Byte.valueOf(aux).byteValue();
          System.out.println("Entre com o mês da admissão : ");
          aux = in.readLine();
          mes = Byte.valueOf(aux).byteValue();
          System.out.println("Entre com o ano da admissão : ");
          aux = in.readLine();
          ano = Short.valueOf(aux).shortValue();
          Data admissao = new Data(dia,mes,ano);
          if (i == 1)
          {
              Obj1 = new Professor_5(nome, departamento, numero, admissao);
          }  
          else if (i == 2)      
               {  
                   Obj2 = new Professor_5(nome, departamento, numero, admissao);
               }
               else if (i == 3)     
                    {  
                        Obj3 = new Professor_5(nome, departamento, numero, admissao); 
                    }
      }              
      System.out.println("*********** Dados do prof. 1 ****************");
      Obj1.imprimeProfessor();
      System.out.println("*********** Dados do prof. 2 ****************");
      Obj2.imprimeProfessor();
      System.out.println("*********** Dados do prof. 3 ****************");
      Obj3.imprimeProfessor();
  }    
}
