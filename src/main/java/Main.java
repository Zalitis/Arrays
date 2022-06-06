public class Main {
    public static void main(String[] args) {
        StatsService service = new StatsService();
        int[] month = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int result = service.salesAmount(month);
        int result2 = service.averageAmount(month);
        int result3 = service.minSales(month);
        int result4 = service.maxSales(month);
        int result5 = service.monthBelowAverage(month);
        int result6 = service.monthAboveAverage(month);
        System.out.println(result);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}
