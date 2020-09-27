package assignment1;

import java.util.Scanner;

public class timeBomb {

	public static void main(String args[]) {
		
		//System.out.println();
		
		Scanner in = new Scanner(System.in);
		String toConsole = "";
		String result = "";
		
		
		String setA = "***";	//0 2 3 5 6 7 8 9
        String setB = "  *";	//1
        String setC = "* *";	//4
        String setD = "*  ";
        
        String line1 = in.nextLine();
        String line2 = in.nextLine();
        String line3 = in.nextLine();
        String line4 = in.nextLine();
        String line5 = in.nextLine();
       
        //get the number of digits
        int numDig = (line1.length() + 1) / 4;
        
        String[] digits1 = new String[numDig];
        String[] digits2 = new String[numDig];
        String[] digits3 = new String[numDig];
        String[] digits4 = new String[numDig];
        String[] digits5 = new String[numDig];
        
        digits1 = chop(line1, numDig);
        digits2 = chop(line2, numDig);
        digits3 = chop(line3, numDig);
        digits4 = chop(line4, numDig);
        digits5 = chop(line5, numDig);
        
        
        //get the digits
        for(int i = 0; i < numDig; i++) {
        	if(digits1[i].contentEquals(setA)) {
        		
        		if(digits2[i].contentEquals(setC) && digits3[i].contentEquals(setC)
        				&& digits4[i].contentEquals(setC) && digits5[i].contentEquals(setA)) {
        			//0
        			result = result + "0";
        			
        		}else if(digits2[i].contentEquals(setB) && digits3[i].contentEquals(setA)
        				 && digits5[i].contentEquals(setA)) {
        			if(digits4[i].contentEquals(setD)) {
        				//2
        				result = result + "2";
        				
        			}else if(digits4[i].contentEquals(setB)) {
        				//3
        				result = result + "3";
        			}
        			
        		}else if (digits2[i].contentEquals(setD) && digits3[i].contentEquals(setA)
       				 && digits5[i].contentEquals(setA)) {
        			if(digits4[i].contentEquals(setB)) {
        				//5
        				result = result + "5";
        				
        				
        			}else if (digits4[i].contentEquals(setC)) {
        				//6
        				result = result + "6";
        			}
        			
        			
        		}else if (digits2[i].contentEquals(setB) && digits3[i].contentEquals(setB)
            			&& digits4[i].contentEquals(setB) && digits5[i].contentEquals(setB)) {
        			//7
        			result = result + "7";
        			
        		}else if (digits2[i].contentEquals(setC) && digits3[i].contentEquals(setA)
          				 && digits5[i].contentEquals(setA)){
        			if(digits4[i].contentEquals(setC)) {
        				//8
        				result = result + "8";
        						
        			}else if (digits4[i].contentEquals(setB)) {
        				//9
        				result = result + "9";
        				
        			}
        			
        		}else {
        			//invalid digits
            		
            		toConsole = "BOOM";
            		break;
        			
        		}

        	}else if (digits1[i].contentEquals(setB) && digits2[i].contentEquals(setB) && digits3[i].contentEquals(setB)
        			&& digits4[i].contentEquals(setB) && digits5[i].contentEquals(setB)) {
        		//1
        		result = result + "1";
        		
        		
        	}else if(digits1[i].contentEquals(setC) && digits2[i].contentEquals(setC)
        			&& digits3[i].contentEquals(setA) && digits4[i].contentEquals(setB) && digits5[i].contentEquals(setB)) {
        		//4
        		result = result + "4";
        		
        	}else {
        		//invalid digits
        		toConsole = "BOOM";
        		break;

        	}
        }
        
        if(Integer.parseInt(result) % 6 == 0) {
        	//BEER
        	toConsole = "BEER!!";
        	
        	
        }else {
        	toConsole = "BOOM!!";
        }
        
        System.out.println(toConsole);
        
        
        
        
	}
	
	public static String[] chop(String line, int num) {
		String[] chopped = new String[num];
		
		String temp = "";
		int pointer = 0;
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < 3; j++) {
				temp = temp + line.charAt(pointer);
				pointer++;
			}	
			chopped[i] = temp;
			temp = "";
			pointer++;
		}
		
	
		
		return chopped;
	}
}
