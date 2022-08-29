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
        double resDiscountedPrice = (penPrice + bookPrice) - discountAmount;

        System.out.println("Сумма скидки = " + discountAmount + " руб.\n" +
                "Стоимость товара со скидкой = " + resDiscountedPrice + " руб.\n");

        System.out.println("3. Вывод на консоль слова JAVA");
        System.out.println("   J    a  v     v  a     \n   J   a a  v  v   a a    \nJ  J  aaaaa  V V  aaaaa   \n JJ  a     a  V  a     a\n");

        System.out.println("4. Отображение min и max значений числовых типов данных");
        byte numMaxByte = 127;
        short numMaxShort = 32_767;
        int numMaxInt = 2_147_483_647;
        long numMaxLong = 9_223_372_036_854_775_807l;

        System.out.println("Byte:\n" +
                "первоначальное значение = " + numMaxByte + "\n" +
                "значение после инкремента = " + numMaxByte++ + "\n" +
                "значение после декремента = " + numMaxByte-- + "\n" +
                "------------------------------------------------" + "\n" +
                "Short:\n" +
                "первоначальное значение = " + numMaxShort + "\n" +
                "значение после инкремента = " + numMaxShort++ + "\n" +
                "значение после декремента = " + numMaxShort-- + "\n" +
                "------------------------------------------------" + "\n" +
                "Int:\n" +
                "первоначальное значение = " + numMaxInt + "\n" +
                "значение после инкремента = " + numMaxInt++ + "\n" +
                "значение после декремента = " + numMaxInt-- + "\n" +
                "------------------------------------------------" + "\n" +
                "Long:\n" +
                "первоначальное значение = " + numMaxLong + "\n" +
                "значение после инкремента = " + numMaxLong++ + "\n" +
                "значение после декремента = " + numMaxLong--);

        System.out.println("\n5. Перестановка значений переменных");

        int numFirst = 2;
        int numSecond = 5;

        System.out.println("Способ 1. Перестановка значений с помощью третьей переменной:\n" +
                "Исходное значение переменной numFirst = " + numFirst + "\n" +
                "Исходное значение переменной numSecond = " + numSecond);

        int replaceVar = numFirst;
        numFirst = numSecond;
        numSecond = replaceVar;

        System.out.println("Новое значение переменной numFirst = " + numFirst + "\n" +
                "Новое значение переменной numSecond = " + numSecond + "\n");

        System.out.println("Способ 2. Перестановка значений с помощью арифметических операций:\n" +
                "Исходное значение переменной numFirst = " + numFirst + "\n" +
                "Исходное значение переменной numSecond = " + numSecond);

        numFirst += numSecond;
        numSecond = numFirst - numSecond;
        numFirst -= numSecond;

        System.out.println("Новое значение переменной numFirst = " + numFirst + "\n" +
                "Новое значение переменной numSecond = " + numSecond + "\n");

        System.out.println("Способ 3. Перестановка значений с помощью арифметических операций:\n" +
                "Исходное значение переменной numFirst = " + numFirst + "\n" +
                "Исходное значение переменной numSecond = " + numSecond);

        numFirst ^= numSecond;
        numSecond = numFirst ^ numSecond;
        numFirst ^= numSecond;

        System.out.println("Новое значение переменной numFirst = " + numFirst + "\n" +
                "Новое значение переменной numSecond = " + numSecond);

        System.out.println("\n6. Вывод символов и их кодов");

        numFirst = (char) 35;
        numSecond = (char) 38;
        char numThird = 64;
        char numFourth = 94;
        char numFifth = 95;

        System.out.println("Код символа" + "|" + "Символ\n" +
                "-----------" + "|" + "-----------\n" +
                numFirst + "         |" + (char) numFirst + "\n" +
                numSecond + "         |" + (char) numSecond + "\n" +
                (int) numThird + "         |" + (char) numThird + "\n" +
                (int) numFourth + "         |" + (char) numFourth + "\n" +
                (int) numFifth + "         |" + (char) numFifth);

        System.out.println("\n7. Отображение количества сотен, десятков и единиц числа");

        int num = 123;
        int numHundreds = num % 10;
        int numTens = num / 10 % 10;
        int numUnite = num / 100;

        System.out.println("Число N содержит:\n" +
                numHundreds + " сотен\n" +
                numTens + " десятков\n" +
                numUnite + " единиц");

        System.out.println("\n8. Вывод на консоль ASCII-арт Дюка");

        char asciiWhitespace = 32;
        char asciiSlash = 47;
        char asciiBackslash = 92;
        char asciiDash = 95;
        char asciiLeftQuotationMark = 40;
        char asciiRighttQuotationMark = 41;

        System.out.print(asciiWhitespace);
        System.out.print(asciiWhitespace);
        System.out.print(asciiWhitespace);
        System.out.print(asciiWhitespace);
        System.out.print(asciiSlash);
        System.out.print(asciiBackslash);
        System.out.println();
        System.out.print(asciiWhitespace);
        System.out.print(asciiWhitespace);
        System.out.print(asciiWhitespace);
        System.out.print(asciiSlash);
        System.out.print(asciiWhitespace);
        System.out.print(asciiWhitespace);
        System.out.print(asciiBackslash);
        System.out.println();
        System.out.print(asciiWhitespace);
        System.out.print(asciiWhitespace);
        System.out.print(asciiSlash);
        System.out.print(asciiDash);
        System.out.print(asciiLeftQuotationMark);
        System.out.print(asciiWhitespace);
        System.out.print(asciiRighttQuotationMark);
        System.out.print(asciiBackslash);
        System.out.println();
        System.out.print(asciiWhitespace);
        System.out.print(asciiSlash);
        System.out.print(asciiWhitespace);
        System.out.print(asciiWhitespace);
        System.out.print(asciiWhitespace);
        System.out.print(asciiWhitespace);
        System.out.print(asciiWhitespace);
        System.out.print(asciiWhitespace);
        System.out.print(asciiBackslash);
        System.out.println();
        System.out.print(asciiSlash);
        System.out.print(asciiDash);
        System.out.print(asciiDash);
        System.out.print(asciiDash);
        System.out.print(asciiDash);
        System.out.print(asciiSlash);
        System.out.print(asciiBackslash);
        System.out.print(asciiDash);
        System.out.print(asciiDash);
        System.out.print(asciiBackslash);

        System.out.println("\n9. Произведение и сумма цифр числа");

        num = 345;
        int firstDigit = num / 100;
        int secondDigit = num / 10 % 10;
        int thirdDigit = num % 10;

        System.out.println("Сумма цифр числа " + num + " = " + (firstDigit + secondDigit + thirdDigit) +
                "\nПроизведение цифр числа " + num + " = " + (firstDigit * secondDigit * thirdDigit));

        System.out.println("\n10. Преобразование секунд");

        int numOfSeconds = 86399;
        int convertingInHourse  = numOfSeconds / 3600;
        int convertingInMinutesForSeconds  = numOfSeconds - convertingInHourse * 3600;
        int convertingInMinutes = convertingInMinutesForSeconds / 60;
        int convertingInSeconds  = convertingInMinutesForSeconds - convertingInMinutes * 60;

        System.out.println(convertingInHourse + ":" + convertingInMinutes + ":" + convertingInSeconds);
    }
}