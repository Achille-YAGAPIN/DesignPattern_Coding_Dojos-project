package src;

public class Main {
    public static void main( String[] args ) {
        Plane a1 = new Plane("Airplane 1");
        Plane a2 = new Plane("Airplane 2");
        Plane a3 = new Plane("Airplane 3");

        a1.start();
        a2.start();
        a3.start();

        // Wait for all threads to complete
        try {
            a1.join();
            a2.join();
            a3.join();
        } catch (Exception ignored) {
        }

        if (Airport.hasAccident()) {
            LoadAndShow.show("img/rate.jpg");
        } else {
            LoadAndShow.show("img/bravo.jpg");
        }
    }
}
