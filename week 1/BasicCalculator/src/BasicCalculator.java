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
        System.out.println("Please select operation: ");
        type = userInput.nextLine();


        System.out.println("(A)dd");
        System.out.println("(s)ubtract");
        System.out.println("(m)ultiply");
        System.out.println("(d)ivide");


        if (type.equalsIgnoreCase("")) {
            totalNum = firstNumber + secondNumber;
            System.out.println("Order total: $" + totalNum);}


     if (type.equalsIgnoreCase("")) {
        totalNum = firstNumber - secondNumber;
        System.out.println("Order total: $" + totalNum);
     }

     if (type.equalsIgnoreCase("")) {
        totalNum = firstNumber * secondNumber;
        System.out.println("Order total: $" + totalNum);
    }
     if (type.equalsIgnoreCase("")) {
           totalNum =(firstNumber / secondNumber);
            System.out.println("Order total: $" + totalNum);
        }

}}










        //System.out.println("Answer");