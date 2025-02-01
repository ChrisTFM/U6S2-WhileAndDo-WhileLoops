package partA.ex02;

import java.util.Scanner;

public class SumOfNums {
    public static String sum(){
        int UserInput = 0;
        Scanner scan = new Scanner(System.in);
        do{
            System.out.println("Input A Number less than 0");
            UserInput = scan.nextInt();
        }
        while (UserInput <= 0);
        String response = "Square Root: " + String.valueOf(Math.sqrt(UserInput))  ;

        return response;
    }
    public static void main(String args[]) {
        String outputSum = sum();
        System.out.println(outputSum);
    }
}
