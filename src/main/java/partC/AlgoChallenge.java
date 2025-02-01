package partC;

public class AlgoChallenge {
    /* Problem 1
    Looking at your math worksheet, your given 2 number values of either positive or negative.
    Evaluate a problem and find out if one of those numbers is positive and the other is negative.

    Return true if one is negative and one is positive.

    An exception to this is if the parameter "negative" is true, then only return true if both are negative.

    Example:
    checkPosOrNeg(1, -1, false) --> true
    checkPosOrNeg(-1, 1, false) --> true
    checkPosOrNeg(-4, -5, true) --> true
     */


    /* Problem 2
    With the provided string, you need to exchange the first and last characters to create a new string.

    Return the new string.

    Example:
    exchange("code") --> "eodc
    exchange("a") --> "a"
    exchange("ab") --> "ba"
     */

    public static Boolean checkPosOrNeg(int a, int b, boolean negative) {
        if (negative == false) {
            if (a < 0 && b > 0) {return true;}
            else if (b < 0 && a > 0) {return true;}
        }
        else {if (a < 0 && b < 0) {return true;} }

        return false;
    }

    public static String exchange(String str) {
        String response = "";
        //Get last letter
        response += str.charAt(str.length() - 1);
        for (var i = 1; i < str.length() - 1; i++) {
            //Get everything in between
            response += str.charAt(i);
        }
        //Get the first letter
        response += str.charAt(0);
        return response;
    }

    public static void main(String[] args) {
        System.out.println(checkPosOrNeg(-4, 5, true));
        System.out.println(exchange("Uncle Bob love Super SOU"));
    }
}
