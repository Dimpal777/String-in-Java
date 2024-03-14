public class StringSearching {
    public static void main(String[] args) {
        // Define a string
        String originalString = "Hello, World!";
        
        // Search for the index of a substring "World" in the original string
        int index1 = originalString.indexOf("World");
        
        if (index1 != -1) {
            System.out.println("Substring 'World' found at index: " + index1);
        } else {
            System.out.println("Substring 'World' not found in the original string.");
        }
        
        // Search for the index of a character 'o' in the original string
        int index2 = originalString.indexOf('o');
        
        if (index2 != -1) {
            System.out.println("Character 'o' found at index: " + index2);
        } else {
            System.out.println("Character 'o' not found in the original string.");
        }
    }
}