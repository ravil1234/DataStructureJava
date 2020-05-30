package computer_networklab;

import java.util.Scanner;

public class VIGENERE_CIPHER {
	static String generateKey(String str, String key) 
	{ 
	    int x = str.length(); 
	  
	    for (int i = 0; ; i++) 
	    { 
	        if (x == i) 
	            i = 0; 
	        if (key.length() == str.length()) 
	            break; 
	        key+=(key.charAt(i)); 
	    } 
	    return key; 
	} 
	static String cipherText(String str, String key) 
	{ 
	    String cipher_text=""; 
	  
	    for (int i = 0; i < str.length(); i++) 
	    { 
	        int x = (str.charAt(i) + key.charAt(i)) %26; 
	  
	        x += 'A'; 
	  
	        cipher_text+=(char)(x); 
	    } 
	    return cipher_text; 
	} 
	static String originalText(String cipher_text, String key) 
	{ 
	    String orig_text=""; 
	  
	    for (int i = 0 ; i < cipher_text.length() && i < key.length(); i++) 
	    { 
	        
	        int x = (cipher_text.charAt(i) -  
	                    key.charAt(i) + 26) %26; 
	        x += 'A'; 
	        orig_text+=(char)(x); 
	    } 
	    return orig_text; 
	} 
	public static void main(String[] args)  
	{ 
		Scanner sc=new Scanner(System.in);
        System.out.println("Name: MOHAMMAD RAVIL");
		System.out.println("Roll: 17BCS027");
		System.out.println("Program: VIGENERE cipher");
		System.out.println("#Enter Message: ");
        String s=sc.nextLine();
        System.out.println("#Enter Key: ");
        String key=sc.next();
        System.out.println("Encrypted Message:-");
	   // String str = "GEEKSFORGEEKS"; 
	    //String keyword = "AYUSH"; 
	    key = generateKey(s, key); 
	    String cipher_text = cipherText(s, key); 
	    System.out.println(cipher_text);
	    System.out.println("Decrypted Message:-");
	    System.out.println(originalText(cipher_text, key)); 
	    } 
	} 

