package src;

class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}

class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}

public class Student {
    int rollno;
    String name;
    int age;
    String course;

    public Student(int rollno, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException{

        if(age < 15 || age > 21)
        {
               throw  new AgeNotWithinRangeException("Age must be between 15 and 21");
        }
        if(!name.matches("[a-zA-Z\\\\s]+") )
        {
            throw new NameNotValidException("Name must contain only alphabets and space");
        }
        this.rollno = rollno;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    public void display()
    {
        System.out.println("Roll No: "+ rollno);
        System.out.println("Name: "+ name);
        System.out.println("Age: "+age);
        System.out.println("Course: "+ course);
    }
}
