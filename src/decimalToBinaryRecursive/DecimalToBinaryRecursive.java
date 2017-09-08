package decimalToBinaryRecursive;

import java.util.Scanner;

public class DecimalToBinaryRecursive {
    /**
     * Given an integer N, its binary representation is
     * the binary representation of N/2 suffixed with the module of N % 2
     */
    public static String toBinary(int integer) {
        if (integer <= 1) {
            return Integer.toString(integer);
        }
        
        String result = toBinary(integer / 2) + Integer.toString(integer % 2);
        return result;
    }
    
    public static void main(String[] args) {
        System.out.print("Give me an integer and I will give you back its binary representation: ");
        
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextInt()) {
            int integer = scanner.nextInt();
            System.out.printf("Binary representation of %d: is %s\n", integer, toBinary(integer));
        }
        
        scanner.close();
    }
}
