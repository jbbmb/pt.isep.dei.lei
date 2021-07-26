package rectangle;
/**Author: João Borges (1150475) @ ISEP*/

/**Start class with know variables plus default values*/
public class rectangle {

    private int side1;
    private int side2;
    
    private static final int NO_SIDE = 0;
    

/**Constructors*/
public rectangle(){
    this.side1 = NO_SIDE;
    this.side2 = NO_SIDE;
}

public rectangle(int side1, int side2){
    this.side1 = side1;
    this.side2 = side2;
}


/**Sets and gets of variables*/
public int getSide1(){
    return side1;
}

public int getSide2(){
    return side2;
}

public int setSide1(){
    this.side1 = side1;
    return side1;
}

public int setSide2(){
    this.side2 = side2;
    return side2;
}


/**Calculus*/
public int area(){
    int area = side1*side2;
    return area;
}

public int perimeter(){
    int perimeter = 2*side1+2*side2;
    return perimeter;
}


/**All information*/
public String toString(){
    return "The rectangle has an width of " +side1 +" and a height of " +side2 +".";
}

}