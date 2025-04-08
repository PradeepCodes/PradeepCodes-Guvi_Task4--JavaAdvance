package src;

import java.util.Scanner;

public class WeekdayFinder {
    public static void main(String[] args) {
        String[] weekdays = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
        Scanner sc= new Scanner(System.in);
        try
        {
            System.out.println("Enter day index(0 to 6):  ");
            int index= sc.nextInt();
            System.out.println("Day is: "+weekdays[index]);
        }
        catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error: Invalid index. Please enter a number between 0 and 6.");

        }
        catch (Exception e){
            System.out.println("Error: Please Enter the valid integer");
        }
        finally {
            sc.close();
        }
    }
}
