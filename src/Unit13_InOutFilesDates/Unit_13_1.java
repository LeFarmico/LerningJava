package Unit13_InOutFilesDates;

import java.util.Random;

import static java.lang.Integer.max;

public class Unit_13_1 {
    public static void main(String[] args) {
        Random random = new Random();

        int firstNumber = random.nextInt();
        int secondNumber = random.nextInt();
        int thirdNumber = random.nextInt();
        System.out.println("first number is: " + firstNumber);
        System.out.println("second number is: " + secondNumber);
        System.out.println("third number is: " + thirdNumber);
        System.out.println("Max of three numbers is: " + maxOfThreeNumbers(firstNumber, secondNumber, thirdNumber));
    }
    public static int maxOfThreeNumbers(int first, int second, int third){
        int maxOfTwoNumbers = max(first, second);
        int maxOfThreeNumbers = max(maxOfTwoNumbers, third);
        return maxOfThreeNumbers;
    }
}
