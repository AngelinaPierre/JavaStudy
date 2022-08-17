public class Fibonnaci
{
    public Fibonnaci(int qtd){
        // initialise instance variables
        int before = 0, next = 1, add, cont = 1;
        System.out.println(next);
        do{
            add = before + next;
            System.out.println(add);
            before = next;
            next = add;
            cont++;
        }while(cont < qtd);
    }
    public boolean findNumber(int num){
        int before = 0, next = 1, add;
        do{
            add = before + next;
            before = next;
            next = add;
        }while(add < num);
        if(add == num){
            return true;
        }else{
            return false;
        }
    }
}
