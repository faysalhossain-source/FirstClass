package MyPractice;public class CountLettersInArray {
    public static void main(String[] args) {
        // Generate an array of random lowercase letters
        char[] chars = createArray();
        System.out.println("The lowercase letters are:");
        displayArray(chars);

        // Count occurrences of each letter
        int[] counts = countLetters(chars);
        System.out.println("\nLetter occurrences:");
        displayCounts(counts);
    }

    // Method to create an array of 100 random lowercase letters
    public static char[] createArray() {
        char[] chars = new char[100];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ('a' + Math.random() * 26);
        }
        return chars;
    }

    // Method to display the array of characters
    public static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0) { // New line after every 20 characters
                System.out.println(chars[i]);
            } else {
                System.out.print(chars[i] + " ");
            }
        }
    }

    // Method to count occurrences of each letter in the array
    public static int[] countLetters(char[] chars) {
        int[] counts = new int[26]; // Array to store counts for 'a' to 'z'
        for (char c : chars) {
            counts[c - 'a']++; // Increment the count for the corresponding letter
        }
        return counts;
    }

    // Method to display the counts of each letter
    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) { // Display only if the letter appears at least once
                System.out.println((char) (i + 'a') + ": " + counts[i]);
            }
        }
    }
}