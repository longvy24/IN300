// Long Vy
// Unit 1 Java

import java.util.Scanner; // Import the Scanner class

public  class Unit1Java {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Please enter your second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Please enter your third number: ");
        int num3 = scanner.nextInt();

        int sumTotal = num1 + num2 + num3;
        double avgTotal = sumTotal / 3.0;

        System.out.println("");
        System.out.println("The sum of the three numbers is: " + sumTotal);
        System.out.println("The average of the three numbers is: " + avgTotal);
        System.out.println("");

        scanner.close();
        }

}