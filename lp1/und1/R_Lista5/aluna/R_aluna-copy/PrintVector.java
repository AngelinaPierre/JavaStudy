import java.util.Scanner;
public class PrintVector
{
    public static void main(String args[]){
        int[] vet = new int[8];
        
        Scanner keyboard = new Scanner(System.in);
        
        for(int i = 0; i < vet.length; i++){
            System.out.println(" Type value vet[" + i + "] : ");
            vet[i] = keyboard.nextInt();
        }
        for(int i = 0; i<vet.length; i++){
            System.out.println("Vet[" + i + "] = " + vet[i] );
        }
    }
}
