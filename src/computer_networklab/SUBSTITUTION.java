package computer_networklab;

import java.util.Scanner;

public class SUBSTITUTION {
	
	    public static StringBuffer encrypt(String text, int s) 
	    { 
	        StringBuffer result= new StringBuffer(); 
	  
	        for (int i=0; i<text.length(); i++) 
	        { 
	            if (Character.isUpperCase(text.charAt(i))) 
	            { 
	                char ch = (char)(((int)text.charAt(i) + 
	                                  s - 65) % 26 + 65); 
	                result.append(ch); 
	            } 
	            else
	            { 
	                char ch = (char)(((int)text.charAt(i) + 
	                                  s - 97) % 26 + 97); 
	                result.append(ch); 
	            } 
	        } 
	        return result; 
	    } 
	  
	    public static void main(String[] args) 
	    { 
	    	Scanner sc=new Scanner(System.in);
	        System.out.println("Name: MOHAMMAD RAVIL");
			System.out.println("Roll: 17BCS027");
			System.out.println("Program: caesar cipher");
			System.out.println("#Enter Message: ");
	        String text=sc.nextLine();
	        System.out.println("#Enter Key: ");
	        int key=sc.nextInt();
	        //String text = "ATTACKATONCE"; 
	       // int s = 4; 
	        System.out.println("Encrypted Message:-");
	        System.out.println("Cipher: " + encrypt(text, key)); 
	    } 
	} 


