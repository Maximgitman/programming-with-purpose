public class HelloGoodbye {
    public static void main(String[] args) {
        // Parse names from command line arguments
        String name1 = args[0];
        String name2 = args[1];

        // Print greeting
        System.out.println("Hello " + name1 + " and " + name2 + ".");
        System.out.println("Goodbye " + name2 + " and " + name1 + ".");
    }
}
