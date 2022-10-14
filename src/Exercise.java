import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercise {
    public static void main(String[] args) {
        Random Random_generate = new Random();
        int Random_number = Random_generate.nextInt();
        System.out.println("Please enter your name!");
        Scanner Input = new Scanner(System.in);
        String Name = Input.nextLine();
        System.out.println("Let the game begin!");

        while (true) {
            System.out.println("Please enter a number!");
            int InputNumber = Input.nextInt();

            if (InputNumber < Random_number) {
                System.out.println("Your number is too small. Please, try again.");
            } else if (InputNumber > Random_number) {
                System.out.println("Your number is too big. Please, try again.");

            } else {
                System.out.printf("Congratulations, %s", Name + "!");
                break;
            }


        }
    }
}
