public class Cliente
{
	private int nConta;
	private String nomeCliente;
	private float saldo;
	private byte tipo;

	public Cliente(int nConta, String nomeCliente, float saldo, byte tipo) 
	{ 
		this.nConta = nConta;
		this.nomeCliente = nomeCliente;
		this.saldo = saldo;
		this.tipo = tipo;
	}
		
	public void setnConta(int nConta)
	{  this.nConta = nConta;
	}    
	  
	public void setnomeCliente(String nomeCliente)
	{   this.nomeCliente = nomeCliente;
	}
	  
	public void setsaldo(float saldo)
	{   this.saldo = saldo;
	}
	  
	public void settipo(byte tipo)
	{   this.tipo = tipo;
	}    
	  
	public int getnConta()
	{  return nConta;
	}    
	  
	public String getnomeCliente()
	{   return nomeCliente;
	}
	  
	public float getsaldo()
	{   return saldo;
	}
	  
	public byte gettipo()
	{   return tipo;
	}      
}