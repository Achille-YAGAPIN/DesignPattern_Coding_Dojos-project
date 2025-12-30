package fr.ensicaen.gl;

public class Carte {
private final String _codeSecret;
    private int _essaisRestants = 3;
    private final int _soldeCompte = 500; // Solde simulé

    public Carte(String code) {
        _codeSecret = code;
    }

    public boolean estValide(String codeEntre) {
        if (_codeSecret.equals(codeEntre)) {
            return true;
        }
        _essaisRestants--;
        return false;
    }

    public boolean resteEssais() {
        return _essaisRestants > 0;
    }

    public int getSolde() {
        return _soldeCompte;
    }

    public void debiter( int montant ) {
        System.out.println("Débit : " + montant + " euros");
    }
}
