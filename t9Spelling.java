package assignment1;

import java.util.Scanner;

public class t9Spelling {
	
	
	static String[] alphabet = {"2", "22", "222", "3", "33", "333", "4", "44", "444", 
			"5", "55", "555", "6", "66", "666","7", "77", "777", "7777",
			"8", "88", "888", "9", "99", "999", "9999", "0"};
	
	
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);
        int numTest = in.nextInt();
        in.nextLine();
        
        String result = "";
        String test = "";
        
        for(int i = 0; i < numTest; i++) {
        	test = in.nextLine();
        	
        	result = result + "Case #" + (i + 1) + ": " + getSequence(test) + "\n";
		
        }
        
        System.out.println(result);
	}
	
	
	public static String getSequence(String test) {
		
		String result = "";
		int value, lastValue = 0;
		 
		for(int i = 0; i < test.length(); i++) {
			
			value = test.charAt(i);
			if(value == 32) {
				value = 123;
			}
			

			if(i != 0) {
				if(alphabet[value - 97].charAt(0) == alphabet[lastValue - 97].charAt(0)) {
					result = result + " ";
				}
			}
			result = result + alphabet[value - 97];
			
			lastValue = value;

		}
		
		
		return result;
		
	}
		

}
