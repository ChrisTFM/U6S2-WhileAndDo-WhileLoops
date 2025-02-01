package partB.ex01;

public class DoWhileLoop1 {
    public static String doWhileLoopOne(){
        String response = "";
        /* Create a program that has an array of integers with five unique values
        Utilize a do/while loop to print out each of the unique elements of the array*/
        int i = 0;
        int[] num = {2, 1, 5, 3, 6};
        do {
            response += String.valueOf(num[i]) + "\n";
            i++;
        }while (i < num.length);



        return response;
    }

    public static void main(String[] args) {
        String outputDoWhileOne = doWhileLoopOne();
        System.out.println(outputDoWhileOne);
    }
}
