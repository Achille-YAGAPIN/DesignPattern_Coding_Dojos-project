package fr.ensicaen.gl;

public class Sun_Glasses extends LogoAccessory {
    public Sun_Glasses(SuperLogo logo) {super(logo);}

    @Override
    public MyImage getLogo() {
        MyImage image = super.getLogo();
        image.paintOver("img/sun_glasses.png", 255, 76);        
        return image;
    }

    @Override
    public double getPrice() {return super.getPrice() + 1.20;}
}
