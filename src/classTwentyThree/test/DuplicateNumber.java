package classTwentyThree.test;

import java.util.Arrays;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] array = {2, 5, 6, 1, 3, 8, 9, 12, 15, 18};
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));

        boolean hasDuplicate = false;
        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    hasDuplicate = true;
                    System.out.println("Duplicate found: " + array[i]);
                }
            }


        }
        if (!hasDuplicate) {
            System.out.println("Duplicate not found.");
        }

    }
}
