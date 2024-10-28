package task;

public class Vowels {
	    // Custom exception for no vowels found
	    static class NoVowelsException extends Exception {
	        public NoVowelsException(String message) {
	            super(message);
	        }
	    }

	    // Method to check for vowels
	    public static void checkForVowels(String x) throws NoVowelsException {
	        if (x == null || x.isEmpty()) {
	            throw new NoVowelsException("Input string is null or empty.");
	        }
	        
	        // Check for vowels
	        if (!x.toLowerCase().matches(".*[aeiou].*")) {
	            throw new NoVowelsException("The string does not contain any vowels.");
	        }

	        System.out.println("The string contains vowels.");
	    }

	    public static void main(String[] args) {
	        String input = "sky"; // Example input
	        
	        try {
	            checkForVowels(input);
	        } catch (NoVowelsException e) {
	            System.err.println(e.getMessage());
	        }
	}

}
