package rectangle;
/**Author: João Borges (1150475) @ ISEP*/


public class rectangleTests {
    
    public static void main(String[] args){
        rectangle test = new rectangle(2, 4);
        System.out.println(test.toString());
        int area = test.area();
        int perimeter = test.perimeter();
        System.out.println("The perimeter is " +perimeter +".");
        System.out.println("The area is " +area +".");
    }
    
}