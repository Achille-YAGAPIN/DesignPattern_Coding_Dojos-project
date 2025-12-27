package fr.ensicaen.gl;

public class FactoryProducer {
    public static Factory getFactory(String os) {
        if (os.equalsIgnoreCase("windows")) return new WindowsFactory();
        if (os.equalsIgnoreCase("unix")) return new UnixFactory();
        if (os.equalsIgnoreCase("mac")) return new MacFactory();
        throw new IllegalArgumentException("OS inconnu : " + os);
    }
}
