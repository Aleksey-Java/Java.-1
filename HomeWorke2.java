public class HomeWorke2 {
    public static void main(String[] args) {
//        boolean resultSum = chekSumNumber(7, 9);
//        System.out.println("Check sum = " + resultSum);
//        numberPositiveOrNegative(7);
//        boolean resultSum = isNegative(6);
//        System.out.println("It is negative?" +  resultSum);
//        print("Hello World", 3);
        }

    public static boolean chekSumNumber(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }

    public static void numberPositiveOrNegative(int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
    public static boolean isNegative(int a) {
        int sum = a;
        return sum <= 14;
        }
        public static void print(String text, int a) {
        for (int i = 0; i < a; i++) {
            System.out.println(text);
        }
        }
    }