import java.util.Scanner;
import java.util.Random;

public class PaperScissorRock {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("""
                P - Paper
                S - Scissor
                R - Rock""");
        System.out.print("Enter your choice: ");
        String userEnteredCharacter = input.next().toUpperCase(); // Convert user input to uppercase for comparison

        String[] lettersArray = {"P", "S", "R"};

        // Generate a random index within the range of the array
        Random random = new Random();
        int randomIndex = random.nextInt(lettersArray.length);

        // Assign the randomly selected letter to a variable
        String randomLetter = lettersArray[randomIndex];

        if (userEnteredCharacter.equals(randomLetter)) {
            System.out.println("Draw");
        } else if (userEnteredCharacter.equals("P") && randomLetter.equals("S")) {
            System.out.println("Computer's choice = " + randomLetter + "\n" + "You lost!");
        } else if (userEnteredCharacter.equals("S") && randomLetter.equals("P")) {
            System.out.println("Computer's choice = " + randomLetter + "\n" + "You won!");
        } else if (userEnteredCharacter.equals("R") && randomLetter.equals("P")) {
            System.out.println("Computer's choice = " + randomLetter + "\n" + "You lost!");
        } else if (userEnteredCharacter.equals("P") && randomLetter.equals("R")) {
            System.out.println("Computer's choice = " + randomLetter + "\n" + "You won!");
        } else if (userEnteredCharacter.equals("S") && randomLetter.equals("R")) {
            System.out.println("Computer's choice = " + randomLetter + "\n" + "You lost!");
        } else {
            System.out.print("Computer's choice = " + randomLetter + "\n" + "You won!");
        }

        input.close();
    }
}
