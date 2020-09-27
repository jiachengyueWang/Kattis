package assignment1;

import java.util.Scanner;
public class Oddities{
    
    public static void main(String args[]) {
        //scan the user input 
        Scanner in = new Scanner(System.in);
        int numTestCase = in.nextInt();
        int userInput = 0;
            
        String result = "";
        //test cases
        for(int i = 0; i < numTestCase; i++) {
            userInput = in.nextInt();
            if (userInput % 2 == 0) {
                result = result + userInput + " is even\n";
            }else {
                result = result + userInput + " is odd\n";
            }
        }
        System.out.println(result);
    }

}
