/**
 * @author João Borges, 1150475
 */
package cumprimentar;

public class Cumprimentar {

    /**
     * The person's name.
     */
    private String name;
    
    /**
     * Default person's name.
     */
    private static final String DEFAULT_NAME = "John Doe";
    
    /**
     * The person's age.
     */
    private int age;
    
    /**
     * Default person's age.
     */
    private static final int DEFAULT_AGE = 1;
    
    /**
     * Creates a new person in memory with default values.
     */
    public Cumprimentar(){
        this.name = DEFAULT_NAME;
        this.age = DEFAULT_AGE;
    }
    
    /**
    * Creates a new person in memory with custom age and default name.
    * @param inputAge the age of the person
    */
    public Cumprimentar(int inputAge){
        this.name = DEFAULT_NAME;
        this.age = inputAge;
    }
    
   /**
    * Creates a new person in memory with custom name and default age.
    * @param inputName the name of the person
    */
    public Cumprimentar(String inputName){
        this.name = inputName;
        this.age = DEFAULT_AGE;
    }
    
    /**
    * Creates a new person in memory with custom name and age.
    * @param inputName the name of the person
    * @param inputAge the age of the person
    */
    public Cumprimentar(String inputName, int inputAge){
        this.name = inputName;
        this.age = inputAge;
    }
    
    /**
     * Sets the name for the selected user.
     * @param inputName the new custom name
     */
    public void setName(String inputName){
        this.name = inputName;
    }
    /**
     * Gets the name for the selected user.
     * @return current person's name
     */
    public String getName(){
        return name;
    }
    
    /**
     * Sets the age for the selected user.
     * @param inputAge the new custom age
     */
    public void setAge(int inputAge){
        this.age = inputAge;
    }
    /**
     * Gets the age for the selected user.
     * @return current person's age
     */
    public int getAge(){
        return age;
    }
    
    /**
     * Print a string with the person's name.
     * @return a string with the current user's
     */
    @Override
    public String toString(){
        return "A pessoa é o/a " +name +" e tem " +age +" anos.";
    }
    
    public String hello(){
        return "Olá " +name +"!";
    }
    
}