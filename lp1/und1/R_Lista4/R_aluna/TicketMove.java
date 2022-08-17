public class TicketMove
{
    // instance variables - replace the example below with your own
    private Date dateMove;
    int room;
    float time, value;
    
    // Constructor for objects of class TicketMove
    public TicketMove(Date dm, int r, float t, float v){
        // initialise instance variables
        this.dateMove = dm;
        this.room = r;
        this.time = t;
        this.value = v;
    }
    
    //An example of a method - replace this comment with your own
    public void calcDescont(Date dbirth){
        if((dateMove.getYear() - dbirth.getYear()) <=12){
            value = value/2;
        }
    }
    public void calcDescont(Date dbirth, int numStudentID){
        int age = dateMove.getYear() - dbirth.getYear();
        if((age > 12) && (age <=15)){
            value = value - ((40*value)/100);
        }else if((age >=16) && (age < 20)){
            value = value - ((30*value)/100);
        }else if(age >=20){
            value = value - ((20*value)/100);
        }
    }
    public void calcDescontTime(){
        if(time < 16){
            value = value - ((value*10)/100);
        }
    }
    public void showTicket(){
        System.out.println("Date of move: ");
        dateMove.showDate();
        System.out.println("Session time : " + time);
        System.out.println("Session Room : " + room);
        System.out.println("Session price : " + value);
    }
    //setters and getters
    public void setdateMove(Date dm){
        this.dateMove = dm;
    }
    public void setRoom(int r){
        this.room = r;
    }
    public void setTime(float t){
        this.time = t;
    }
    public void setValue(float v){
        this.value = v;
    }
    public Date getDateMove(){
        return dateMove;
    }
    public int getRoom(){
        return room;
    }
    public float getTime(){
        return time;
    }
    public float getValue(){
        return value;
    }
}
