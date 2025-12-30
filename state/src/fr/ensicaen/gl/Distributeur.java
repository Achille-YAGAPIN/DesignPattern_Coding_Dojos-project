package fr.ensicaen.gl;

public class Distributeur {
    private final Etat _attenteCarte, _attenteCode, _attenteOperation, _machineVide;
    private Etat _etatCourant;
    private Carte _carte;
    private int _stockArgent = 80; // Stock initial pour test

    public Distributeur() {
        _attenteCarte = new EnAttenteCarte(this);
        _attenteCode = new EnAttenteCode(this);
        _attenteOperation = new EnAttenteOperation(this);
        _machineVide = new MachineVide(this);
        _etatCourant = _attenteCarte;
    }

    // Méthodes déléguées
    public void insererCarte(Carte c) { _etatCourant.insererCarte(c); }
    public void entrerUnCode() { _etatCourant.entrerCode(); }
    public void donnerSolde() { _etatCourant.donnerSolde(); }
    public void retirerEspeces(int m) { _etatCourant.retirerEspeces(m); }
    public void retirerCarte() { _etatCourant.retirerCarte(); }

    // Gestion interne
    void setEtat(Etat e) { _etatCourant = e; }
    void setCarte(Carte c) { _carte = c; }
    Carte getCarte() { return _carte; }
    int getStockArgent() { return _stockArgent; }
    void retirerDuStock(int m) { _stockArgent -= m; }

    Etat getEtatAttenteCarte() { return _attenteCarte; }
    Etat getEtatAttenteCode() { return _attenteCode; }
    Etat getEtatAttenteOperation() { return _attenteOperation; }
    Etat getEtatMachineVide() { return _machineVide; }
}