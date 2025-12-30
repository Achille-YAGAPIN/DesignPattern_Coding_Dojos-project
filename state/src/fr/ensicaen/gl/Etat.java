package fr.ensicaen.gl;

public abstract class Etat {
    protected Distributeur _distributeur;

    public Etat(Distributeur distributeur) {
        _distributeur = distributeur;
    }

    public abstract void insererCarte(Carte carte);
    public abstract void entrerCode();
    public abstract void retirerEspeces(int montant);
    public abstract void retirerCarte();

    public void donnerSolde() {
        System.out.println("Action impossible : vous n'êtes pas identifié.");
    }
}
