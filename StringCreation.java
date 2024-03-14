public class StringCreation{
    public static void main(String[] args) {
        // Using String literals
        String str1 = "Hello, World!";

        // Using the new keyword with the String class
        String str2 = new String("Hello, World!");

        // Using StringBuilder class
        StringBuilder sb = new StringBuilder();
        sb.append("Hello");
        sb.append(", ");
        sb.append("World!");
        String str3 = sb.toString();

        // Using StringBuffer class
        StringBuffer buffer = new StringBuffer();
        buffer.append("Hello");
        buffer.append(", ");
        buffer.append("World!");
        String str4 = buffer.toString();

        // Using concatenation
        String str5 = "Hello" + ", " + "World!";

        // Using String.format() method
        String str6 = String.format("Hello, %s!", "World");

        // Using String.concat() method
        String str7 = "Hello".concat(", World!");

        // Using String.join() method
        String str8 = String.join(", ", "Hello", "World!");

        // Printing out the strings
        System.out.println("str1: " + str1);
        System.out.println("str2: " + str2);
        System.out.println("str3: " + str3);
        System.out.println("str4: " + str4);
        System.out.println("str5: " + str5);
        System.out.println("str6: " + str6);
        System.out.println("str7: " + str7);
        System.out.println("str8: " + str8);
    }
}