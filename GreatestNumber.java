import java.util.Scanner;

public class GreatestNumber{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int number1 =sc.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = sc.nextInt();

        if (number1 > number2) {
            System.out.println("The greatest number is: " +number1);
        } else if (number2>number1) {
            System.out.println("The greatest number is: " +number2);
        } else {
            System.out.println("Both numbers are equal.");
        }
    }
}
