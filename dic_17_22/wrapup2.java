package dic_17_22;
import java.util.Scanner;
public class wrapup2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        /* A)
         * Declare variables c , thisIsAVariable , q76354 and number to be of type int .
        */
        int c,thisIsAVariable,q76354,number;

        
        //B) Prompt the user to enter an integer.
        System.out.println("Enter an integer");
        /*C)
        Input an integer and assign the result to int variable value . Assume Scanner variable
        input can be used to read a value from the keyboard.
        */
        int user = scan.nextInt();
        c = user; 
        thisIsAVariable = user;
        q76354 = user;
        number = user;

        
        /* D)Print "This is a Java program" on one line in the command window. Use method
            System.out.println .
        */
        System.out.println("This is a Java program");
        
        /* E)
        Print "This is a Java program" on two lines in the command window. The first line
        should end with Java . Use method System.out.println .
         */
        System.out.println("This is a Java \n program");

        /* F)
        Print "This is a Java program" on two lines in the command window. The first line
        should end with Java . Use method System.out.printf and two %s format specifiers.
        */
        System.out.printf("%s\n%s\n", "This is a Java","program");

        //If the variable number is not equal to 7 , display "The variable number is not equal to 7" .

        if(number != 7 )System.out.println("The number is not equal to 7");
        

        
        System.out.println("******    **    *       *");
        System.out.println("*    *   *  *  ***     * *");
        System.out.println("*    *   *  * *****   *   *  ");
        System.out.println("*    *   *  *   *    *     *");
        System.out.println("*    *   *  *   *     *   *  ");
        System.out.println("******    **    *       *     ");

    }
}
