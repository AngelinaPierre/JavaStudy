public class SetorPessoal{
    // atributos
    Funcionario[] vet;
    // variavel para ser usada como indice do vetor de funcionarios
    int total;
    
    // construtor
    public SetorPessoal(int numF){
        // instanciando vetor de funcionarios com numero passado como parametro
        vet = new Funcionario[numF];
        total = 0;
    }
    
    // um método para adicionar funcionários no vetor definido na classe;
    public void addFunc(Funcionario obj){
        // verificação se o vetor nao estiver cheio.
        if(total < vet.length){
            vet[total] = obj;
            total++;
        }
    }
    
    //um método que possa imprimir a folha de pagamento informando o nome dos funcionários 
    // e o seus respectivos salários.
    public void imprimeFolhaPagamento(){
        System.out.println("************* Folha de Pagamentos *******");
        for(int i = 0 ; i < total; i++){
            System.out.println("[Nome: " + vet[i].getNome() + "] Salario: " + vet[i].getSalario() + "]");
        }
    }
    
    // um método que possa retornar o valor total da folha de pagamento
    public float totalFolhaPagamento(){
        float soma = 0;
        for(int i = 0; i < total; i++){
            soma = soma + vet[i].getSalario();
        }
        return soma;
    }
    
    // um método que possa retornar o nome do funcionário que recebe o maior salário
    public String maiorSalario(){
        // criação de variaveis para guardar os valores
        String maiorNome="";
        float maiorSalario = 0;
        for(int i = 0; i < total; i++){
            if( maiorSalario < vet[i].getSalario()){
                maiorSalario = vet[i].getSalario();
                maiorNome = vet[i].getNome();
            }
        }
        return maiorNome;
    }
    
    // um método que possa receber como parâmetro o número de um determinado 
    //departamento e mostrar o nome e a função de todos os funcionários daquele departamento.
    public void mostraFuncionarios(int depF){
        System.out.println("*** Funcionários do departamento" + depF + " ***");
        for(int i = 0; i < total; i++){
            if(vet[i].getDepartamento() == depF){
                System.out.println(vet[i].getNome());
            }
        }
    }
    
    //um método que possa receber como parâmetro o nome de uma determinada 
    //função e posteriormente imprimir o nome de todas as pessoas que exercem essa função.    
    public void mostraFuncao(String funcF){
        System.out.println("*** Funcionários que Exercem a Funcção " + funcF + " ***");
        for(int i = 0; i < total; i++){
            if(vet[i].getFuncao().equals(funcF)){
                System.out.println(vet[i].getNome());
            }
        }
    }
    
    // um método que possa imprimir a folha de pagamento informando o nome dos 
    // funcionários e o seus respectivos salários em ordem crescente de salário.
    // Dica: É necessário criar um outro vetor que conterá o vetor original e posteriormente ordena-lo.
    public void imprimeFolhaPorSalario(){
        Funcionario[] vetAux = vet;
        Funcionario aux;
        // loop de ordenação
        for(int i = 0; i < total; i++){
            for(int k = i + 1; k < total; k++){
                if(vetAux[i].getSalario() > vetAux[k].getSalario()){
                    aux = vetAux[i];
                    vetAux[i] = vetAux[k];
                    vetAux[k] = aux;
                }
            }
        }
        System.out.println("******** Folha de Pagamentos Ordenada Por Salario *******");
        for(int i = 0; i < total; i++){
            System.out.println("[Nome: " + vetAux[i].getNome() + "] Salario: " + vetAux[i].getSalario() + "]");
        }
    }
    

}