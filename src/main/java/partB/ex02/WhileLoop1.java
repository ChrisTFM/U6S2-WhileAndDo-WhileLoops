package partB.ex02;

public class WhileLoop1 {
    public static String whileLoopOne(){
        String response = "";
        int i = 0;

        while (i < 1001) {
            i++;
            if (i % 2 == 0) {System.out.println(i);}
        }


        return response;
    }

    public static void main(String[] args) {
        String outputWhileLoopOne = whileLoopOne();
        System.out.println(outputWhileLoopOne);
    }
}
