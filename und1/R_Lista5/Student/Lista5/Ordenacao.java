import java.io.*;
    
public class Ordenacao{
    public static void main(String args[]) throws java.io.IOException{
        int[] vet;
        int i, j, tamanho, aux;
        String s_n;
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entre com o tamanho do vetor:");
        s_n = kb.readLine();
        tamanho = Integer.valueOf(s_n).intValue();
        vet = new int[tamanho];
        System.out.println("Entre com os numeros do vetor");
        for( i = 0; i < tamanho; i++){
            s_n = kb.readLine();
            vet[i] = Integer.valueOf(s_n).intValue();
        }
        // ordenação
        for(i = 0; i < tamanho; i++){
            for(j = i + 1; j< tamanho; j++){
                if(vet[i] < vet[j]){
                    aux = vet[i];
                    vet[i] = vet[j];
                    vet[j] = aux;
                }
            }
        }
        // imprimindo
        for(i = 0; i < tamanho; i++ ){
            System.out.println(vet[i]);
        }
    }
}