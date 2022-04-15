import java.util.Scanner;
public class Intercalation
{
    public static void main(String args[]){
        int[] vet1,vet2,vet3;
        int aux;
        vet1 = new int[10];
        vet2 = new int[10];
        vet3 = new int[20];
        int i = 0,j = 0;
        
        Scanner keyboard = new Scanner(System.in);
        
        do{
            System.out.println("Digite vet1[" + i + "] :");
            vet1[i] = keyboard.nextInt();
            i++;
            System.out.println("Digite vet1[" + i + "] :");
            vet1[i] = keyboard.nextInt();
            if(vet1[i] < vet1[i-1]){
                System.out.println("Only Crescent Values, type again :");
                System.out.println("Digite vet1[" + i + "] :");
                vet1[i] = keyboard.nextInt();
                i++;
            }
            i++;
        }while(i < vet1.length);
        i = 0;
        do{
            System.out.println("Digite vet2[" + i + "] :");
            vet2[i] = keyboard.nextInt();
            i++;
            System.out.println("Digite vet2[" + i + "] :");
            vet2[i] = keyboard.nextInt();
            if(vet2[i] < vet2[i-1]){
                System.out.println("Only Crescent Values, type again :");
                System.out.println("Digite vet2[" + i + "] :");
                vet2[i] = keyboard.nextInt();
                i++;
            }
            i++;
        }while(i < vet2.length);
        i = 0;
        do{
            vet3[j] = vet1[i];
            j++;
            vet3[j] = vet2[i];
            j++;
            i++;
        }while(j < vet3.length);
        for(i = 0; i < vet3.length; i++){
            System.out.println("Vet3[" + i + "] = " + vet3[i]);
        }
    }
}
