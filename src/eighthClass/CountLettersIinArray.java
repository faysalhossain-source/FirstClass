package MyPractice;

public class CountLettersIinArray {
    public static void main(String[] args) {
        char[] chars = createArray();
        System.out.println("Array of characters:");
        displayArray(chars);

        int[] counts = countLetters(chars);
        System.out.println("\nLetters er occurrences:");
        displayCounts(counts);
    }

    public static char[] createArray() {
        char[] chars = new char[100];
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) ('a' + Math.random() * 26);
        }
        return chars;
    }

    public static void displayArray(char[] chars) {
        for (int i = 0; i < chars.length; i++) {
            if ((i + 1) % 20 == 0) {
                System.out.println(chars[i]);
            } else {
                System.out.print(chars[i] + " ");
            }
        }
    }

    public static int[] countLetters(char[] chars) {
        int[] counts = new int[26];
        for (char c : chars) {
            if (Character.isLetter(c)) {
                counts[c - 'a']++;
            }
        }
        return counts;
    }

    public static void displayCounts(int[] counts) {
        for (int i = 0; i < counts.length; i++) {
            if (counts[i] > 0) {
                System.out.println((char) (i + 'a') + ": " + counts[i]);
            }
        }
    }
}
