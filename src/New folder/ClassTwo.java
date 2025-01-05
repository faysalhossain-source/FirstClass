package SecondClass;

import java.util.Scanner;

public class ClassTwo{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        String name = sc.nextLine();
        System.out.println("Enter your Age");
        int age = sc.nextInt();

        System.out.println("Hi"+name + "! You are " + age + "years young");
        System.out.println(ClassTwo.printHi(name,age));
        System.out.println("Sum of two fixed variable is" + sum(4545, 555));
    }

    public static int sum(int a, int b){
        return a+b;
    }
    public static String printHi(String name, int age) {
        return "Hi" + name + "you are "+ age + "years old";
    }
}