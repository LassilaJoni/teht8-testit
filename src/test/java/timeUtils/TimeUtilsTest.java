package timeUtils;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

import static org.junit.jupiter.api.Assertions.*;

class TimeUtilsTest {

    @ParameterizedTest(name = "{0} seconds should be converted to {1}")
    @CsvSource({
            "0, 0:00:00",
            "1, 0:00:01",
            "59, 0:00:59",
            "60, 0:01:00",
            "3599, 0:59:59",
            "3600, 1:00:00",
            "3661, 1:01:01",
            "86399, 23:59:59",
    })
    public void testSecToTime(int seconds, String expected) {
        assertEquals(expected, TimeUtils.secToTime(seconds));
    }
}