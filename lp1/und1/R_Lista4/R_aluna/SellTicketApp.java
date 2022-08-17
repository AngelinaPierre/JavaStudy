import java.util.Scanner;
public class SellTicketApp
{
    public static void main(String args[]){
        
        float time, value;
        int room, studentID;
        byte day, month;
        short year;
        Date dateMove, dateBirth;
        TicketMove objTicketMove;
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("**** Type session data ****");
        System.out.println("Day of session: ");
        day = keyboard.nextByte();
        System.out.println("Month of session: ");
        month = keyboard.nextByte();
        System.out.println("Year of session: ");
        year = keyboard.nextShort();
        
        dateMove = new Date(day,month,year);
        
        System.out.println("Type session time:");
        time = keyboard.nextFloat();
        System.out.println("Type session price:");
        value = keyboard.nextFloat();
        keyboard.nextLine();
        System.out.println("Type session Room:");
        room = keyboard.nextInt();
        
        System.out.println("Type day of birth:");
        day = keyboard.nextByte();
        System.out.println("Type month of birth:");
        month = keyboard.nextByte();
        System.out.println("Type year of birth:");
        year = keyboard.nextShort();
        
        dateBirth = new Date(day,month,year);
        
        System.out.println("Type studentID number or 0 (normal)");
        studentID = keyboard.nextInt();
        
        // instancie the object created earlier
        objTicketMove = new TicketMove(dateMove, room, time, value);
        
        if(studentID == 0){
            objTicketMove.calcDescont(dateBirth,studentID);
        }else{
            objTicketMove.calcDescont(dateBirth);
        }
    
        objTicketMove.calcDescontTime();
        objTicketMove.showTicket();
    }
}
