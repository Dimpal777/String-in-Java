public class ConvertingInteger {
    public static void main(String[] args) {
        Integer intValue = 42;
        Integer intValue2 = new Integer(100); // Using constructor
        
        // Convert Integer to String
        String intString = intValue.toString();
        System.out.println("Integer as String: " + intString);
        
        // Convert another Integer to String
        String intString2 = intValue2.toString();
        System.out.println("Another Integer as String: " + intString2);
    }
}