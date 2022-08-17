import java.io.*;

public class Soma{
    public static void main(String args[]) throws java.io.IOException{
        // declarando vetor
        int[] vet;
        // variavel para loop
        int i = 0;
        int soma = 0;
        // variavel auxiliar conversão
        String aux;
        // objeto do teclado
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        
        // inicialização do vetor
        vet = new int[8];        
        
        // Entrada de dados
        System.out.println("Informe 8 numeros para o vetor");
        // loop para inserir no vetor
        while(i<8){
            // recebimento do valor(string) na variavel aux
            aux = kb.readLine();
            // inserção do valor no vetor convertido para int
            vet[i] = Integer.valueOf(aux).intValue();
            i++;
        }
        // Soma dos valores
        i = 0;
        while(i<8){
            soma = soma + vet[i];
            i++;
        }
        // valor total
        System.out.println("A soma é = " + soma);
    }
} 