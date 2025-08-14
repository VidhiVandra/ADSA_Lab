import java.util.Scanner;

public class hashFunction {
    // Basic hash function using modulo
    public static int computeHash(String input, int hashSize) {
        int hash = 0;
        for (int i = 0; i < input.length(); i++) {
            hash = (hash * 31 + input.charAt(i)) % hashSize; // 31 is a common multiplier
        }
        return hash;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input
        System.out.print("Enter a string to hash: ");
        String input = scanner.nextLine();

        System.out.print("Enter the hash size : ");
        int hashSize = scanner.nextInt();

        // Compute and print the hash
        int hashValue = computeHash(input, hashSize);
        System.out.println("Hash value: " + hashValue);
    }

}
