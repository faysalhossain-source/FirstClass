package MyPractice;

import java.util.Scanner;

public class ArithmeticOperator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num1,num2,result;

        System.out.println("Enter first number");
        num1 = input.nextInt();

        System.out.println("Enter second number");
        num2 = input.nextInt();


        result = num1+num2;
        System.out.println("sum " +result);

        result = num2-num1;
        System.out.println("sub "+result);

        result= num2*num1;
        System.out.println("multiplication "+result);

        result = num2/num1;
        System.out.println("divide "+result);

        result = num1 % num2;
        System.out.println("modulus "+result);
    }
}
