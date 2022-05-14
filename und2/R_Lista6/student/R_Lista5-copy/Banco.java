public class Banco{
    ContaCorrente contas[]; // vetor/lista de contas
    int total; // indice de controle do vetor/lista de constas
    
    // construtor
    public Banco(){
        // instanciando e dando um tamanho ao vetor/lista de contas
        contas = new ContaCorrente[10];
        total = 0;
    }
    
    public void criaConta(int n, int esp, float s, float lim){
        // declarando, instanciando e inicializando um objeto da classe ContaCorrente com os valores recibidos
        ContaCorrente objConta = new ContaCorrente(n,esp,s,lim);
        // adicionando a nova conta no veotr/lista de contas
        contas[total] = objConta;
        total++;
    }
    
    public int pesquisa(int num_conta){
        int indice = -1, i = 0;
        while((i < total) && (indice == -1)){
            if(contas[i].numero == num_conta){
                indice = i;
            }
            i++;
        }
        return indice;
    }
    
    public String excluiConta(int num_conta){
        int indice = pesquisa(num_conta);
        if(indice == -1){
            return "Conta inexistente";
        }else{
            while(indice < total){
                contas[indice] = contas[indice + 1];
                indice++;
            }
            total--;
            return "Conta Removida com sucesso";
        }
    }
    
    public String deposito(float v, int num_conta){
        int indice = pesquisa(num_conta);
        if(indice == -1){
            return "Conta Inexistente";
        }else{
            contas[indice].saldo = contas[indice].saldo + v;
            contas[indice].movimento("Deposito",v,"Credito");
            return "Deposito com sucesso";
        }
    }
    
    public String saque(float v, int nc){
        int indice = pesquisa(nc);
        float saldoTotal = 0;
        if(nc == -1){
            return "Conta Inexistente";
        }else{
            saldoTotal = contas[indice].limite + contas[indice].saldo;
            if(v < saldoTotal){
                contas[indice].saldo = contas[indice].saldo - v;
                contas[indice].movimento("Saque",v,"Debito");
                return "Saque com sucesso";
            }else{
                return "Limite indisponivel";
            }
        }
    }
    
    public void extrato(int nc){
        int indice = pesquisa(nc);
        if(indice == -1){
            System.out.println("Conta inexistente");
        }else{
            System.out.println("********** EXTRATO **********");
            System.out.println("Numero da conta = " + contas[indice].numero);
            System.out.println("Saldo Total = " + contas[indice].saldo);
            contas[indice].emiteExtrato(contas[indice]);
        }
    }
    
    public String transferencia(int ncO, int ncD, float v){
        int indiceO = pesquisa(ncO);
        int indiceD = pesquisa(ncD);
        float saldoTotal = 0;
        if((indiceO == -1) || (indiceD == -1)){
            return "Conta Origem ou Destino inexistente";
        }else{
            saldoTotal = contas[indiceO].limite + contas[indiceO].saldo;
            if(v < saldoTotal){
                contas[indiceO].saldo = contas[indiceO].saldo - v;
                contas[indiceO].movimento("Transferencia",v,"Debito");
                contas[indiceD].saldo = contas[indiceD].saldo + v;
                contas[indiceD].movimento("Transferencia",v,"Creditor");
                return "Transferencia com sucesso";
            }else{
                return "Limite indisponivel";
            }
        }
    }
}






























