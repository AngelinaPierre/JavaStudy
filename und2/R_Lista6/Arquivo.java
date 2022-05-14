public class Arquivo
{
    byte read, write, exec;
    public Arquivo(byte r, byte w, byte e)
    {
        read = r;
        write = w;
        exec = e;
    }
    
    public boolean isReadable()
    {
        boolean isread;
        if (read == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
    public boolean isWriteable()
    {
        if (write == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
   }
    
   public boolean isExecuteable()
   {
        if (exec == 1)
        {
            return true;
        }
        else
        {
            return false;
        }
   }
    
    public byte trocaRead()
    {
        if (read == 1)
        {
            read = 0;
        }
        else
        {
            read = 1;
        }
        return read;
    }
    
    public byte trocaWrite()
    {
        
        if (write == 1)
        {
            write = 0;
        }
        else
        {
            write = 1;
        }
        return write;
    }
    
    public byte trocaExecute()
    {
        
        if (exec == 1)
        {
            exec = 0;
        }
        else
        {
            exec = 1;
        }
        return exec;
    }
    
    public String mostraEstado()
    {
        String mostra = "";
        if (read == 1){
            mostra = "1";
        }
        else
        {
            mostra = "0";
        }
        
        if (write == 1)
        {
            mostra = mostra + "1";
        }
        else
        {
            mostra = mostra + "0";
        }
        
        if (exec == 1)
        {
            mostra = mostra + "1";
        }
        else
        {
            mostra = mostra + "0";
        }    
        return mostra;
    }
}