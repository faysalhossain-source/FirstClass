package classTwentyThree;

public class ArrayFunction {
    public static void main(String[] args) {
        int[] array =  {2, 5, 6, 1, 3, 8, 9, 8, 12, 15, 18};


        int different = differentSumOfEvenOdd(array);
        System.out.println("Different between sum of even and odd: "+different);
    }

    public static int differentSumOfEvenOdd(int[] array){
        int sumOfEven = 0;
        int sumOfOdd = 0;
        for (int i: array){
            if (i%2==0){
                sumOfEven+=i;
            }else {
                sumOfOdd+=i;
            }

        }

        System.out.println("Sum of even number: "+sumOfEven);
        System.out.println("Sum of odd number: "+sumOfOdd);
        return sumOfEven -sumOfOdd;
    }
}
