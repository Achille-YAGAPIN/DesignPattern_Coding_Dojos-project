package fr.ensicaen.gl;

public class EnAttenteCarte extends Etat {
    public EnAttenteCarte(Distributeur d) { super(d); }

    @Override
    public void insererCarte(Carte carte) {
        System.out.println("Carte insérée.");
        _distributeur.setCarte(carte);
        _distributeur.setEtat(_distributeur.getEtatAttenteCode());
    }

    @Override public void entrerCode() { System.out.println("Veuillez insérer une carte."); }
    @Override public void retirerEspeces(int m) { System.out.println("Veuillez insérer une carte."); }
    @Override public void retirerCarte() { System.out.println("Aucune carte présente."); }
}