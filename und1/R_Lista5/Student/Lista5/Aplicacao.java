import java.io.*;

public class Aplicacao{
    public static void main(String[] args) throws java.io.IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in)); // teclado
        String aux; // conversao
        int numFunc, mat, dep;
        String name, funcao;
        float sal;
        // instanciando um objeto da classe funcionario e colocando seus valores como null
        Funcionario func = null;
        System.out.println("Entre com o numero de funcionarios");
        aux = kb.readLine();
        numFunc = Integer.valueOf(aux).intValue();
        // instanciando um objeto da classe SetorPessoal e passando o numero de funcionarios
        SetorPessoal RH = new SetorPessoal(numFunc);
        for(int i = 0; i < numFunc; i++){
            System.out.println("Entre com a matricula do funcionario: ");
            aux = kb.readLine();
            mat = Integer.valueOf(aux).intValue();
            System.out.println("Entre com o nome do funcionario: ");
            name = kb.readLine();
            System.out.println("Entre com o departamento do funcionario: ");
            aux = kb.readLine();
            dep = Integer.valueOf(aux).intValue();
            System.out.println("Entre com a função do funcionario: ");
            funcao = kb.readLine();
            System.out.println("Entre com o salario do funcionario: ");
            aux = kb.readLine();
            sal = Float.valueOf(aux).floatValue();
            
            // inicializando o funcionario com os valores adquiridos.
            func = new Funcionario(mat, dep, name, funcao, sal);
            // adicionando o funcionario ao vetor do objeto da classe de setorPessoal
            RH.addFunc(func);
        }
        RH.imprimeFolhaPagamento();
        System.out.println("O total da folha de pagamento é: " + RH.totalFolhaPagamento());
        System.out.println("O maior salario da folha e do funcionario = " + RH.maiorSalario());
        System.out.println("Entre com o numero do departamento que quer listar seus funcionarios");
        aux = kb.readLine();
        dep = Integer.valueOf(aux).intValue();
        RH.mostraFuncionarios(dep);
        System.out.println("Entre com a função que quer listar seus funcionarios:");
        funcao = kb.readLine();
        RH.mostraFuncao(funcao);
        RH.imprimeFolhaPorSalario();
        
    }
}