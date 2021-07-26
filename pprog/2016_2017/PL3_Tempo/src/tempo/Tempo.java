/**
 * Creates a specific time with hour, minutes and second.
 * 
 * @author João Borges, 1150475
 */
package tempo;

public class Tempo {
    
    /**
     * The hour of the time.
     */
    private int hour;
    
    /**
     * The minute of the time.
     */
    private int minute;
    
    /**
     * The second of the time.
     */
    private int second;
    
    /**
     * Default hour of the time.
     */
    private static final int DEFAULT_HOUR = 0;
    
    /**
     * Default minute of the time.
     */
    private static final int DEFAULT_MINUTE = 0;
    
    /**
     * Default second of the time.
     */
    private static final int DEFAULT_SECOND = 0;
    
    /**
     * Creates an instance of time with default values.
     */
    public Tempo(){
        this.hour = DEFAULT_HOUR;
        this.minute = DEFAULT_MINUTE;
        this.second = DEFAULT_SECOND;
    }
    
    /**
     * Creates an instance of time with custom values.
     * @param hour custom hour
     * @param minute custom minute
     * @param second custom second
     */
    public Tempo(int hour, int minute, int second){
        if(hour>24 || minute>59 || second>59) {
            System.out.println("Impossible time! Object created with default values.");
        } else {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
    }
    
    /**
     * Sets a custom hour.
     * @param hour the custom hour
     */
    public void setHour(int hour){
        this.hour = hour;
    }
    
    /**
     * Sets a custom minute.
     * @param minute the custom minute
     */
    public void setMinute(int minute){
        this.minute = minute;
    }
    
    /**
     * Sets a custom second.
     * @param second the custom second
     */
    public void setSecond(int second){
        this.second = second;
    }
    
    /**
     * Returns the hour of the selected time.
     * @return the hour of selected time
     */
    public int getHour(){
        return hour;
    }
    
    /**
     * Returns the minute of the selected time.
     * @return the minute of selected time
     */
    public int getMinute(){
        return minute;
    }
    
    /**
     * Returns the second of the selected time.
     * @return the second of selected time
     */
    public int getSecond(){
        return second;
    }
    
    /**
     * Prints the selected time in the 24h format.
     */
    public void timeIn24H(){
        int selectedHour = getHour();
        int selectedMinute = getMinute();
        int selectedSecond = getSecond();
        String StringHour = String.valueOf(selectedHour);
        String StringMinute = String.valueOf(selectedMinute);
        String StringSecond = String.valueOf(selectedSecond);
        if(selectedHour<10){
            System.out.println("Selected time in 24h format is 0" +StringHour +":" +StringMinute +":" +StringSecond +".");
        }
        if(selectedMinute<10){
            System.out.println("Selected time in 24h format is " +StringHour +":0" +StringMinute +":" +StringSecond +".");
        }
        if(selectedSecond<10){
            System.out.println("Selected time in 24h format is " +StringHour +":" +StringMinute +":0" +StringSecond +".");
        }
        if(selectedHour<10 && selectedMinute<10){
            System.out.println("Selected time in 24h format is 0" +StringHour +":0" +StringMinute +":" +StringSecond +".");
        }
        if(selectedHour<10 && selectedSecond<10){
            System.out.println("Selected time in 24h format is 0" +StringHour +":" +StringMinute +":0" +StringSecond +".");
        }
        if(selectedMinute<10 && selectedSecond<10){
            System.out.println("Selected time in 24h format is " +StringHour +":0" +StringMinute +":0" +StringSecond +".");
        }
        if(selectedHour<10 && selectedMinute<10 && selectedSecond<10){
            System.out.println("Selected time in 24h format is 0" +StringHour +":0" +StringMinute +":0" +StringSecond +".");
        }
    }
    
    /**
     * Prints the selected time in the 12h format.
     */
    public void timeIn12H(){
        int selectedHour = getHour();
        int selectedMinute = getMinute();
        int selectedSecond = getSecond();
        String StringHour = String.valueOf(selectedHour);
        String StringMinute = String.valueOf(selectedMinute);
        String StringSecond = String.valueOf(selectedSecond);
        if(selectedHour>=13){
            int pmHour = selectedHour-12;
            String StringPmHour = String.valueOf(pmHour);
            if(selectedHour<10){
                System.out.println("Selected time in 12h format is 0" +StringPmHour +":" +StringMinute +":" +StringSecond +" PM.");
            }
            if(selectedMinute<10){
                System.out.println("Selected time in 12h format is " +StringPmHour +":0" +StringMinute +":" +StringSecond +" PM.");
            }
            if(selectedSecond<10){
                System.out.println("Selected time in 12h format is " +StringPmHour +":" +StringMinute +":0" +StringSecond +" PM.");
            }
            if(selectedHour<10 && selectedMinute<10){
                System.out.println("Selected time in 12h format is 0" +StringPmHour +":0" +StringMinute +":" +StringSecond +" PM.");
            }
            if(selectedHour<10 && selectedSecond<10){
                System.out.println("Selected time in 12h format is 0" +StringPmHour +":" +StringMinute +":0" +StringSecond +" PM.");
            }
            if(selectedMinute<10 && selectedSecond<10){
                System.out.println("Selected time in 12h format is " +StringPmHour +":0" +StringMinute +":0" +StringSecond +" PM.");
            }
            if(selectedHour<10 && selectedMinute<10 && selectedSecond<10){
                System.out.println("Selected time in 12h format is 0" +StringPmHour +":0" +StringMinute +":0" +StringSecond +" PM.");
            } else {
                if(selectedHour<10){
                    System.out.println("Selected time in 12h format is 0" +StringHour +":" +StringMinute +":" +StringSecond +" AM.");
                }
                if(selectedMinute<10){
                    System.out.println("Selected time in 12h format is " +StringHour +":0" +StringMinute +":" +StringSecond +" AM.");
                }
                if(selectedSecond<10){
                    System.out.println("Selected time in 12h format is " +StringHour +":" +StringMinute +":0" +StringSecond +" AM.");
                }
                if(selectedHour<10 && selectedMinute<10){
                    System.out.println("Selected time in 12h format is 0" +StringHour +":0" +StringMinute +":" +StringSecond +" AM.");
                }
                if(selectedHour<10 && selectedSecond<10){
                    System.out.println("Selected time in 12h format is 0" +StringHour +":" +StringMinute +":0" +StringSecond +" AM.");
                }
                if(selectedMinute<10 && selectedSecond<10){
                    System.out.println("Selected time in 12h format is " +StringHour +":0" +StringMinute +":0" +StringSecond +" AM.");
                }
                if(selectedHour<10 && selectedMinute<10 && selectedSecond<10){
                    System.out.println("Selected time in 12h format is 0" +StringHour +":0" +StringMinute +":0" +StringSecond +" AM.");
                }
            }
        }
    }

    /**
     * Adds a second to the selected time.
     */
    public void addSecond(){
        int selectedHour = getHour();
        int selectedMinute = getMinute();
        int selectedSecond = getSecond();
        if(selectedSecond == 59){
            if(selectedMinute == 59){
                if(selectedHour == 24){
                    setHour(0);
                    setMinute(0);
                    setSecond(0);
                } else {
                    setHour(selectedHour++);
                    setMinute(0);
                    setSecond(0);
                }
            } else {
                setHour(selectedHour++);
                setMinute(selectedMinute++);
                setSecond(0);
            }
        } else {
            setHour(selectedHour++);
            setMinute(selectedMinute++);
            setSecond(selectedSecond++);
        }
        System.out.println("Second added to the selected time object successfully!");
    }
    
}