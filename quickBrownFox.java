package assignment1;

import java.util.Scanner;

public class quickBrownFox {

	public static void main(String args[]) {
		
		
//		System.out.println(ascii[4]);
		
		//Capital: 65-90
		//lowercase: 97-122
		
		Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        in.nextLine();
        String toConsole = "";
        
        
        
        for(int i = 0; i < num; i++) {
        	String phrase = in.nextLine();
        	toConsole = toConsole + isPangram(phrase) + "\n";
            
        }
        System.out.println(toConsole);
        
        
	}
	
	public static String isPangram(String phrase) {
		int value;
		int[] ascii = new int[26];
		String result = "missing ";
		boolean isPanagram = true;
		
		//change the ascii array
		for(int i = 0; i < phrase.length(); i++) {
        	value = phrase.charAt(i);
        	
        	if(value <= 90 && value >= 65) {
        		//if a lowercase letter
        		ascii[value - 65] = 1;
        		
        	}else if(value <= 122 && value >= 97) {
        		//if a uppercase letter
        		ascii[value - 97] = 1;
        	}
        }
		
		for(int j = 0; j < 26; j++) {
			if(ascii[j] == 0) {
				isPanagram = false;
				result = result + (char)(j + 97);
			}
		}
		if(isPanagram) {
			result = "pangram";
		}
		return result;
		
	}
}
