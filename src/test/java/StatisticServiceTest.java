import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatisticServiceTest {

    @Test
    void findMax(){
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {1, 2, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);
        assertEquals(expected, actual);
    }

    @Test
    void calculateSum(){
        StatisticService service = new StatisticService();

        long[] incomesInBillions = {1, 2, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 76;

        long actual = service.calculateSum(incomesInBillions);
        assertEquals(expected, actual);
    }


}