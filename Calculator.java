import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choice, num1, num2, max, min;
        int[] numbers = new int[5];

        System.out.println("Chose the required task that you want to execute!");
        System.out.println("\r\n\tEnter '1' for Addition");
        System.out.println("\tEnter '2' for Subtraction");
        System.out.println("\tEnter '3' for Multiplication");
        System.out.println("\tEnter '4' for Division");
        System.out.println("\tEnter '5' to check Number is even or Odd");
        System.out.println("\tEnter '6' to Find Even numbers between two numbers");
        System.out.println("\tEnter '7' to Find Odd numbers between two numbers");
        System.out.println("\tEnter '8' to Find max number between 5 numbers");
        System.out.println("\tEnter '9' to Find min number between 5 numbers");
        System.out.print("\nEnter your choice: ");
        choice = input.nextInt();

        switch (choice) {
            case 1: {
                System.out.println("Enter 1st number!");
                num1 = input.nextInt();
                System.out.println("Enter 2nd number!");
                num2 = input.nextInt();

                System.out.println("Sum of " + num1 + " and " + num2 + " is: " + (num1 + num2));
                break;
            }

            case 2: {
                System.out.println("Enter 1st number!");
                num1 = input.nextInt();
                System.out.println("Enter 2nd number!");
                num2 = input.nextInt();

                System.out.println("Subtraction of " + num1 + " and " + num2 + " is: " + (num1 - num2));
                break;
            }

            case 3: {
                System.out.println("Enter 1st number!");
                num1 = input.nextInt();
                System.out.println("Enter 2nd number!");
                num2 = input.nextInt();

                System.out.println("Multiplication of " + num1 + " and " + num2 + " is: " + (num1 * num2));
                break;
            }

            case 4: {
                System.out.println("Enter 1st number!");
                num1 = input.nextInt();
                System.out.println("Enter 2nd number!");
                num2 = input.nextInt();

                System.out.println("Division of " + num1 + " and " + num2 + " is: " + (num1 / num2));
                break;
            }

            case 5: {
                System.out.println("Enter a number!");
                num1 = input.nextInt();
                if (num1 % 2 == 0) {
                    System.out.println(num1 + " is Even.");
                } else {

                    System.out.println(num1 + " is Odd.");
                }
                break;
            }

            case 6: {
                System.out.println("Enter 1st number!");
                num1 = input.nextInt();
                System.out.println("Enter 2nd number!");
                num2 = input.nextInt();

                System.out.println("Even Numbers between " + num1 + " and " + num2 + " are ");
                for (int i = num1; i <= num2; i++) {
                    if (i % 2 == 0) {
                        System.out.print(i + ", ");
                    }
                }

                break;
            }

            case 7: {
                System.out.println("Enter 1st number!");
                num1 = input.nextInt();
                System.out.println("Enter 2nd number!");
                num2 = input.nextInt();

                System.out.println("Odd Numbers between " + num1 + " and " + num2 + " are ");

                for (int i = num1; i <= num2; i++) {
                    if (i % 2 != 0) {
                        System.out.print(i + ", ");
                    }
                }

                break;
            }

            case 8: {
                for (int i = 0; i < 5; i++) {
                    System.out.print("Enter the " + (i + 1) + " Number: ");
                    numbers[i] = input.nextInt();
                }

                max = numbers[0];
                for (int j = 1; j < 5; j++) {
                    if (numbers[j] > max) {
                        max = numbers[j];
                    }
                }

                System.out.println("Maximum Number is " + max);
                break;
            }

            case 9: {
                for (int i = 0; i < 5; i++) {
                    System.out.print("Enter the " + (i + 1) + " Number: ");
                    numbers[i] = input.nextInt();
                }

                min = numbers[0];
                for (int j = 1; j < 5; j++) {
                    if (numbers[j] < min) {
                        min = numbers[j];
                    }
                }

                System.out.println("Minimum Number is " + min);
                break;
            }

            default: {
                System.out.println("You entered a wrong choice!");
                break;
            }
        }
    }
}
