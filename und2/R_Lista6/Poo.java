import java.io.*;

class Poo
{     public static void main(String args[])  throws java.io.IOException
      {   String nome, telefone, endereco, cpf, sIdentidade, sIdade, sMatricula, sNota1, sNota2;
          String sNota3, sTamanho, sHoras, sHorasAtendimento, sHorasPesquisa;
          int idade, identidade, cont, tamanho, horas, horasAtendimento, horasPesquisa, matricula;
          float nota1, nota2, nota3;
          boolean achou;
          char op, sair;
          Pessoa[] vetPessoa;
          Aluno[] vetAluno;
          UNIFACS[] vetUNIFACS;
          UFBA[] vetUFBA;
          BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
          System.out.println("O cadastramento sera de (P)essoas - (A)lunos - Professores UNI(F)ACS ou (U)FBA? ");
          op = (char)System.in.read();
          in.readLine();
          System.out.println("Quantos ítens serão cadastrados? ");
          sTamanho=in.readLine();
          tamanho=Integer.valueOf(sTamanho).intValue();
          vetPessoa = new Pessoa[tamanho];
          vetAluno = new Aluno[tamanho];
          vetUNIFACS = new UNIFACS[tamanho];
          vetUFBA = new UFBA[tamanho];
          for (cont=0; cont < tamanho; cont++)
          {  System.out.println("***********************************");
             System.out.println("Entre com o nome : ");
             nome = in.readLine();
             System.out.println("Entre com o Telefone : ");
             telefone = in.readLine();
             System.out.println("Entre com o Endereco : ");
             endereco = in.readLine();
             System.out.println("Entre com o CPF :");
             cpf = in.readLine();
             System.out.println("Entre com a Identidade :");
             sIdentidade = in.readLine();
             identidade = Integer.valueOf(sIdentidade).intValue();
             System.out.println("Entre com a Idade :");
             sIdade = in.readLine();
             idade = Integer.valueOf(sIdade).intValue();
             if ((op == 'P') || (op == 'p'))
             {  vetPessoa[cont]=new Pessoa(nome,telefone,endereco,cpf,identidade,idade);
             }    
             if ((op == 'A') || (op == 'a'))
             {  
                System.out.println("Entre com a Matrícula: ");
                sMatricula = in.readLine();
                matricula = Integer.valueOf(sMatricula).intValue();
                System.out.println("Entre com a Primeira Nota :");
                sNota1 = in.readLine();
                nota1 = Integer.valueOf(sNota1).intValue(); 
                System.out.println("Entre com a Segunda Nota :");
                sNota2 = in.readLine();
                nota2 = Integer.valueOf(sNota2).intValue(); 
                System.out.println("Entre com a Terceira Nota :");
                sNota3 = in.readLine();
                nota3 = Integer.valueOf(sNota3).intValue(); 
                vetAluno[cont]=new Aluno(nome,telefone,endereco,cpf,identidade,idade,matricula, nota1,nota2,nota3);
                vetAluno[cont].notaAluno.calculaMedia();
             }
             if ((op == 'F') || (op == 'f'))
             {  System.out.println("Entre com o número de horas aula :");
                sHoras = in.readLine();
                horas = Integer.valueOf(sHoras).intValue(); 
                System.out.println("Entre com o número de horas de pesquisa :");
                sHorasPesquisa = in.readLine();
                horasPesquisa = Integer.valueOf(sHorasPesquisa).intValue(); 
                vetUNIFACS[cont] = new UNIFACS(nome,telefone,endereco,cpf,identidade,idade,horas,horasPesquisa);
             }
             if ((op == 'U') || (op == 'u'))
             {  System.out.println("Entre com o número de horas aula :");
                sHoras = in.readLine();
                horas = Integer.valueOf(sHoras).intValue(); 
                System.out.println("Entre com o numero de horas de atendimento :");
                sHorasAtendimento = in.readLine();
                horasAtendimento = Integer.valueOf(sHorasAtendimento).intValue(); 
                vetUFBA[cont] = new UFBA(nome,telefone,endereco,cpf,identidade,idade,horas,horasAtendimento);
             }  
          }
          do
          {  achou=false;  
             System.out.println("======================================");
             System.out.println("Entre com o nome a procurar :");
             nome = in.readLine();
             if  ((op == 'P') || (op == 'p'))
             {  for (cont=0; cont < tamanho; cont++)
                {  
                  if (nome.equals(vetPessoa[cont].getNome()))
                  {  System.out.println("******  A pessoa eh : *******");
                     vetPessoa[cont].imprime(vetPessoa[cont]); 
                     achou=true;
                  }
                }
             }
             if ((op == 'A') || (op == 'a'))
             {  for (cont=0; cont < tamanho; cont++)
                { 
                  if (nome.equals(vetAluno[cont].getNome()))
                  {  System.out.println("****** O aluno eh : *******");
                     vetAluno[cont].imprime(vetAluno[cont]);
                     System.out.println("Primeira nota :"+vetAluno[cont].notaAluno.getNota1());
                     System.out.println("Segunda nota :"+vetAluno[cont].notaAluno.getNota2());
                     System.out.println("Terceira nota :"+vetAluno[cont].notaAluno.getNota3());
                     System.out.println("Média :"+vetAluno[cont].notaAluno.getMedia());
                     achou=true;
                  }
                }
             }  
             if ((op == 'F') || (op == 'f'))
             {  for (cont=0; cont < tamanho; cont++)
                {  
                   System.out.println("***"+ cont); 
                   if (nome.equals(vetUNIFACS[cont].nome))
                   { System.out.println("****** O Professor eh : *******");
                     vetUNIFACS[cont].imprime(vetUNIFACS[cont]);
                     System.out.println("Horas aulas :"+vetUNIFACS[cont].getHoras());
                     System.out.println("Horas Pesquisa :"+vetUNIFACS[cont].getHorasPesquisa());
                     System.out.println("Salario : ");
                     vetUNIFACS[cont].calculoSalario();
                     achou=true;
                   }
                } 
             }
             if ((op == 'U') || (op == 'u'))
             {  for (cont=0; cont < tamanho; cont++)
                { 
                   if (nome.equals(vetUFBA[cont].getNome()))
                   { System.out.println("****** O Professor eh : *******");
                     vetUFBA[cont].imprime(vetUFBA[cont]);
                     System.out.println("Horas aulas :"+vetUFBA[cont].getHoras());
                     System.out.println("Horas Atendimento :"+vetUFBA[cont].getHorasAtendimento());
                     System.out.println("Salario : ");
                     vetUFBA[cont].calculoSalario();
                     achou=true;
                   }
                }
             }
             if (achou == false)
             {  System.out.println("A informação procurada não foi encontrada");
             } 
             System.out.println("======================================");
             System.out.println("Deseja fazer outra pesquisa (S)im ou (N)ao ? ");
             sair = (char)System.in.read();
             System.out.println("*** Sair = "+sair);
             in.readLine();
             System.out.println("*** Sair = "+sair);
          }while ((sair != 'N') || (sair != 'n'));
      }
}




