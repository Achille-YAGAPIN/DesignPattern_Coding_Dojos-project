package src;

public class ControlTower {

    private static ControlTower instance;
    private boolean _isRunwayFree;

    private ControlTower() {
        System.out.println("Creation of control tower " + this);
        _isRunwayFree = true;
    }

    public static synchronized ControlTower getInstance() {
        if (instance == null) {
            instance = new ControlTower();
        }
        return instance;
    }

    public synchronized boolean reserveRunway( String name ) {
        if (_isRunwayFree) {
            _isRunwayFree = false;
            System.out.println("Control tower : " + name + " has the runway.");
            Airport.addPlaneToRunway();
            return true;
        } else {
            return false;
        }
    }

    public synchronized void freeRunway( String name ) {
        System.out.println("Control tower : " + name + " cleared the runway.");
        Airport.removePlaneFromRunway();
        _isRunwayFree = true;
    }
}
