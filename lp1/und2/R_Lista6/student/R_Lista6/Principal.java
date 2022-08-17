import java.io.*;

public class Principal{
    public static void main(String[] args) throws java.io.IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        String aux, sair;
        int cont = 1;
        byte r,w,e;
        Arquivo[] arq;
        int tamanho = 0;
        arq = new Arquivo[10];

        do{
            cont++;
            System.out.println("Entre com a Permissão para Read ( 0 = FALSE) ou (1 = TRUE)");
            aux = kb.readLine();
            r = Byte.valueOf(aux).byteValue();

            System.out.println("Entre com a Permissão para WRITE (0 = FALSE) ou (1 = TRUE)");
            
        }

    }
}