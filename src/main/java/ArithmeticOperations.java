public class ArithmeticOperations {
    public static void main (String [] args) {
        System.out.println("Арифметические операции с int:");
        int num1 = 9;
        int num2 = 5;
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        int quotient = num1 / num2;
        int remainder = num1 % num2;

        System.out.println("Сумма: " + sum);
        System.out.println("Разность: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Деление: " + quotient);
        System.out.println("Остаток: " + remainder);
        System.out.println();


        System.out.println("Aрифметические операции с int и double:");
        int a = 4;
        double numDouble = 2.5;
        double result1 = a + numDouble;
        double result2 = a * numDouble;
        System.out.println("Результат 1: " + result1);
        System.out.println("Результат 26 " + result2);
        System.out.println();

        System.out.println("Логические операции:");
        int b = 5;
        int c = 10;
        boolean result3 = b < c;
        boolean result4 = b > c;
        boolean result5 = b <= c;
        boolean result6 = b >=c;
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println();

        System.out.println("Переполнение:");
        int maxValue = Integer.MAX_VALUE; // 2147483647
        int overflowAdd = maxValue + 1;
        System.out.println(overflowAdd);

        int minValue = Integer.MIN_VALUE; // -2147483648
        int underflow = minValue - 1;
        System.out.println(underflow);

        byte d = 127;
        byte exam =(byte) (127 + 1);
        System.out.println(exam);

        int e = 32768;
        short exam1 = (short) (32768+1);
        System.out.println(exam1);
    }
}
