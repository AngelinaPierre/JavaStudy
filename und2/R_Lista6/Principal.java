import java.io.*;
public class Principal
{
    public static void main(String[]args) throws java.io.IOException
    {
       BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
       String aux, sair;
       int cont=-1;
       byte r, w, e;
       Arquivo[] arq;
       int tamanho = 0;
       arq = new Arquivo[10];
        
       do
       {
            cont++;
            System.out.println("Entre com a Permissão para READ (0 = FALSE) ou (1 = TRUE)");
            aux = obj.readLine();
            r = Byte.valueOf(aux).byteValue();
        
            System.out.println("Entre com a Permissão para WRITE (0 = FALSE) ou (1 = TRUE)");
            aux = obj.readLine();
            w = Byte.valueOf(aux).byteValue();

            System.out.println("Entre com a Permissão para EXECUTE (0 = FALSE) ou (1 = TRUE)");
            aux = obj.readLine();
            e = Byte.valueOf(aux).byteValue();
        
            arq[cont] = new Arquivo(r,w,e);
            
            System.out.println("Entrar com outro Arquivo? (S)im ou (N)ão: ");
            sair= obj.readLine();
                
       }while (sair.equals("N") == false && sair.equals("n") == false);
       System.out.println("******************************************************");
       System.out.println("O arquivo tem permissões:   READ      WRITE      EXEC");
       int j = 1;
       for(int k = 0;k <= cont;k++)
       {
            System.out.println("Arquivo "+j+"                     " +arq[k].read+ "         " +arq[k].write+ "         " +arq[k].exec);
            j++;
       }
       System.out.println("******************************************************");
    }
}




