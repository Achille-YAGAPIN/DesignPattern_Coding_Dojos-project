package src;

public class FactoryControlTower {
    public FactoryControlTower() {
    }

    public ControlTower buildControlTower() {
        return ControlTower.getInstance();
    }
}
