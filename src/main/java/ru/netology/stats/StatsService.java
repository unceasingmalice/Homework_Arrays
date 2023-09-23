package ru.netology.stats;

public class StatsService {
    public long summSales(long[] sales) {
        long allSales = 0; // сумму всех продаж;
        for (long sale : sales) {
            allSales += sale;
        }
        return allSales;
    }

    public long middleSales(long[] sales) {
        return summSales(sales) / sales.length; //среднюю сумму продаж в месяц;
    }

    public int maxSales(long[] sales) {
        int max = 0; //номер месяца, в котором был пик продаж, то есть осуществлены продажи на максимальную сумму*;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[max]) {
                max = i;
            }
        }
        return max + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }

    public int minSales(long[] sales) {
        int min = 0; // номер месяца, в котором был минимум продаж, то есть осуществлены продажи на минимальную сумму*;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[min]) {
                min = i;
            }
        }
        return min + 1; // месяца нумеруются с 1, а индексы массива с 0, нужно сдвинуть ответ на 1
    }


    public int lowerThanMiddle(long[] sales) {
        long middle = middleSales(sales); // количество месяцев, в которых продажи были ниже среднего (см. п.2);
        int counter = 0;

        for (long sale : sales) {
            if (sale < middle) {
                counter++;
            }
        }
        return counter;
    }

    public int moreThanMiddle(long[] sales) {
        long middle = middleSales(sales); // количество месяцев, в которых продажи были выше среднего (см. п.2).
        int counter = 0;

        for (long sale : sales) {
            if (sale > middle) {
                counter++;
            }
        }
        return counter;
    }


}
