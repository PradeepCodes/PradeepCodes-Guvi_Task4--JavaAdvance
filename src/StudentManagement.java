package src;

public class StudentManagement {
    public static void main(String[] args) {
        try
        {
            Student student= new Student(1,"Pradeep!",21,"Computer Science");
            student.display();
        }
        catch (AgeNotWithinRangeException | NameNotValidException e)
        {
            System.out.println("Exception: "+ e.getMessage());
        }
    }
}
