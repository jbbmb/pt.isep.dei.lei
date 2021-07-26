package time;
/** @author João Borges (1150475) */

public class time {
    
    private int hour;
    private int minute;
    private int second;
    
    private static final int DEFAULT_HOUR = 0;
    private static final int DEFAULT_MINUTE = 0;
    private static final int DEFAULT_SECOND = 0;
    
    public time(int hour, int minute, int second){
        if(hour<0 && hour>24){
            System.out.println("Invalid hour parameter! Please verify input.");
        } else this.hour = hour;
        if(minute<0 && minute>59){
            System.out.println("Invalid minute parameter! Please verify input.");
        } else this.minute = minute;
        if(second<0 && second>59){
            System.out.println("Invalid second parameter! Please verify input.");
        } else this.second = second;
}
    
    public time(){
        this.hour = DEFAULT_HOUR;
        this.minute = DEFAULT_MINUTE;
        this.second = DEFAULT_SECOND;
    }
    
    public void setHour(int hour){
        if(hour<0 && hour>24){
            System.out.println("Invalid hour parameter! Please verify input.");
        } else this.hour = hour;
    }
    
    public int getHour(){
        return hour;
    }
    
    public void setMinute(int minute){
        if(minute<0 && minute>59){
            System.out.println("Invalid minute parameter! Please verify input.");
        } else this.minute = minute;
    }
    
    public int getMinute(){
        return minute;
    }
    
    public void setSecond(int second){
        if(second<0 && second>59){
            System.out.println("Invalid second parameter! Please verify input.");
        } else this.second = second;
    }
    
    public int getSecond(){
        return second;
    }
    
    @Override
    public String toString(){
        return "Timestamp in memory: " +hour +":" +minute +":" +second;
    }
    
    /** NÃO EXISTE MANEIRA MAIS EFICIENTE DE FAZER ISTO? */
    public void toAMPMString(){
        if(hour>=1 && hour<=11){
            System.out.println("Timestamp in memory: " +hour +":" +minute +":" +second +"AM");
        } else if(hour == 12){
            System.out.println("Timestamp in memory: " +hour +":" +minute +":" +second +"PM");
        } else if(hour == 13){
            System.out.println("Timestamp in memory: 1:" +minute +":" +second +"PM");
        } else if(hour == 14){
            System.out.println("Timestamp in memory: 2:" +minute +":" +second +"PM");
        } else if(hour == 15){
            System.out.println("Timestamp in memory: 3:" +minute +":" +second +"PM");
        } else if(hour == 16){
            System.out.println("Timestamp in memory: 4:" +minute +":" +second +"PM");
        } else if(hour == 17){
            System.out.println("Timestamp in memory: 5:" +minute +":" +second +"PM");
        } else if(hour == 18){
            System.out.println("Timestamp in memory: 6:" +minute +":" +second +"PM");
        } else if(hour == 19){
            System.out.println("Timestamp in memory: 7:" +minute +":" +second +"PM");
        } else if(hour == 20){
            System.out.println("Timestamp in memory: 8:" +minute +":" +second +"PM");
        } else if(hour == 21){
            System.out.println("Timestamp in memory: 9:" +minute +":" +second +"PM");
        } else if(hour == 22){
            System.out.println("Timestamp in memory: 10:" +minute +":" +second +"PM");
        } else if(hour == 23){
            System.out.println("Timestamp in memory: 11:" +minute +":" +second +"PM");
        } else if(hour == 24){
            System.out.println("Timestamp in memory: 0:" +minute +":" +second +"AM");
        }
    }

    public void addSecond(){
        if(second == 59 && minute == 59 && hour == 24){
            second = 0;
            minute = 0;
            hour = 0;
        }   else if(second == 59 && minute == 59){
                second = 0;
                minute = 0;
                hour++;
            } else if(second == 59){
                second = 0;
                minute++;
                hour++;
                }
        System.out.println("Second added! New timestamp in memory is: " +hour +":" +minute +":" +second);
    }

    public boolean compareTime(otherTime time){
        /** DO LOGIC HERE! */
        return /** True or False */
    }
        
    
}
        