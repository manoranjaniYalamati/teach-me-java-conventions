import org.junit.jupiter.api.Test;
import powerpackage.PowerFinder;

public class PowerTest {
    @Test
    public void oneRaisedToOne() {
        assert PowerFinder.pow(1,1) == 1;
    }

    @Test
    public void twoRaisedToOne() {
        assert PowerFinder.pow(2,1) == 2;
    }

    @Test
    public void twoRaisedToTwo() {
        assert PowerFinder.pow(2, 2) == 4;
    }

    @Test
    public void threeRaisedToTwo() {
        assert PowerFinder.pow(3, 1) == 3*3;
    }
}
