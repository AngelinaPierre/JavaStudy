import java.util.Scanner;
import java.util.Arrays;

public class ReadQtdVector
{
    public static void main(String args[]){
        int[] vet;
        int i = 0;
        Scanner kb = new Scanner(System.in);
                
        System.out.println("Type Vector size: ");
        int qtd = kb.nextInt();
        
        vet = new int[qtd];
        
        for(i = 0; i < vet.length;i++){
            System.out.println("Type position of vet[" + i + "] : " + i);
            vet[i] = kb.nextInt();
        }
        System.out.println("Vector not ordered");
        for(int elemento : vet){
            System.out.println(elemento);
            
        }
        System.out.println();
        Arrays.sort(vet);
        System.out.println("Vetor ordered");
        for(int elemento : vet){
            System.out.println(elemento);
            
        }
        System.out.println();
    }
}
