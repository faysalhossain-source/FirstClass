package classTwentyThree;

public class SumCheck {

    public static void main(String[] args) {

        boolean check = checkSumNumber(50, 50);
        System.out.println(check);
    }

    public static boolean checkSumNumber(int num1, int num2){

        int sum =  num1+num2;

        if (sum<100)
            return true;
        else
            return false;
    }
}
