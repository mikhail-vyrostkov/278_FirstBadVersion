import junit.framework.TestCase;

public class FirstBadVersionTest extends TestCase {
    public void testProfit() {
        VersionControl.ver = 7;
        int n = 10;
        int actualPrices = Main.Solution.firstBadVersion(n);
        int expectedPrices = VersionControl.ver;
        assertEquals(expectedPrices, actualPrices);
    }

    public void testZeroProfit() {
        VersionControl.ver = 54;
        int n = 100;
        int actualPrices = Main.Solution.firstBadVersion(n);
        int expectedPrices = VersionControl.ver;
        assertEquals(expectedPrices, actualPrices);
    }
}