package assignment1;

import java.util.Scanner;

public class eraseSecurely {

	public static void main (String args[]) {
		Scanner in = new Scanner(System.in);
        int numDel = in.nextInt();
        in.nextLine();
        
        String beforeDel = in.nextLine(); 
        
        String afterDel = in.nextLine();
        String temp = "";
        
        if(numDel % 2 == 0) {
        	//delete even times
        	temp = beforeDel;
        	
        }else {
        	//delete odd times
        	for(int i = 0; i < beforeDel.length(); i++) {
        		if(beforeDel.charAt(i) == '0') {
        			temp = temp + "1";
        		}else if(beforeDel.charAt(i) == '1'){
        			temp = temp + "0";
        		}
        	}
        	
        }
       
        
        if(afterDel.equals(temp)) {
        	System.out.println("Deletion succeeded");
        }else {
        	System.out.println("Deletion failed");
        }
	}
}
