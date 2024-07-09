package demo;

public class Calculations {

    public static int sum(int op1, int op2){
        int res = op1+op2;
        return res;
    }

    public static int sub(int op1, int op2){
        int res = op1-op2;
        return res;
    }

    public static int divide1(int op1, int op2){
        int res = 0;
        try {
            res = op1 / op2;
        } catch (ArithmeticException e) {
            System.out.println("Error. division by 0");
        }
        return res;
    }

    public static int divide(int op1, int op2) {
        return op1 / op2;
    }

    public static int multiply(int op1, int op2){
        return op1*op2;
    }

    public static int sumOfDigits(int number) {
        int res = 0;
        number = Math.abs(number);
        while (number != 0) {
            res += number % 10;
            number /= 10;
        }
        return res;
    }

    public static int maxDigit(int number){
        int res = 0;
        number = Math.abs(number);
        while (number > 0) {
            int digit = number % 10;
            if (digit > res) {
                res = digit;
            }
            number /= 10;
        }
        return res;
    }

    public static boolean isDivideOn(int number, int dividor) {
        return dividor != 0 && number % dividor == 0;
    }

}
