package assignment1;

import java.util.Scanner;

public class coldPuter {
	 public static void main(String args[]) {
		//scan the user input 
	        Scanner in = new Scanner(System.in);
	        int numTemp = in.nextInt();
	        in.nextLine();
	        String tempStr = in.nextLine();
	    
	        int result = 0;
	        String[] temps = tempStr.split(" ");
	        int[] tempsArr = new int[numTemp];

	        for(int i = 0; i < numTemp; i++) {
	        	
	        	tempsArr[i] = Integer.parseInt(temps[i]);
	        	if(tempsArr[i] < 0) {
	        		result++;
	        	}
	        }
	        System.out.println(result);
	 }
}
