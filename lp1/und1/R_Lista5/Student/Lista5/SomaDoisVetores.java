import java.io.*;
public class SomaDoisVetores{
    public static void main(String args []) throws java.io.IOException{
        // Declarando vetores
        int[] vetA, vetB, vetC;
        // variavel para utilização nos loops
        int i;
        // variavel auxiliar para conversão
        String aux;
        // criando instanciando um objeto do keyboard
        BufferedReader kb = new BufferedReader( new InputStreamReader(System.in));
        // Instanciando os vetores
        vetA = new int[8];
        vetB = new int[8];
        vetC = new int[8];
        // Preenchendo os vetores com valores
        System.out.println("Informe 8 numeros para o vetor A");
        for(i=0; i< 8; i++){
            // colocando entrada do teclado na variavel auxiliar
            aux = kb.readLine();
            // colocando valor aux convertido em int no vetor
            vetA[i] = Integer.valueOf(aux).intValue();
        }
        
        System.out.println("Informe 8 numeros para o vetor B");
        // zerando o valor da variavel i, alterada no escopo do loop anterior
        i = 0;
        while(i < 8){
            // colocando entrada do teclado na variavel auxiliar
            aux = kb.readLine();
            // colocando valor aux convertido em int no vetor
            vetB[i] = Integer.valueOf(aux).intValue();
            i++;
        }
        // zerando o valor da variavel i, alterada no escopo do loop anterior
        i=0;
        //soma dos vetores
        do{
            vetC[i] = vetA[i] + vetB[i];
            i++;
        }while(i<8);
        
        // Imprimindo vetor com a soma
        System.out.println("O resultado da soma dos vetores é:");
        for (i=0; i< 8; i++){
            System.out.println(vetC[i]);
        }
    }
}
