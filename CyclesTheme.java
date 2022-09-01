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
        
    }
}