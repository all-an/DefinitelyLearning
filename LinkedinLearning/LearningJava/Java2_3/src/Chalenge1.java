import java.util.Scanner;

public class Chalenge1 {
    public static void main(String args[]) {
        String question = "What the planet of the solar system ?";
        String choiceOne = "earth";
        String choiceTwo = "jupiter";
        String choiceThree = "saturn";

        String correctAnswer = choiceTwo;

        System.out.println(question);
        System.out.println("Your options are: " + choiceOne + ", " + choiceTwo + " or " + choiceThree);

        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();

        System.out.println(input);
        System.out.println(correctAnswer);

        if (correctAnswer.equals(input.toLowerCase())) {
            System.out.println("Congrats! Correct Answer");
        }else{
            System.out.println("You are incorret. Correct answer is " + correctAnswer);
        }
    }
}
