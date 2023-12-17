/* *****************************************************************************
 *  Name: Maksim Gorev
 *  Specification: Write a program HelloGoodbye.java that takes two names as 
 *                 command-line arguments and prints hello and goodbye messages 
 *                 as shown below (with the names for the hello message in 
 *                 the same order as the command-line arguments and with 
 *                 the names for the goodbye message in reverse order).
 *  
 **************************************************************************** */

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
