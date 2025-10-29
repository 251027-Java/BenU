import java.util.Scanner;

public class HelloJava {

    //fields or properties

    //behaviors or methods

    //main method is the entry point by default but can be changed
    public static void main(String[] args) {
        // begin with a hello world program by convention
        System.out.println("Hello Java!");
        IO.println("Hello Java");
        // numerical types
        // int double float long short byte(small int values)
        // operations: + - / * %
        // logical, comparison: < > <= >= == !=
        int myInt = 0;
        double myDouble = 0.0;
        float myFloat = 0;
        long myLong = 0;
        short myShort = 0;
        byte myByte = 0;

        // non-numerical types

        // char can store letters numbers symbols and string is array of char
        // null is the absence of a value
        // control flow used with keywords such as if elseif else
        // try-catch continue break for while do-while


        Scanner scanner = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("Enter your grade: ");
                double grade = scanner.nextDouble();
                if (grade >= 0 && grade <= 100) {
                    if (grade >= 90) {
                        IO.println("Grade: A");
                        break;
                    } else if (grade >= 80) {
                        IO.println("Grade: B");
                        break;
                    } else if (grade >= 70) {
                        IO.println("Grade: C");
                        break;
                    } else if (grade >= 60) {
                        IO.println("Grade: D");
                        break;
                    } else {
                        IO.println("Grade: F");
                        break;
                    }
                } else {
                    IO.println("Grade can only be 0 - 100");
                }
            } catch (Exception e) {
                IO.println("Exception: " + e);
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
