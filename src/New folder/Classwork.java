package SecondClass;

import java.util.Scanner;

public class Classwork {
        public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)) {
            System.out.print("Enter an integer in seconds: ");
            int seconds = input.nextInt();

            int minutes = seconds/60;
            int remainingSeconds = seconds % 60;
            System.out.println(seconds+"second is" + minutes + "minutes and" + remainingSeconds + "seconds");
        }
    }
    }

