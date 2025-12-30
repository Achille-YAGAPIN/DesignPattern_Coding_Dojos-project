package fr.ensicaen.gl;

public class Main {
    public static void main(String[] args) {
        Distributeur dab = new Distributeur();
        Carte maCarte = new Carte("1234");

        // Test 1 : Retrait normal + Solde
        dab.insererCarte(maCarte);
        dab.entrerUnCode(); // Saisir 1234
        dab.donnerSolde();
        dab.retirerEspeces(40);

        // Test 2 : Vider la machine (il reste 40€)
        dab.insererCarte(maCarte);
        dab.entrerUnCode(); // Saisir 1234
        dab.retirerEspeces(40); 

        // Test 3 : Tentative quand vide
        dab.insererCarte(maCarte); 
    }
}