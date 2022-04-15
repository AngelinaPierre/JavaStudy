import java.util.Scanner;
public class AddVector
{
    public static void main(String args[]){
        int[] A, B,C;
        A = new int[8];
        B = new int[8];
        C = new int[8];
        
        Scanner keyboard = new Scanner(System.in);
        
        for(int i = 0; i < A.length;i++){
            System.out.println("Type Vector A[" + i + "] :");
            A[i] = keyboard.nextInt();
        }
        for(int i = 0; i < B.length;i++){
            System.out.println("Type Vector B[" + i + "] :");
            B[i] = keyboard.nextInt();
            C[i] = A[i] + B[i];
        }
        for(int i = 0; i < C.length; i++){
            System.out.println("Vetor C[" + i + "] = " + C[i]);
        }
    }
}
