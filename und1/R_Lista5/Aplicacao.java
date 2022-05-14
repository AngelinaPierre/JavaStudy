import java.io.*;
class Aplicacao
{  public static void main(String arg[])
                                     throws java.io.IOException
    {  BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        String aux;
        int n, i;
        int matricula, departamento;
        String nome, funcao;
        float salario;
        Funcionario func = null;
        System.out.println("Entre com o numero de funcionarios");
        aux = obj.readLine();
        n = Integer.valueOf(aux).intValue();
        SetorPessoal recHumano = new SetorPessoal(n);
        for (i=0; i < n; i++)
        {    System.out.println("Entre com a matricula do funcionario : ");
              aux = obj.readLine();
              matricula = Integer.valueOf(aux).intValue();
              System.out.println("Entre com o nome do funcionario : ");
              nome = obj.readLine(); 
              System.out.println("Entre com o departamento do funcionario : ");
              aux = obj.readLine();
              departamento = Integer.valueOf(aux).intValue();
              System.out.println("Entre com a funcao do funcionario : ");
              funcao = obj.readLine();
              System.out.println("Entre com o salario do funcionario : ");
              aux = obj.readLine();
              salario = Float.valueOf(aux).floatValue();
              func = new Funcionario(matricula,departamento,nome,funcao,salario);
              recHumano.adicionaFuncinario(func);
       }
        recHumano.imprimeFolha();
        System.out.println("O total da folha de pagamentos e = "+recHumano.totalizaFolha());
        System.out.println("O maior salario da folha e do funcionario = "+recHumano.maiorSalario());
        System.out.println("Entre com o numero do departamento que quer listar seus funcionarios");
        aux = obj.readLine();
        departamento = Integer.valueOf(aux).intValue();  
        recHumano.mostraFuncionarios(departamento);
        System.out.println("Entre com a função que quer listar seus funcionarios");
        funcao = obj.readLine();
        recHumano.mostraFuncao(funcao);
        recHumano.imprimeFolhaPorSalario();
   }
}