public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("\n1. Создание переменных и вывод их значений на консоль");

        byte deviceMemory = 8;
        short yearManufacture = 2020;
        int hardDiskCapacity = 500;
        long numOfCores = 8l;
        float processorFrequency = 3.20f;
        double versionOS = 12.1;
        char processorGeneration = 'M';
        boolean highlyEfficient = true;

        System.out.println("Характеристики:\n" +
                "Память устройства = " + deviceMemory + "\n" +
                "Год выпуска = " + yearManufacture + "\n" +
                "Объем жесткого диска = " + hardDiskCapacity + "\n" +
                "Количество ядер = " + numOfCores + "\n" +
                "Частота процессора = " + processorFrequency + "\n" +
                "Версия операционной системы = " + versionOS + "\n" +
                "Поколение процессора = " + processorGeneration + "\n" +
                "Высокоэффективный? = " + highlyEfficient + "\n");

        System.out.println("2. Расчет стоимости товара со скидкой");

        int penPrice = 100;
        int bookPrice = 200;
        byte discount = 11;
        double discountAmount = (penPrice + bookPrice) / 100 * discount;
        double discountPrice = (penPrice + bookPrice) - discountAmount;

        System.out.println("Сумма скидки = " + discountAmount + " руб.\n" +
                "Стоимость товара со скидкой = " + discountPrice + " руб.\n");

        System.out.println("3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a     \n   J   a a  v  v   a a    \nJ  J  aaaaa  V V  aaaaa   \n JJ  a     a  V  a     a\n");

        System.out.println("4. Отображение min и max значений числовых типов данных");
        byte numMaxByte = 127;
        short numMaxShort = 32_767;
        int numMaxInt = 2_147_483_647;
        long numMaxLong = 9_223_372_036_854_775_807l;

        System.out.println("Byte:\n" +
                "первоначальное значение = " + numMaxByte + "\n" +
                "значение после инкремента = " + ++numMaxByte + "\n" +
                "значение после декремента = " + --numMaxByte + "\n" +
                "------------------------------------------------" + "\n" +
                "Short:\n" +
                "первоначальное значение = " + numMaxShort + "\n" +
                "значение после инкремента = " + ++numMaxShort + "\n" +
                "значение после декремента = " + --numMaxShort + "\n" +
                "------------------------------------------------" + "\n" +
                "Int:\n" +
                "первоначальное значение = " + numMaxInt + "\n" +
                "значение после инкремента = " + ++numMaxInt + "\n" +
                "значение после декремента = " + --numMaxInt + "\n" +
                "------------------------------------------------" + "\n" +
                "Long:\n" +
                "первоначальное значение = " + numMaxLong + "\n" +
                "значение после инкремента = " + ++numMaxLong + "\n" +
                "значение после декремента = " + --numMaxLong);

        System.out.println("\n5. Перестановка значений переменных");

        int num1 = 2;
        int num2 = 5;

        System.out.println("Способ 1. Перестановка значений с помощью третьей переменной:\n" +
                "Исходное значение переменной num1 = " + num1 + "\n" +
                "Исходное значение переменной num2 = " + num2);

        int tmp = num1;
        num1 = num2;
        num2 = tmp;

        System.out.println("Новое значение переменной num1 = " + num1 + "\n" +
                "Новое значение переменной num2 = " + num2 + "\n");

        System.out.println("Способ 2. Перестановка значений с помощью арифметических операций:\n" +
                "Исходное значение переменной num1 = " + num1 + "\n" +
                "Исходное значение переменной num2 = " + num2);

        num1 += num2;
        num2 = num1 - num2;
        num1 -= num2;

        System.out.println("Новое значение переменной num1 = " + num1 + "\n" +
                "Новое значение переменной num2 = " + num2 + "\n");

        System.out.println("Способ 3. Перестановка значений с помощью арифметических операций:\n" +
                "Исходное значение переменной num1 = " + num1 + "\n" +
                "Исходное значение переменной num2 = " + num2);

        num1 ^= num2;
        num2 = num1 ^ num2;
        num1 ^= num2;

        System.out.println("Новое значение переменной num1 = " + num1 + "\n" +
                "Новое значение переменной num2 = " + num2);

        System.out.println("\n6. Вывод символов и их кодов");

        char code1 = 35;
        char code2 = 38;
        char code3 = 64;
        char code4 = 94;
        char code5 = 95;

        System.out.println((int) code1 + "-" + code1 + "\n" +
                (int) code2 + "-" + code2 + "\n" +
                (int) code3 + "-" + code3 + "\n" +
                (int) code4 + "-" + code4 + "\n" +
                (int) code5 + "-" + code5);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");

        int num = 123;
        int digit1 = num % 10;
        int digit2 = num / 10 % 10;
        int digit3 = num / 100;

        System.out.println("Число N содержит:\n" +
                digit1 + " сотен\n" +
                digit2 + " десятков\n" +
                digit3 + " единиц");

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");

        char space = ' ';
        char slash = '/';
        char backSlash = '\\';
        char dash = '_';
        char leftHand = '(';
        char rightHand = ')';

        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(slash);
        System.out.print(backSlash);
        System.out.println();
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(slash);
        System.out.print(space);
        System.out.print(space);
        System.out.print(backSlash);
        System.out.println();
        System.out.print(space);
        System.out.print(space);
        System.out.print(slash);
        System.out.print(dash);
        System.out.print(leftHand);
        System.out.print(space);
        System.out.print(rightHand);
        System.out.print(backSlash);
        System.out.println();
        System.out.print(space);
        System.out.print(slash);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(space);
        System.out.print(backSlash);
        System.out.println();
        System.out.print(slash);
        System.out.print(dash);
        System.out.print(dash);
        System.out.print(dash);
        System.out.print(dash);
        System.out.print(slash);
        System.out.print(backSlash);
        System.out.print(dash);
        System.out.print(dash);
        System.out.print(backSlash);

        System.out.println("\n9. Произведение и сумма цифр числа");

        num = 345;
        digit1 = num / 100;
        digit2 = num / 10 % 10;
        digit3 = num % 10;

        System.out.println("Сумма цифр числа " + num + " = " + (digit1 + digit2 + digit3) +
                "\nПроизведение цифр числа " + num + " = " + (digit1 * digit2 * digit3));

        System.out.println("\n10. Преобразование секунд");

        num = 86399;
        int hourse  = num / 3600;
        int remainingSeconds = num % 3600;
        int minutes  = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        System.out.println(hourse + ":" + minutes + ":" + seconds);
    }
}