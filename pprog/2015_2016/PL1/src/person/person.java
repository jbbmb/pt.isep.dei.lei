package person;
/** Author: João Borges (1150475) @ ISEP*/


/** Start of class with known variables plus default values*/
public class person {

    private String name;
    private int age;
    
    private static final String NO_NAME = "John Doe";
    private static final int NO_AGE = 0;
    

    /**Constructors of objects*/
    public person(){
        this.name = NO_NAME;
        this.age = NO_AGE;
    }

    public person(String name){
        this.name = name;
        this.age = NO_AGE;
    }

    public person(String name, int age){
        this.name = name;
        this.age = age;
    }


    /**Sets and gets of variables*/
    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public String setName(String name){
        this.name = name;
        return name;
    }

    public int setAge(int age){
        this.age = age;
        return age;
    }

    
    /**All information*/
    public String toString(){
        return "The person's name is " +name +" and age is " +age +" years.";

    }

}