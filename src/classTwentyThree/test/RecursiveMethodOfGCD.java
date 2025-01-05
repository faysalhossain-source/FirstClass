package classTwentyThree.test;

public class RecursiveMethodOfGCD {

    public static void main(String[] args) {


        int num = 8, num1 = 64;
        int re=getGCD(num, num1);
        System.out.println(re);
    }

    public static int getGCD(int a, int b){

        if (b==0){
            return a;
        }else {
            return getGCD(b, a%b);
        }

    }
}
