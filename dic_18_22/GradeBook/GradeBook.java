package dic_18_22.GradeBook;


public class GradeBook{

    private String courseName;


    public GradeBook(String name){
        this.courseName = name;
    }

    public  void displayMessage(){
        System.out.println("Welcome to the GradeBook");
    }

    public void displayMessageParam(String message){

        System.out.println("Welcome to the GradeBook " + message + " courseName: "+ getCourseName());
    }


    public String getCourseName(){
        return this.courseName;
    }

    public void setCourseName(String name){
        this.courseName = name;
    }
}