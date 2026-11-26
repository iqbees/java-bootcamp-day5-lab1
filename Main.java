import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // 1. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of
        //two numbers , takes two numbers as input
        //Test Data:
        //Input first number: 125
        //Input second number: 24
        //Expected Output :
        //125 + 24 = 149
        //125 - 24 = 101
        //125 x 24 = 3000
        //125 / 24 = 5
        //125 mod 24 = 5

        System.out.print("Enter first number: ");
        int num1 = in.nextInt();

        System.out.print("Enter second number: ");
        int num2 = in.nextInt();

        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
        System.out.println(num1 + " mod " + num2 + " = " + (num1 % num2));

        // 2. Write a Java program that takes a number as input and prints its multiplication table up to
        //10.
        //Test Data:
        //Input a number: 8 Expected
        //Output :
        //8 x 1 = 8
        //8 x 2 = 16
        //8 x 3 = 24
        //...
        //8 x 10 = 80

        System.out.print("Enter a number: ");
        int num3 = in.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(num3 + " x " + i + " = " + (num3 * i));
        }

        // 3. Write a Java program to print the area and perimeter of a circle.
        //Test Data:
        //Radius = 7.5
        //Expected Output
        //Perimeter is = 47.12388980384689
        //Area is = 176.71458676442586

        System.out.print("Enter a radius: ");
        double radius = in.nextDouble();

        if (radius < 0) {
            System.out.println("Radius can not be negative.");
        } else {
            double perimeter = 2 * Math.PI * radius;
            double area = Math.PI * radius * radius;

            System.out.println("Perimeter is = " + perimeter);
            System.out.println("Area is = " + area);
        }

        // 4. Java program to find out the average of a set of integers
        //Enter the count of numbers:
        //5
        //Enter an integer:
        //3
        //Enter an integer:
        //8
        //Enter an integer:
        //6
        //Enter an integer:
        //7
        //Enter an integer:
        //2
        //The average is: 5.2

        System.out.print("Enter the count of numbers: ");
        int count = in.nextInt();

        int sum = 0;
        for (int i = 0; i < count; i++) {
            System.out.print("Enter an integer: ");
            int num4 = in.nextInt();

            sum += num4;
        }

        System.out.println("The average is: " + (sum / (double) count));

        // 5. Write a Java program that accepts three integers as input, adds the first two integers
        //together, and then determines whether the sum is equal to the third integer.
        //Sample Output:
        //Input the first number : 5
        //Input the second number: 10
        //Input the third number : 15
        //The result is: true
        //--------
        //Input the first number : 10
        //Input the second number: 20
        //Input the third number : 25
        //The result is: false

        System.out.print("Enter first number: ");
        int num4 = in.nextInt();

        System.out.print("Enter second number: ");
        int num5 = in.nextInt();

        System.out.print("Enter third number: ");
        int num6 = in.nextInt();

        System.out.println("The result is: " + (num4 + num5 == num6));

        // 6. Write a Java program to reverse a word.
        //Sample Output:
        //Input a word: dsaf
        //Reverse word: fasd

        System.out.print("Enter a word: ");
        String word = in.next();

        StringBuilder reverse = new StringBuilder();
        for (int i = word.length() - 1; i >= 0; i--) {
            reverse.append(word.charAt(i));
        }

        System.out.println("Reverse word: " + reverse);

        // 7 - Java program to check whether the given number is even or odd
        //Enter a number:
        //33
        //The number is Odd
        //Enter a number:
        //24
        //The number is Even

        System.out.print("Enter a number: ");
        int num7 = in.nextInt();

        if (num7 % 2 == 0) {
            System.out.println("The number is Even");
        } else {
            System.out.println("The number is Odd");
        }

        // 8 - Java program to convert the temperature in Centigrade to Fahrenheit
        //Enter temperature in Centigrade:
        //43
        //Temperature in Fahrenheit is: 109.4

        System.out.print("Enter temperature in Centigrade: ");
        int centigrade = in.nextInt();

        double fahrenheit = (centigrade * 9 / (double) 5) + 32;

        System.out.println("Temperature in Fahrenheit is: " + fahrenheit);

        // 9.Write a Java program that takes a string and a number from the user,then prints the
        //character in the given index.
        //Test Data:
        //Input a string: Java Bootcamp
        //Input a number: 1
        //Expected Output:
        //a

        System.out.print("Enter a string: ");
        in.nextLine();
        String str = in.nextLine();

        System.out.print("Enter a number: ");
        int num8 = in.nextInt();

        if (num8 < 0 || num8 >= str.length()) {
            System.out.println("Please enter a number between 0-" + (str.length() - 1));
        } else {
            System.out.println(str.charAt(num8));
        }

        // 10. Write a Java program to print the area and perimeter of a rectangle.
        //Test Data:
        //Width = 5.5 Height = 8.5
        //Expected Output
        //Area is 5.6 * 8.5 = 47.60
        //Perimeter is 2 * (5.6 + 8.5) = 28.20

        System.out.print("Enter the width: ");
        double width = in.nextDouble();

        System.out.print("Enter the height: ");
        double height = in.nextDouble();

        System.out.println("Area is " + width + " * " + height + " = " + (width * height));
        System.out.println("Perimeter is 2 * (" + width + " + " + height + ") = " + (2 * (width + height)));

        // 11. Write a Java program to compare two numbers.
        //Input Data:
        //Input first integer: 25
        //Input second integer: 39
        //Expected Output
        //25 != 39
        //25 < 39
        //25 <= 39

        System.out.print("Enter first number: ");
        int num9 = in.nextInt();

        System.out.print("Enter second number: ");
        int num10 = in.nextInt();

        if (num9 == num10) {
            System.out.println(num9 + " == " + num10);
        }

        if (num9 != num10) {
            System.out.println(num9 + " != " + num10);
        }

        if (num9 > num10) {
            System.out.println(num9 + " > " + num10);
        }

        if (num9 < num10) {
            System.out.println(num9 + " < " + num10);
        }

        if (num9 >= num10) {
            System.out.println(num9 + " >= " + num10);
        }

        if (num9 <= num10) {
            System.out.println(num9 + " <= " + num10);
        }

        // 12. Write a Java program to convert seconds to hours, minutes and seconds.
        //Sample Output:
        //Input seconds: 86399
        //23:59:59

        System.out.print("Enter seconds: ");
        int seconds = in.nextInt();

        if (seconds < 0) {
            System.out.println("Seconds must be greater than 0");
        } else {
            int hours = seconds / 60 / 60 % 24;
            int minutes = seconds / 60 % 60;
            int remainingSeconds = seconds % 60;

            if (hours < 10) {
                System.out.print("0" + hours + ":");
            } else {
                System.out.print(hours + ":");
            }

            if (minutes < 10) {
                System.out.print("0" + minutes + ":");
            } else {
                System.out.print(minutes + ":");
            }

            if (remainingSeconds < 10) {
                System.out.print("0" + remainingSeconds);
            } else {
                System.out.print(remainingSeconds);
            }

            System.out.println();
        }

        // 13. Write a Java program that accepts four integers from the user and prints equal if all
        //four are equal, and not equal otherwise.
        //Sample Output:
        //Input first number: 25
        //Input second number: 37
        //Input third number: 45
        //Input fourth number: 23
        //Numbers are not equal!

        System.out.print("Enter first number: ");
        int num11 = in.nextInt();

        System.out.print("Enter second number: ");
        int num12 = in.nextInt();

        System.out.print("Enter third number: ");
        int num13 = in.nextInt();

        System.out.print("Enter fourth number: ");
        int num14 = in.nextInt();

        if (num11 == num12 && num11 == num13 && num11 == num14) {
            System.out.println("Numbers are equal!");
        } else {
            System.out.println("Numbers are not equal!");
        }

        // 14. Write a Java program that reads an integer and check whether it is negative, zero, or
        //positive.
        //Test Data Input a number: 7 Expected Output :
        //Number is positive

        System.out.print("Enter a number: ");
        int num15 = in.nextInt();

        if (num15 > 0) {
            System.out.println("Number is positive");
        } else if (num15 < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // 15.Write a program to enter the numbers till the user wants and at the end it
        //should display the count of positive, negative and zeros entered (End loop use -1 ,
        //Don’t count -1).
        //Test data
        //1
        //3
        //0
        //-2
        //-4
        //-1
        //2 positives
        //1 zero
        //2 negatives

        int positives = 0;
        int negatives = 0;
        int zeros = 0;
        while (true) {
            System.out.print("Please enter a number or -1 to stop: ");
            int num16 = in.nextInt();

            if (num16 == -1) {
                break;
            }

            if (num16 > 0) {
                positives++;
            } else if (num16 < 0) {
                negatives++;
            } else {
                zeros++;
            }
        }

        System.out.println(positives + " positives");
        System.out.println(zeros + " zeros");
        System.out.println(negatives + " negatives");

        // 16 - Write a program that prompts the user to input an integer and then outputs the
        //number with the digits reversed.
        //For example, if the input is 12345, the output should be 54321.

        System.out.print("Enter a number: ");
        int num17 = in.nextInt();

        String str2 = num17 + "";

        StringBuilder reverse2 = new StringBuilder();
        for (int i = str2.length() - 1; i >= 0; i--) {
            reverse2.append(str2.charAt(i));
        }

        System.out.println("Reversed integer: " + reverse2);

        // 17 - Write a program to enter the numbers till the user wants and at the end the
        //program should display the largest and smallest numbers entered.
        //enter the number : 4
        //enter the number : 5
        //enter the number : -1
        //enter the number : 9
        //the large number : 9
        //the small number : -1

        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        while (true) {
            System.out.print("Please enter a number: ");
            int num18 = in.nextInt();

            if (num18 > largest) {
                largest = num18;
            }

            if (num18 < smallest) {
                smallest = num18;
            }

            System.out.print("Want to stop? (yes/no): ");
            String answer = in.next();

            if (answer.equalsIgnoreCase("yes")) {
                break;
            }
        }

        System.out.println("The largest number: " + largest);
        System.out.println("The smallest number: " + smallest);

        // 18 - Determine and print the number of times the character ‘a’ appears in the input
        //entered by the user.
        //Enter String:
        //Java bootcamp
        //Output: Number of a's: 3

        System.out.print("Enter a string: ");
        in.nextLine();
        String str3 = in.nextLine();

        int aCount = 0;
        for (int i = 0; i < str3.length(); i++) {
            if (str3.charAt(i) == 'a') {
                aCount++;
            }
        }

        System.out.println("Number of a's: " + aCount);
    }
}
