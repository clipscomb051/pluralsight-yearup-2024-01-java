import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {

        //declare variable
        Scanner userInput = new Scanner(System.in);
        String type;
        int firstNumber;
        int secondNumber;
        double totalNum;


        //input
        System.out.println("First Number");
        firstNumber = userInput.nextInt();
        System.out.println("Second Number");
        secondNumber = userInput.nextInt();
        userInput.nextLine();


        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("Please select operation: ");
        type = userInput.nextLine();


        if (type.equalsIgnoreCase("A")) {
            totalNum = firstNumber + secondNumber;
            System.out.println("Order total: $" + totalNum);
        }


        if (type.equalsIgnoreCase("s")) {
            totalNum = firstNumber - secondNumber;
            System.out.println("Order total: $" + totalNum);
        }

        if (type.equalsIgnoreCase("m")) {
            totalNum = firstNumber * secondNumber;
            System.out.println("Order total: $" + totalNum);
        }
        if (type.equalsIgnoreCase("d")) {
            totalNum = (firstNumber / secondNumber);
            System.out.println("Order total: $" + totalNum);
        }

    }
}


//System.out.println("Answer");