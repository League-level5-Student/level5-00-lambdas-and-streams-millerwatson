package _01_Lambda_Methods;

public class LambdaMethods {
	public static void main(String[] args) {
		// 1. Look at the SpecialPrinter function interface.
	
		// Here is an example of calling the printCustomMessage method with a lambda.
		// This prints the passed in String 10 times.
		printCustomMessage((s)->{
			for(int i = 0; i < 10; i++) {
				System.out.println(s);
			}
		}, "repeat");
		
		//2. Call the printCustonMessage method using a lambda so that the String prints backwards.
		
		printCustomMessage((s)->{
			byte[] bytes= s.getBytes();
	        byte[] result = new byte[bytes.length];

	        for (int i = 0; i < bytes.length; i++)
	            result[i] = bytes[bytes.length - i - 1];
	 
	        System.out.println(new String(result));
		}, "backwards");
		
		//3. Call the printCustonMessage method using a lambda so that the String prints with a mix between upper an lower case characters.
		
		printCustomMessage((s)->{
			char[] chars = s.toCharArray();
			
	        for (int i = 0; i < chars.length; i++) {
	        	if (i%2 == 0) {
	        		System.out.print(Character.toUpperCase(chars[i]));
	        	} else {
	        		System.out.print(Character.toLowerCase(chars[i]));
	        	}
	        }
	        
	        System.out.println();
		}, "upperlower");
		
		//4. Call the printCustonMessage method using a lambda so that the String prints with a period in between each character.
		
		printCustomMessage((s)->{
			char[] chars = s.toCharArray();

	        for (int i = 0; i < chars.length * 2 - 1; i++) {
	            if (i % 2 == 0) {
	            	System.out.print(chars[i/2]);
	            } else {
	            	System.out.print(".");
	            }
	        }
	        
	        System.out.println();
	 
		}, "period");
		
		//5. Call the printCustonMessage method using a lambda so that the String prints without any vowels.
		printCustomMessage((s)->{
			char[] chars = s.toCharArray();

	        for (int i = 0; i < chars.length; i++)
	            if (Character.toLowerCase(chars[i]) == 'a' || Character.toLowerCase(chars[i]) == 'e' || Character.toLowerCase(chars[i]) == 'i' || Character.toLowerCase(chars[i]) == 'o' || Character.toLowerCase(chars[i]) == 'u') {
	            	
	            } else {
	            	System.out.print(chars[i]);
	            }
	 
		}, "vowels");
	
	}
	
	public static void printCustomMessage(SpecialPrinter sp, String value) {
		sp.printSpecial(value);
	}
}
	
