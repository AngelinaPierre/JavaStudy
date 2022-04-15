public class Date
{
    // instance variables - replace the example below with your own
    private byte day, month;
    private short year;

    /**
     * Constructor for objects of class Date
     */
    public Date(byte d, byte m, short y){
        // initialise instance variables
        if(dateIsValid(d,m,y) == true){
            this.day = d;
            this.month = m;
            this.year = y;
        }else{
            day = 0;
            month = 0;
            year = 0;
        }
    }
    
    // An example of a method - replace this comment with your own
    public void showDate(){
        System.out.println("Date = " + day + "/" + month + "/" + year);
    }
    public Boolean dateIsValid(byte d, byte m, short y){
        if((d>=1) && (d<=31) && (m>=1) && (m<=12)){
            return true;
        }else{
            return false;
        }
    }
    public boolean isEqual(Date auxDate){
        if(
            (this.day == auxDate.day) && 
            (this.month == auxDate.month) && 
            (this.year == auxDate.year)
        ){
              return true;    
          }else{
              return false;
          }
    }
    public String returnMonth(){
        String result = null;
        switch(month){
            case 1: result = "Janeiro";
                   break;
           case 2: result = "February";
                   break;
           case 3: result = "March";
                   break;
           case 4: result = "April";
                   break;
           case 5: result = "May";
                   break;
           case 6: result = "June";
                   break;
           case 7: result = "July";
                   break;
           case 8: result = "August";
                   break;
           case 9: result = "September";
                   break;
           case 10: result = "October";
                    break;
           case 11: result = "November";
                    break;
           case 12: result = "December";
                    break;
            
        }
        return result;
    }
    // setters and getters
    public void setDay(byte d){
        this.day = d;
    }
    public void setMonth(byte m){
        this.month = m;
    }
    public void setYear(short y){
        this.year = y;
    }
    public byte getDay(){
        return day;
    }
    public byte getMonth(){
        return month;
    }
    public short getYear(){
        return year;
    }
}
