package dic_18_22.GradeBook;
import java.util.Scanner;

public class GradeBookTest {
    public static void main(String[] args) {
    

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a message");
        String text = scan.nextLine();


        System.out.println("Enter a name");
        String name =  scan.nextLine();
        scan.close();



        GradeBook grade = new GradeBook("Learning JAVA with a book");
        grade.displayMessage();
        grade.displayMessageParam(text);

        grade.setCourseName(name);
        grade.displayMessageParam(text);
 
        
        
 
    }
    
}
