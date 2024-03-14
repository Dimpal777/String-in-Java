public class SubString {
    public static void main(String[] args) {
        // Define a string
        String originalString = "Hello, World!";
        
        String substring1 = originalString.substring(7);
        System.out.println("Substring 1: " + substring1);
        
        String substring2 = originalString.substring(0, 5);
        System.out.println("Substring 2: " + substring2);
    }
}