import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    void testNumberOne() {
        StatsService service = new StatsService();
        int[] month = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 180;
        int fact = service.salesAmount(month);
        Assertions.assertEquals(expected, fact);
    }

    @Test
    void testNumberTwo() {
        StatsService service = new StatsService();
        int[] month = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 15;
        int fact = service.averageAmount(month);
        Assertions.assertEquals(expected, fact);
    }

    @Test
    void testNumberThree() {
        StatsService service = new StatsService();
        int[] month = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 9;
        int fact = service.minSales(month);
        Assertions.assertEquals(expected, fact);
    }

    @Test
    void testNumberFour() {
        StatsService service = new StatsService();
        int[] month = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 8;
        int fact = service.maxSales(month);
        Assertions.assertEquals(expected, fact);
    }

    @Test
    void testNumberFive() {
        StatsService service = new StatsService();
        int[] month = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int fact = service.monthBelowAverage(month);
        Assertions.assertEquals(expected, fact);
    }

    @Test
    void testNumberSix() {
        StatsService service = new StatsService();
        int[] month = {
                8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18
        };
        int expected = 5;
        int fact = service.monthAboveAverage(month);
        Assertions.assertEquals(expected, fact);
    }
}
