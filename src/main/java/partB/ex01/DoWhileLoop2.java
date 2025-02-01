package partB.ex01;

public class DoWhileLoop2 {
    public static String doWhileLoopTwo(){
        String response = "";
        int i = 0;
        do {
            if (i % 2 == 0) {response += String.valueOf(i) + " ";}
            i++;
        } while (i < 21);

        return response;
    }

    public static void main(String[] args) {
        String outputDoWhileTwo = doWhileLoopTwo();
        System.out.println(outputDoWhileTwo);
    }
}
