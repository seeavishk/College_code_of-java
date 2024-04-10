// use of simple loops like if ,else one of the most popular in the loops
import java.util.*;

public class loops {
    //example to compare values
    int i=10;
    if(i<15)
    System.out.println("Small hai value");
    System.out.println("Big hai value");
    System.out.println("The very basic explaination")
}


//A big code for the java if and else
import java.util.*;
 
class nestof_if {
    public static void main(String args[])
    {
        int i = 10;
 
        if (i == 10 || i<15) {
            // First if statement
            if (i < 15)
                System.out.println("i is smaller than 15");
 
            // Nested - if statement
            // Will only be executed if statement above
            // it is true
            if (i < 12)
                System.out.println(
                    "i is smaller than 12 too");
        } else{
                System.out.println("i is greater than 15");
        }
    }
}