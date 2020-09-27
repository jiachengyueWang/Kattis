package assignment1;

import java.util.Scanner;
import java.util.Arrays;

public class busNumbers {
	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
        int numBus = in.nextInt();
        in.nextLine();
        
        String[] busesStr = in.nextLine().split(" ");
        int[] buses = new int[busesStr.length];
        
        for(int i = 0 ;i < buses.length; i++) {
        	buses[i] = Integer.parseInt(busesStr[i]);
        	
        }
        
        //sort the buses
        Arrays.sort(buses);
        int[] buffer = new int[buses.length + 1];
        for(int i = 0 ;i < buses.length; i++) {
        	buffer[i] = buses[i];
        }
        buffer[buses.length] = 0;
        
        
        
        int pointer = 0, numSec = 1;
        String toConsole = "";
        

        for(int i = 0 ;i < buses.length; i++) {

        	pointer = i;
        	while(buffer[i] + 1 == buffer[i + 1]) {
        		
        		numSec++;
        		
        		i++;
        		
        	}
        	//once out of the consecutive loop, put numSec back to 1
        	
        	if(numSec > 2) {
    			//can be shorten 
        		numSec = 1;
        		toConsole = toConsole + buffer[pointer] + "-" + buffer[i] + " ";
    			
        	}else {
        		numSec = 1;
        		
        		toConsole = toConsole + buffer[pointer] + " ";
        		i = pointer;


         	}
        	
        }
        
        System.out.println(toConsole);

        
	}
	

	
	

}
