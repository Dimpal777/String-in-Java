public class StringReplace{
    public static void main(String[] args) {
        String originalString = "Hello, World!";
        
        // Replace a character
        String replacedString = originalString.replace('o', 'x');
        System.out.println("Original string: " + originalString);
        System.out.println("Replaced string: " + replacedString);
        
        // Replace a substring
        replacedString = originalString.replace("World", "Universe");
        System.out.println("Original string: " + originalString);
        System.out.println("Replaced string: " + replacedString);
    }
}
