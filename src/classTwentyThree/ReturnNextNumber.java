package classTwentyThree;

import java.util.Scanner;

public class ReturnNextNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter 1 or above number to check next number and 0 to exit: ");
        int testNumber= sc.nextInt();

        int test= 1;
        while (true){
            if (test>=testNumber){

                System.out.println("Enter any number to get next number: ");
                int num = sc.nextInt();
                int number =  getNextNumber(num);
                System.out.println(number);

            }else {
                break;
            }
        }
    }

    public static int getNextNumber(int number){

        return number+1;
    }
}
