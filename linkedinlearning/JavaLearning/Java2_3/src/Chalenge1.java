import java.util.Scanner;

public class Chalenge1 {
    public static void main(String args[]) {
        String question = "What the planet of the solar system ?";
        String choiceOne = "Earth";
        String choiceTwo = "Jupiter";
        String choiceThree = "Mars";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println("Your options are: " + choiceOne + ", " + choiceTwo + " or " + choiceThree);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        if (correctAnswer.equals(input)) {
            System.out.println("Congrats! Correct Answer");
        }else{
            System.out.println("You are incorret. Correct answer is " + correctAnswer);
        }
    }
}
