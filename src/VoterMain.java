package src;

public class VoterMain {
    public static void main(String[] args) {
        try {

            Voter v1 = new Voter(101, "Pradeep", 25);
            v1.display();

            // Test with invalid age (throws exception)
            Voter v2 = new Voter(102, "Karan", 16);
            v2.display();

        } catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
