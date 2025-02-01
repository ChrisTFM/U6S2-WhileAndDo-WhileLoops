package partB.ex02;

import java.util.Scanner;

public class WhileLoop2 {
    public static String whileLoopTwo(){
        String response = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose a number");
        int user = scan.nextInt();
        int i = 0;

        while (i < user) {
            System.out.println("Current Number: " + String.valueOf(i));
            i++;
        }


        return response;
    }

    public static void main(String[] args) {
        String outputWhileLoopTwo = whileLoopTwo();
        System.out.println(outputWhileLoopTwo);

    }
}
