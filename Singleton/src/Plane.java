package src;

public class Plane extends Thread {
    private final String _name;
    private ControlTower _controlTower;

    public Plane( String n ) {
        _name = n;
    }

    public void takeoff() {
        while (!_controlTower.reserveRunway(_name)) {
            try {
                Thread.sleep((int) (Math.random() * 800));
            } catch (Exception ignored) {
            }
        }
        try {
            Thread.sleep((int) (Math.random() * 1500));
        } catch (Exception ignored) {
        }
        _controlTower.freeRunway(_name);
    }

    public void land() {
        while (!_controlTower.reserveRunway(_name)) {
            try {
                Thread.sleep((int) (Math.random() * 500));
            } catch (Exception ignored) {
            }
        }
        try {
            Thread.sleep((int) (Math.random() * 700));
        } catch (Exception ignored) {
        }
        _controlTower.freeRunway(_name);
    }

    public void run() {

        try {
            Thread.sleep(500); // simulate long creation time
            FactoryControlTower f = new FactoryControlTower();
            _controlTower = f.buildControlTower();
        } catch (Exception ignored) {}
                
        for (int i = 0; i < 3 && !Airport.hasAccident(); i++) {
            try {
                Thread.sleep((int) (Math.random() * 600));
            } catch (Exception ignored) {
            }
            takeoff();
            try {
                Thread.sleep((int) (Math.random() * 200));
            } catch (Exception ignored) {
            }
            land();
        }
    }
}
