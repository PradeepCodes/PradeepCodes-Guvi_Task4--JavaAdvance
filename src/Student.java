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
  private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException{

        this.rollNo = rollNo;

        if (!name.matches("[a-zA-Z\\s]+")) {
            throw new NameNotValidException("Name is not valid. It must not contain digits or special characters.");
        }
        this.name = name;

        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age is not within the valid range (15 to 21).");
        }
        this.age = age;

        this.course = course;
    }
    public void display()
    {
        System.out.println("Roll No: "+ rollNo);
        System.out.println("Name: "+ name);
        System.out.println("Age: "+age);
        System.out.println("Course: "+ course);
    }
}
