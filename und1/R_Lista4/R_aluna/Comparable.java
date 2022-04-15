public class Comparable
{
    private int value;

    // Constructor for objects of class Comparavel
    public Comparable(int v){
        this.value = v;
    }
    // setters and getters
    public void setValue(int v){
        this.value = v;
    }
    public int getValue(){
        return value;
    }
    
    //An example of a method - replace this comment with your own
    public Boolean highEqual(int v){
        if(v >= value){
            return true;
        }else{
            return false;
        }
    }
    public Boolean lessEqual(int v){
        if( v <= value){
            return true;
        }else{
            return false;
        }
    }
    public Boolean differentFrom(int v){
        if(v != value){
            return true;
        }else{
            return false;
        }
    }
}
