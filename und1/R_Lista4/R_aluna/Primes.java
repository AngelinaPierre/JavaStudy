public class Primes{    
    public Boolean Prime(int num){
        boolean ok = true;
        for(int i = 2; i < num; i++){
            if((num % i)==0){
                ok = false;
            }
        }
        return ok;
    }
    public void primeRange(int start, int end){
        if(start <= end){
            System.out.println("Invalid Range");
        }else{
            System.out.println("**** Prime's List at Range : " + start + " - " + end +" ****");
            while(start <= end){
                if(Prime(start) == true){
                    System.out.println(start);
                }
                start++;
            }

        }
    }
}
