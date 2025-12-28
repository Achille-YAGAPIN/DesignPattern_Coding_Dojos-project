package src;

public class Airport {
    private static int _planesOnRunwayCount = 0;
    private static boolean _accident = false;

    public static synchronized void addPlaneToRunway() {
        _planesOnRunwayCount++;
        checkRunways();
    }

    public static synchronized void removePlaneFromRunway() {
        _planesOnRunwayCount--;
        checkRunways();
    }

    public static synchronized boolean hasAccident() {
        return _accident;
    }

    private static synchronized void checkRunways() {
        if (_planesOnRunwayCount > 1) {
            _accident = true;
        }
    }
}
