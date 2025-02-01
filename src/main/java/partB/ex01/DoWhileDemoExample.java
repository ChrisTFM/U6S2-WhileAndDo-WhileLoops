package partB.ex01;

public class DoWhileDemoExample {
    public static String doWhile(){
        String response = "";

        int i=1;
        do {
            if(i%2==1)
                response += (" "+i);
            i++;
        }
        while(i<21);

        return response;
    }

    public static void main(String[] args) {
        String outputDoWhile = doWhile();
        System.out.println(outputDoWhile);
    }
}
