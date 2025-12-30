package fr.ensicaen.gl;

public class MachineVide extends Etat {
    public MachineVide(Distributeur d) { super(d); }

    @Override
    public void insererCarte(Carte carte) {
        System.out.println("Hors service : plus de billets disponibles.");
    }

    @Override public void entrerCode() {}
    @Override public void retirerEspeces(int m) {}
    @Override public void retirerCarte() {}
}