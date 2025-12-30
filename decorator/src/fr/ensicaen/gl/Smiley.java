package fr.ensicaen.gl;

public class Smiley extends LogoAccessory {
    public Smiley(SuperLogo logo) {super(logo);}

    @Override
    public MyImage getLogo() {
        MyImage image = super.getLogo();
        image.paintOver("img/smiley.png", 260, 210);
        return image;
    }

    @Override
    public double getPrice() {return super.getPrice() + 1.20;}
}