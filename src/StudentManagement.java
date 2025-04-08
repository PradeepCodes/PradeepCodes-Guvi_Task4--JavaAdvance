package src;

public class StudentManagement {
    public static void main(String[] args) {
        //valid Student
        try
        {
            Student s1= new Student(1,"Pradeep",21,"Computer Science");
            s1.display();
        }
        catch (AgeNotWithinRangeException | NameNotValidException e)
        {
            System.out.println("Exception: "+ e.getMessage());
        }

        System.out.println("--------------------------------");
        //invalid Name
         try{
             Student s2= new Student(2,"Santhosh!",15,"ComputerScience");
         }
         catch (AgeNotWithinRangeException | NameNotValidException e)
         {
             System.out.println("Exception: "+ e.getMessage());
         }
        System.out.println("--------------------------------");
         //Invalid age
         try{
             Student s2 = new Student(3,"Vimal",12,"Computer Science");
         }
         catch (AgeNotWithinRangeException | NameNotValidException e)
         {
             System.out.println("Exception: "+e.getMessage());
         }
    }
}
