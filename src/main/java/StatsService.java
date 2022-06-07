public class StatsService {
    public int salesAmount(int[] salesMonth) {
        int sum = 0;
        for (int i = 0; i < salesMonth.length; i++) {
            sum += salesMonth[i];
        }
        return sum;
    }

    public int averageAmount(int[] salesMonth) {
        int sum = salesAmount(salesMonth);
        int month = salesMonth.length;
        int average = sum / month;
        return average;
    }

    public int minSales(int[] sales) {
        int minMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale <= sales[minMonth]) {
                minMonth = month;
            }
            month = month + 1;
        }
        return minMonth + 1;
    }

    public int maxSales(int[] sales) {
        int maxMonth = 0;
        int month = 0;
        for (int sale : sales) {
            if (sale >= sales[maxMonth]) {
                maxMonth = month;
            }
            month = month + 1;
        }
        return maxMonth + 1;
    }

    public int monthBelowAverage(int[] salesMonth) {
        int below = 0;
        int average = averageAmount(salesMonth);
        for (int sale : salesMonth) {
            if (sale < average) {
                below++;
            }
        }
        return below;
    }

    public int monthAboveAverage(int[] salesMonth) {
        int below = 0;
        int average = averageAmount(salesMonth);
        for (int sale : salesMonth) {
            if (sale > average) {
                below++;
            }
        }
        return below;
    }
}

