class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");

        int age = 21;
        if (age > 20) {
            System.out.println("Доступ разрешен!");
        } else {
            System.out.println("Вы слишком молод. Доступ запрещен!");
        }

        boolean isGenderMan = false;
        if (!isGenderMan) {
            System.out.println("Вы мужчина");
        } else {
            System.out.println("Вы не мужчина");
        }

        double height = 1.90;
        if (height < 1.80) {
            System.out.println("Нужно еще подрасти");
        } else {
            System.out.println("Поздравляем. Ваш рост подходит для участия в соревнованиях!");
        }

        char firstLatterName = "Dmitriy".charAt(0);
        if (firstLatterName == 'M') {
            System.out.println("Ваше имя начинается на " + firstLatterName);
        } else if (firstLatterName == 'I') {
            System.out.println("Ваше имя начинается на " + firstLatterName);
        } else {
            System.out.println("Вы уникальный. Ваше имя начинается на " + firstLatterName);
        }

        System.out.println("\n2. Поиск max и min числа");

        int num = 11;
        int num1 = 11;
        if (num > num1) {
            System.out.println("Максимальное число = " + num + ". Минимальное число = " + num1);
        } else if (num1 > num) {
            System.out.println("Максимальное число = " + num1 + ". Минимальное число = " + num);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Работа с числом");

        num = -54;
        boolean isEvenNum = num % 2 == 0;
        if (num != 0) {
            if (isEvenNum) {
                System.out.println("Число " + num + " является четным");
            } else {
                System.out.println("Число " + num + " является нечетным");
            }
            if (num > 0) {
                System.out.println("Число " + num + " является положительным");
            } else {
                System.out.println("Число " + num + " является отрицательным");
            }
        } else {
            System.out.println("Число является нулем");
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");

        num = 999;
        num1 = 321;

        int digit1 = num / 100;
        int digit2 = num / 10 % 10;
        int digit3 = num % 10;

        int digit4 = num1 / 100;
        int digit5 = num1 / 10 % 10;
        int digit6 = num1 % 10;

        System.out.println("Число 1 = " + num + " | Число 2 = " + num1);
        if (digit1 == digit4) {
            System.out.println("В " + digit4 + " разряде сотен обнаружена одинаковая цифра = " + digit1);
        }
        if (digit2 == digit5) {
            System.out.println("В " + digit5 + " разряде десятков обнаружена одинаковая цифра = " + digit2);
        }
        if (digit3 == digit6) {
            System.out.println("В " + digit6 + " разряде единиц обнаружена одинаковая цифра = " + digit3);
        } else {
            System.out.println("Одинаковых цифр в числах " + num + " и " + num1 + " не найдено");
        }

        System.out.println("\n5. Определение буквы, числа или символа по их коду");

        char ch = '\u0057';
        if (ch >= 'a' && ch <= 'z') {
            System.out.println("Символ " + ch + " содержит маленькую букву");
        } else if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Символ " + ch + " содержит большую букву");
        } else if (ch >= '0' && ch <= '9') {
            System.out.println("Символ " + ch + " является числом");
        } else {
            System.out.println("Символ " + ch + " не буква и не число");
        }

        System.out.println("\n6. Определение суммы вклада и начисленных банком %");

        int deposit = 300_000;
        int percentDeposit = 0;
        int sum = 0;

        if (deposit < 100_000) {
            percentDeposit = (deposit * 5) / 100;
            sum = deposit + percentDeposit;
            System.out.println("Сумма вклада: " + deposit + " руб. Начислено % " + percentDeposit + " руб. Итоговая сумма: " + sum + " руб.");
        } else if (deposit > 100_000 || deposit < 300_000) {
            percentDeposit = (deposit * 7) / 100;
            sum = deposit + percentDeposit;
            System.out.println("Сумма вклада: " + deposit + " руб. Начислено % " + percentDeposit + " руб. Итоговая сумма: " + sum + " руб.");
        } else {
            percentDeposit = (deposit * 10) / 100;
            sum = deposit + percentDeposit;
            System.out.println("Сумма вклада: " + deposit + " руб. Начислено % " + percentDeposit + " руб.. Итоговая сумма: " + sum + " руб.");
        }

        System.out.println("\n7. Определение оценки по предметам");

        int historyPercent = 59;
        int programmingPercent = 91;
        int historyScore = 0;
        int programmingScore = 0;

        if (historyPercent <= 60) {
            historyScore = 2;
            System.out.println("Оценка по истории " + historyScore);
        }
        if (programmingPercent <= 60) {
            programmingScore = 2;
            System.out.println("Оценка по программированию " + programmingScore);
        }
        if (historyPercent > 60 && historyPercent <= 73) {
            historyScore = 3;
            System.out.println("Оценка по истории " + historyScore);
        }
        if (programmingPercent > 60 && programmingPercent <= 73) {
            programmingScore = 3;
            System.out.println("Оценка по программированию " + programmingScore);
        }
        if (historyPercent > 73 && historyPercent <= 91) {
            historyScore = 4;
            System.out.println("Оценка по истории " + historyScore);
        }
        if (programmingPercent > 73 && programmingPercent <= 91) {
            programmingScore = 4;
            System.out.println("Оценка по программированию " + programmingScore);
        }
        if (historyPercent > 91) {
            historyScore = 5;
            System.out.println("Оценка по истории " + historyScore);
        }
        if (programmingPercent > 91) {
            programmingScore = 5;
            System.out.println("Оценка по программированию " + programmingScore);
        }

        double averageScore = (historyScore + programmingScore) / 2;
        System.out.println("Средний балл оценок по предметам " + averageScore);

        int averagePercent = (historyPercent + programmingPercent) / 2;
        System.out.println("Средний % по предметам " + averagePercent);

        System.out.println("\n8. Расчет прибыли");

        int rent = 5_000;
        int averegaSale = 13_000;
        int cost = 9_000;

        int profit = (averegaSale - cost) - rent;
        if (profit > 0) {
            System.out.println("Прибыль за год: +" + profit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + profit + " руб.");
        }

        System.out.println("\n9. Подсчет количества банкнот");

        int balance = 567; // сумма для снятия
        int availableCash1 = 50; // доступные банкноты для снятия номиналом 1
        int availableCash10 = 5; // доступные банкноты для снятия номиналом 10
        int availableCash100 = 200; // доступные банкноты для снятия номиналом 100
        int sumATM = availableCash1 + (availableCash10 * 10) + (availableCash100 * 100); // всего банкнот в банкомате
         
        int withdraw1 = 0;
        int withdraw10 = 0;
        int withdraw100 = 0;

        digit1 = balance / 100;
        digit2 = balance / 10 % 10;
        digit3 = balance % 10;

        if (balance != 0 && balance <= sumATM) {
            if (availableCash100 > 0 && availableCash100 <= digit1) {
                withdraw100 = availableCash100;
                // System.out.println("Забираю - " + availableCash100 + " сотни. Остаток сотен в банкомате - " + (availableCash100 -= availableCash100));
            } if (availableCash100 > digit1) {
                withdraw100 = digit1;
                // System.out.println("Забираю - " + digit1 + " сотни. Остаток сотен в банкомате - " + (availableCash100 -= digit1));
            } if (availableCash10 > 0 && availableCash10 <= digit2) {
                withdraw10 = availableCash10;
                // System.out.println("Забираю - " + availableCash10 + " десятки. Остаток десяток в банкомате - " + (availableCash10 -= availableCash10));
            } if (availableCash10 > digit2) {
                withdraw10 = digit2;
                // System.out.println("Забираю - " + digit2 + " десятки. Остаток десяток в банкомате - " + (availableCash10 -= digit2));
            } if (availableCash1 > 0 && availableCash1 <= digit3) {
                withdraw1 = balance - ((withdraw10 * 10) + (withdraw100 * 100));
                // System.out.println("Забираю - " + withdraw1 + " единицы. Остаток единиц в банкомате - " + (availableCash1 -= withdraw1));
            } if (availableCash1 > digit3) {
                withdraw1 = balance - ((withdraw10 * 10) + (withdraw100 * 100));
                // System.out.println("Забираю - " + withdraw1 + " единицы. Остаток единиц в банкомате - " + (availableCash1 -= withdraw1));
            }
            int sumWithdraw = withdraw1 + (withdraw10 * 10) + (withdraw100 * 100);
            System.out.println("Доступные номиналы для снятия банкнот:\n" + 
                    "1 - " + availableCash1 + "\n" +
                    "10 - " + availableCash10 + "\n" +
                    "100 - " + availableCash100 + "\n" +
                    "\nСумма для снятия: " + balance +"\nКоличество банкнот к снятию: " + 
                    "1 - " + withdraw1 + 
                    ", 10 - " + withdraw10 + 
                    ", 100 - " + withdraw100 + " = " + sumWithdraw);
        } else {
            System.out.println("Ошибка! Сумма для снятия должна быть не менее 0 и не более " + sumATM);
        }


    }
}