 import java.util.Scanner;

public class criaFuncionario
{
    
   public static void main(String args[])
   {
       Scanner ler = new Scanner(System.in);
       String cgc, nome;
       int qtd, idade, totalVota=0, totalNaoVota=0, totalFacultativo=0;
       Empresa objEmp;
       Pessoa objPessoa;
       Pessoa vota[], naoVota[], facultativo[];
       System.out.println("Informe o CGC da empresa : ");
       cgc = ler.nextLine();
       System.out.println("Informe a quantidade de funcionários da empresa : ");
       qtd = ler.nextInt();
       objEmp = new Empresa(cgc, qtd);
       vota = new Pessoa[qtd];
       naoVota = new Pessoa[qtd];
       facultativo = new Pessoa[qtd];
       for (int i=0; i < qtd; i++)
       {
          System.out.println("Informe o nome do funcionário : ");
          ler.nextLine();
          nome = ler.nextLine();
          System.out.println("Informe a idade do funcionário : ");
          idade = ler.nextInt();
          objPessoa = new Pessoa(nome,idade);
          objEmp.funcionario[i] = objPessoa;
          objEmp.calculoDeVotantes(objPessoa);
       }
       
       for (int i=0; i < qtd; i++)
       {  if (objEmp.funcionario[i].situacao == "Não Vota")
          {
              naoVota[totalNaoVota] = objEmp.funcionario[i];
              totalNaoVota++;
          }
          else
          {
              if (objEmp.funcionario[i].situacao == "Voto Obrigatório")
              {
                 vota[totalVota] = objEmp.funcionario[i];
                 totalVota++;
              }
              else
              {
                 facultativo[totalFacultativo] = objEmp.funcionario[i];
                 totalFacultativo++;
              }
          }
       }
       
       System.out.println("Voto Obrigatório");
       for (int i=0; i < totalVota; i++)
       {
           System.out.println("Nome = "+vota[i].nome+ " Idade = "+vota[i].idade);
       }
       
       System.out.println("Voto Facultativo");
       for (int i=0; i < totalFacultativo; i++)
       {
           System.out.println("Nome = "+facultativo[i].nome+ " Idade = "+facultativo[i].idade);
       }
       
       System.out.println("Não Votam");
       for (int i=0; i < totalNaoVota; i++)
       {
           System.out.println("Nome = "+naoVota[i].nome+ " Idade = "+naoVota[i].idade);
       }
   }
}
