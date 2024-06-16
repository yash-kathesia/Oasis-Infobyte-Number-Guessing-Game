/*
 * @Author YASH KATHESIA
 * @Description Number Guessing Game
 */

import java.util.Scanner;

public class NumberGuessingGame {
    private static final int MAX_ATTEMPTS = 8;
    private static final int MIN_RANGE = 0;
    private static final int MAX_RANGE = 100;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNumber = (int) (Math.random() * 101);
        int num = 0, attempt = 0, totalScore = 0;
        System.out.println("===> WELCOME TO NUMBER GUESSING GAME <===");
        System.out.printf("Guess the number between %d and %d in %d attempts.\n", MIN_RANGE, MAX_RANGE, MAX_ATTEMPTS);
        while (randomNumber != num) {
            System.out.println(randomNumber);
            System.out.print("Enter a Random Number : ");
            num = sc.nextInt();
            attempt = attempt + 1;
            if (num == randomNumber) {
                int score = MAX_ATTEMPTS - attempt;
                totalScore = totalScore + score;
                System.out.println("Guess Number is Equals to Random number. You Won...!!!");
                System.out.printf("Attempts : %d & Score : %d\n", attempt, totalScore);
                break;
            } else if (num < randomNumber) {
                System.out.printf("Number is Greater then %d & Attempts Left : %d.\n", num, MAX_ATTEMPTS - attempt);
            } else {
                System.out.printf("Number is Less then %d & Attempts Left : \n", num, MAX_ATTEMPTS - attempt);
            }
            if (attempt == MAX_ATTEMPTS) {
                System.out.println("Attempt Left : 0");
                System.out.printf("The Random Number is : %d\n", randomNumber);
                System.out.println("===> GAME OVER <====");
                break;
            }
        }
    }
}