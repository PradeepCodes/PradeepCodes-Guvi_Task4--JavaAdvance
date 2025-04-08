package src;

import java.util.HashMap;
import java.util.Scanner;

public class StudentGrades {
    private HashMap<String,Integer> studentMap = new HashMap<>();

    public void addStudent(String name, int grade)
    {
        studentMap.put(name,grade);
        System.out.println("Student Added: "+ name +"with grade"+ grade);

    }
    public void removeStudent(String name)
    {
        if(studentMap.containsKey(name))
        {
            studentMap.remove(name);
            System.out.println("Student Removed: "+ name);
        }
        else{
            System.out.println("Student not Found: "+ name);
        }
    }
    public void displayGrade(String name)
    {
        if(studentMap.containsKey(name))
        {
            int grade=studentMap.get(name);
            System.out.println("Grade for"+ name +":"+grade);
        }
        else {
            System.out.println("Student not found: "+ name);
        }
    }

    public static void main(String[] args) {
        StudentGrades sg= new StudentGrades();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("\n ---Menu bar---");
            System.out.println("1: Add Student");
            System.out.println("2: Remove Student");
            System.out.println("3: Display Student");
            System.out.println("4 Exit");
            System.out.println("Enter your Choice: ");
            int choice = sc.nextInt();
            sc.nextLine();

            String name;
            int grade;
            switch (choice)
            {
                case 1 :
                    System.out.println("Enter the Student Name: ");
                    String addName= sc.nextLine();
                    System.out.println("Enter the Student Grade: ");
                    int addgrade = sc.nextInt();
                    sg.addStudent(addName,addgrade);
                    break;
                case 2:
                    System.out.println("Enter Student Name to remove:  ");
                    String removeName = sc.nextLine();
                    sg.removeStudent(removeName);
                case 3:
                    System.out.println("Enter Student Name to displaygrade: ");
                    String displayName = sc.nextLine();
                    sg.displayGrade(displayName);
                    break;
                case 4:
                    System.out.println("Exiting....");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid Choice! Try again");
            }
        }
    }
}
