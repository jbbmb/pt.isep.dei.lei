package empregado;
// Class status: DONE

import utilitarios.Data;
import utilitarios.Time;

/**
 * @author João Borges, 1150475
 */
public class Empregado {
    
    // Object variables
    private String firstName;
    private String lastName;
    private Data contractDate;
    private Time inTime;
    private Time outTime;
    
    /**
     * Creates an employer with custom fields.
     * @param firstName
     * @param lastName
     * @param contractDate
     * @param inTime
     * @param outTime 
     */
    public Empregado(String firstName, String lastName, Data contractDate, Time inTime, Time outTime){
        this.firstName = firstName;
        this.lastName = lastName;
        this.contractDate = contractDate;
        this.inTime = inTime;
        this.outTime = outTime;
    }
    
    /**
     * Calculates the weekly hours worked given the in and out times.
     * @return weekly hours worked
     */
    public double calculateWeeklyHours(){
        Time dailyHours = outTime.diferencaEmTempo(inTime);
        double weeklyHours = (dailyHours.getHoras()*5);
        return weeklyHours;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Data getContractDate() {
        return contractDate;
    }

    public void setContractDate(Data contractDate) {
        this.contractDate = contractDate;
    }

    public Time getInTime() {
        return inTime;
    }

    public void setInTime(Time inTime) {
        this.inTime = inTime;
    }

    public Time getOutTime() {
        return outTime;
    }

    public void setOutTime(Time outTime) {
        this.outTime = outTime;
    }
    
    /**
     * Calculates the number of days employed.
     * @return number of days worked
     */
    public int timeEmployed(){
        return (contractDate.diferenca(Data.dataAtual()));
    }
    
    /**
     * Change the contract date.
     * @param newContractDate 
     */
    public void changeContractDate(Data newContractDate){
        this.contractDate = newContractDate;
    }
    
    /**
     * Change the working hours.
     * @param newInTime
     * @param newOutTime 
     */
    public void changeWorkingHours(Time newInTime, Time newOutTime){
        this.inTime = newInTime;
        this.outTime = newOutTime;
    }
    
    /**
     * Summarizes all information for a given employee.
     * @return String with the content of all variables
     */
    @Override
    public String toString(){
        return String.format("Employee information:\nFirst name: %s\nLast name: %s\nContract date: %s\nWork hours: %s - %s", firstName, lastName, contractDate.toString(), inTime.toStringHHMMSS(), outTime.toStringHHMMSS());
    }
    
}