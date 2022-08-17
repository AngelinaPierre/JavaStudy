import java.io.*;

public class IntercalaVetores{
    public static void main(String args[]) throws java.io.IOException{
        int[] vet1, vet2, vet3;
        // var aux para conversão
        String aux;
        // objeto do teclado
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        // instanciando os vetores
        vet1 = new int[10];
        vet2 = new int[10];
        vet3 = new int[20];
        
        // Preenchendo vetores
        System.out.println("Informe 5 numeros para o vetor 2 em ordem crescente");
        // recebimento na variavel aux para conversão
        aux = kb.readLine();
        // colocando na primeira posição do vetor o valor convertido
        vet1[0] = Integer.valueOf(aux).intValue();
        // verificação para ordem crescente
        int  i = 1;
        while(i < 5){
            aux = kb.readLine();
            vet1[i] = Integer.valueOf(aux).intValue();
            if(vet1[i] > vet1[i-1]){
                i++;
            }else{
                System.out.println("O numero precisa ser maior que o anterior, digite novamente");
            }
        }
        System.out.println("Informe 5 numeros para o vetor 2 em ordem crescente");
        aux = kb.readLine();
        // colocando na primeira posição do vetor o valor convertido
        vet2[0] = Integer.valueOf(aux).intValue();
        // verificação para ordem crescente
        int j = 1;
        while(j<5){
            aux = kb.readLine();
            vet2[j] = Integer.valueOf(aux).intValue();
            if(vet2[j] < vet2[j-1]){
                j++;
            }else{
                System.out.println("O número precisa ser maior que o anterior, digite novamente");
            }
        }
        
        // intercalação
        int x = 0;
        for(i = 0; i< 5; i++){
            vet3[x] = vet1[i];
            x++;
            vet3[x] = vet2[i];
            x++;
        }
        
        // Imprimindo vetor intercalado
        System.out.println("*** Vetor Intercalado ***");
        for( x=0; x < 20; x++){
            System.out.println(vet3[x]);
        }
        
        
    }
}