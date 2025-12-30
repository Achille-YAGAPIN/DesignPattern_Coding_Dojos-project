package fr.ensicaen.gl;

public class Main {

    public static void main( String[] args ) {
        
        SuperLogo logo =new Song(new Hat(new Sun_Glasses(new Crazy_Frog())));
        
        MyImage image = logo.getLogo();
        image.display();
        System.out.println("Prix : " + logo.getPrice() + " euros");
    }
}
