class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");

        int i = -10;
        int sumEvenNum = 0;
        int sumOddNumb = 0;

        do {
            if (i % 2 == 0) {
                sumEvenNum += i;
            } else {
                sumOddNumb += i;
            }
            i++;
        } while (i <= 21);

        System.out.println("В промежутке [-10, 21] сумма четных чисел = " + sumEvenNum + ", а нечетных = " + sumOddNumb);

        System.out.println("\n2. Вывод чисел в интервале (min и max) в порядке убывания");

        for (i = 9; i > -1; i--) {
            System.out.print(i + " "); // Уточнить у ментора как правильно решить
        }

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");

        int num = 1234;
        int sum = 0;

        while (num > 0) {
            int resReverse = num % 10;
            num /= 10;
            sum += resReverse;
            System.out.print(resReverse + " ");
        }
        System.out.println("\nСумма цифр = " + sum);
    }
}