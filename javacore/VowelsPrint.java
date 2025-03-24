package javacore;

public class VowelsPrint {
	public static void main(String[] args) {
	        // Define a string
	        String input = "sanjana";

	        // Loop through each character of the string
	        System.out.println("Vowels in the string:");
	        for (int i = 0; i < input.length(); i++) {
	            char ch = input.charAt(i);

	            // Check if the character is a vowel (both uppercase and lowercase)
	            if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ||
	                ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                System.out.println(ch);
	            }
	        }
	    }
	}

