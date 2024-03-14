public class StringRegexMatch {
    public static void main(String[] args) {

        String text = "Hello, World!";
        
        String pattern = "Hello.*";
        
        // Check if the string matches the pattern
        boolean isMatch = text.matches(pattern);
        
        if (isMatch) {
            System.out.println("The string matches the pattern.");
        } else {
            System.out.println("The string does not match the pattern.");
        }
    }
}