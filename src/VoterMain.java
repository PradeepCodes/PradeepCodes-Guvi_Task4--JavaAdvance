package src;

public class VoterMain {
    public static void main(String[] args) {
     try
     {
         Voter v1 = new Voter(1,"Pradeep",20);
         v1.display();
     }
     catch (InvalidVoterAgeException e)
     {
         System.out.println("Error: "+ e.getMessage());
     }
        System.out.println("----------------------------");
     try
     {
         Voter v2= new Voter(2,"Santhosh",17);
     }
     catch (InvalidVoterAgeException e)
     {
         System.out.println("Error:"+ e.getMessage());
     }
    }
}
