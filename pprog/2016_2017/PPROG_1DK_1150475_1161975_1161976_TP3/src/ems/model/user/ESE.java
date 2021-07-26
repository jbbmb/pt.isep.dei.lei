package ems.model.user;
// STATUS: DONE
// ISSUES: NONE

import java.io.Serializable;

/**
 * Class that represents an Event Supporting Employee.
 * @author 1DK_1150475_1161975_1161976
 */
public class ESE extends User implements Serializable {
    
    // Class variables
    private int experienceLevel;
    private int numberTimeAssigned;
    private int MAX_NUMBER_OF_EVENTS;
    private int counterOfEvents = 0;
    
    public ESE(String name, String email){
        super(name, email);
        this.MAX_NUMBER_OF_EVENTS = 3;
        this.experienceLevel = 0;
        this.numberTimeAssigned = 0;
        this.counterOfEvents = 0;
    }
    
    public ESE(){
        super();
        this.MAX_NUMBER_OF_EVENTS = 3;
        this.experienceLevel = 0;
        this.numberTimeAssigned = 0;
        this.counterOfEvents = 0;
    }

    public int getExperienceLevel() {
        return experienceLevel;
    }

    public int getNumberTimeAssigned() {
        return numberTimeAssigned;
    }

    public void setExperienceLevel(int experienceLevel) {
        this.experienceLevel = experienceLevel;
    }

    public void setNumberTimeAssigned(int numberTimeAssigned) {
        this.numberTimeAssigned = numberTimeAssigned;
    }
    
    public int getCounterOfEvents() {
        return counterOfEvents;
    }
    
    public void addToCounterOfEvents(int add){
        setCounterOfEvents(getCounterOfEvents()+add);
    }
    
    public void substractFromCounterOfEvents(int add){
        setCounterOfEvents(getCounterOfEvents()-add);
    }
    
    public void setCounterOfEvents(int counterOfEvents) {
        this.counterOfEvents = counterOfEvents;
    }
    
    public int getMAX_NUMBER_OF_EVENTS() {
        return MAX_NUMBER_OF_EVENTS;
    }

    public void setMAX_NUMBER_OF_EVENTS(int MAX_NUMBER_OF_EVENTS) {
        this.MAX_NUMBER_OF_EVENTS = MAX_NUMBER_OF_EVENTS;
    }
    
    @Override
    public String toString(){
        return String.format("USER INFORMATION\nSystem role: Event Supporting Employee\n%s", super.toString());
    }

}