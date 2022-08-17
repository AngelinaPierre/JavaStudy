package src.secao11;

public class Conta{

    // atributo
    private int numero_conta;
    private float saldo_conta;
    private float limite_conta; // como o limite não pode mexer, não precisamos criar um metodo para ele.
    private Cliente cliente_conta; // atributo do tipo cliente 

    // construtor com parametros
    public Conta(int numero, float saldo, float limite, Cliente cliente){
        this.numero_conta = numero;
        // como ja criamos um metodo que retorne o saldo + limite, não precisamos desta linha mais.
        // this.saldo_conta = saldo + limite;
        this.saldo_conta = saldo;
        this.limite_conta = limite;
        this.cliente_conta = cliente;
    }

    // metodos 

    // saque
    // forma 3
    public void sacar(float value){
        if(value <=this.saldo_conta){
            this.saldo_conta = this.saldo_conta - value;
        }else if(value <= (this.saldo_conta + this.limite_conta)){
            // calculo do valor excedente do saque
            float temp = this.saldo_conta - value; // 100 - 200 = -100
            if(temp < 0){
                this.saldo_conta = 0;
            }
            temp = this.limite_conta + temp;
            this.limite_conta = temp;
        }else{
            System.out.println("Saldo insuficiente!");
        }
    }
    // forma p2
    // void sacar (float value){
    //     if(value <= this.saldo_conta + this.limite_conta){
    //         System.out.println("Saldo Atual: " + this.saldo_conta);
    //         this.saldo_conta = (this.saldo_conta + this.limite_conta) - value;
    //         System.out.println("Saque: " + value);
    //     }else{
    //         System.out.println("Saldo Insuficiente");
    //     }

    // }
    // forma inicial p1
    // void sacar(float value){
    //     System.out.println("Saldo Atual: " + this.saldo_conta);
    //     this.saldo_conta = (this.saldo_conta + this.limite_conta) - value;
    //     System.out.println("Saque: " + value);
    // }

    // deposito
    void depositar(float value){
        System.out.println("Saldo Atual: " + this.saldo_conta);

        this.saldo_conta = this.saldo_conta + value;
        System.out.println("Deposito:" + value);
    }
  
    // getter para o atributo saldo_conta
    public float getSaldoConta(){
        return this.saldo_conta + this.limite_conta; 
    }
  
} 