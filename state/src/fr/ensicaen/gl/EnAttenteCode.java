package fr.ensicaen.gl;
import java.util.Scanner;

public class EnAttenteCode extends Etat {
    public EnAttenteCode(Distributeur d) { super(d); }

@Override
public void entrerCode() {
    // Le try-with-resources garantit la fermeture automatique du scanner
    try (Scanner scanner = new Scanner(System.in)) {
        System.out.print("Code secret : ");
        if (scanner.hasNext()) { // Vérification de sécurité pour l'entrée
            String code = scanner.next();

            if (_distributeur.getCarte().estValide(code)) {
                System.out.println("Code accepté.");
                _distributeur.setEtat(_distributeur.getEtatAttenteOperation());
            } else {
                if (_distributeur.getCarte().resteEssais()) {
                    System.out.println("Code faux. Essais restants.");
                } else {
                    System.out.println("Carte avalée : trop d'échecs.");
                    _distributeur.setCarte(null);
                    _distributeur.setEtat(_distributeur.getEtatAttenteCarte());
                }
            }
        }
    } catch (Exception e) {
        System.err.println("Erreur lors de la lecture du code : " + e.getMessage());
    }
}

    @Override public void insererCarte(Carte c) { System.out.println("Carte déjà insérée."); }
    @Override public void retirerEspeces(int m) { System.out.println("Saisissez le code d'abord."); }
    @Override public void retirerCarte() {
        System.out.println("Annulation. Reprenez votre carte.");
        _distributeur.setCarte(null);
        _distributeur.setEtat(_distributeur.getEtatAttenteCarte());
    }
}