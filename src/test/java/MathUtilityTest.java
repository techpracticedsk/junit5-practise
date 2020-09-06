import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MathUtilityTest {

    @Test
    void add() {
        MathUtility mUtil = new MathUtility();
        int resultExpected = 5;
        int actual = mUtil.add(2,3);
        assertEquals(resultExpected,actual);
    }
}