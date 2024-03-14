public class ConvertingNumber {
    public static void main(String[] args) {
        int intValue = 42;
        double doubleValue = 3.14;
        long longValue = 1234567890L;
        
        // Convert int to String
        String intString = String.valueOf(intValue);
        System.out.println("Integer as String: " + intString);
        
        // Convert double to String
        String doubleString = String.valueOf(doubleValue);
        System.out.println("Double as String: " + doubleString);
        
        // Convert long to String
        String longString = String.valueOf(longValue);
        System.out.println("Long as String: " + longString);
    }
}
