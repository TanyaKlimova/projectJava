package Lection02;

public class L02 {
    public static void main(String[] args) {
        System.out.println("Результат 1 >" + checkNumbers(30, 109));
        isPositive1(-20);
        String result = (isPositive2(20)) ? "Положительное число" : "Отрицательное число";
        System.out.println(result);
        methodPrintStringCount("Hello string", 5);
    }

    public static boolean checkNumbers(int first, int second) {
        return (first + second <= 20) && (first + second >= 10);
    }

    public static void isPositive1(int variable) {
        if (variable >= 0) {
            System.out.println(variable + "Положительное число");
        } else {
            System.out.println(variable + "Отрицательное число");
        }
    }

    public static boolean isPositive2(int variable) {
        return variable <= 0;
    }

    public static void methodPrintStringCount(String value, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("sting #" + i + ":" + value);
        }
    }
}
