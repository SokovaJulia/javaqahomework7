package ru.netology.stats;

public class StatsService {
    public long sum(long[] sales) {
        long totalSale = 0;
        for (int i = 0; i < sales.length; i++) {
            totalSale += sales[i];
        }
    return totalSale;
    }
    public long average(long[] sales) {
        long totalSale = sum(sales);
        long averageSale  = totalSale / 12;
        return averageSale;
    }
    public int monthMaxSales(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] >= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }
    public int monthMinSales(long[] sales) {
        int month = 0;
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] <= sales[month]) {
                month = i;
            }
        }
        return month + 1;
    }

    public int monthLessAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales){
            if (sale < average(sales)) {
                counter++;
            }
        }
        return counter;
    }

    public int monthOverAverage(long[] sales) {
        int counter = 0;
        for (long sale : sales) {
            if (sale > average(sales)) {
                counter++;
            }
        }
        return counter;
    }
}
