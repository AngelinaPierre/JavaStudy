import java.io.*;
class Main 
{
   public static void main (String arg[])
       throws java.io.IOException
   {
        BufferedReader obj = new BufferedReader (new InputStreamReader (System.in));
        
        String aux;
        int ttlCliente, i, opc;
        int nConta;
        String nomeCliente;
        float saldo;
        byte tipo;
            
        Cliente a = null;
        System.out.println("quantidade de clientes:");
        aux = obj.readLine();
        ttlCliente = Integer.valueOf (aux).intValue();
        ContaBancaria lstCliente = new ContaBancaria(ttlCliente);
        for(i = 0;ttlCliente > i; i++) 
        {
            System.out.println("Nome:");
            nomeCliente = obj.readLine();
            
            System.out.println("Numero da Conta:");
            aux = obj.readLine();
            nConta = Integer.valueOf (aux).intValue();
            
            System.out.println("Saldo:");
            aux = obj.readLine();
            saldo = Float.valueOf(aux).floatValue();
            
            System.out.println("Tipo:");
            aux = obj.readLine();
            tipo = Integer.valueOf (aux).byteValue();
        
            a = new Cliente(nConta, nomeCliente, saldo, tipo);
            lstCliente.Adcliente(a);
        }
        
        do
        {
            System.out.println("\n\n__ Menu __");
            System.out.println("\n1 - Deposito\n");
            System.out.println("2 - Saque\n");
            System.out.println("3 - Extrato Bancario\n");
            System.out.println("0 - Encerrar programa\n");
    
            aux = obj.readLine();
            opc = Integer.valueOf (aux).intValue();
    
            switch (opc)
            {
                case 1:
                    float depositado;
                    int ncOnta;
                    System.out.println("Digite sua conta");
                    aux = obj.readLine();
                    ncOnta = Integer.valueOf (aux).intValue();
                    System.out.println("Digite o valor do deposito ");
                    aux = obj.readLine();
                    depositado = Float.valueOf (aux).floatValue();
                    lstCliente.Deposito(ncOnta, depositado);
                break;
                case 2:
                    float saldocaluro;
                    int Nconta;
                    System.out.println("Digite sua conta");
                    aux = obj.readLine();
                    Nconta = Integer.valueOf (aux).intValue();
                    System.out.println("Digite o valor do saque ");
                    aux = obj.readLine();
                    saldocaluro = Float.valueOf (aux).floatValue();
                    lstCliente.Saque(Nconta, saldocaluro);
                break;
                case 3:
                    int nconta;
                    System.out.println("Digite sua conta");
                    aux = obj.readLine();
                    nconta = Integer.valueOf (aux).intValue();
                    lstCliente.ExtratoBancario(nconta);
                break;
    
            }
        }while (opc!=0);
   }
}