package fr.ensicaen.gl;

public class EnAttenteOperation extends Etat {
    public EnAttenteOperation(Distributeur d) { super(d); }

    @Override
    public void donnerSolde() {
        System.out.println("Votre solde est de : " + _distributeur.getCarte().getSolde() + "€");
    }

    @Override
    public void retirerEspeces(int montant) {
        if (montant > _distributeur.getStockArgent()) {
            System.out.println("Fonds insuffisants dans le distributeur.");
        } else {
            _distributeur.retirerDuStock(montant);
            _distributeur.getCarte().debiter(montant);
            System.out.println("Veuillez récupérer vos billets (" + montant + "€).");
            
            if (_distributeur.getStockArgent() <= 0) {
                _distributeur.setEtat(_distributeur.getEtatMachineVide());
            }
        }
        retirerCarte();
    }

    @Override public void retirerCarte() {
        System.out.println("Merci. Reprenez votre carte.");
        _distributeur.setCarte(null);
        _distributeur.setEtat(_distributeur.getEtatAttenteCarte());
    }

    @Override public void insererCarte(Carte c) { System.out.println("Opération en cours."); }
    @Override public void entrerCode() { System.out.println("Déjà identifié."); }
}