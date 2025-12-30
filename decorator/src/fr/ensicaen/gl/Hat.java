package fr.ensicaen.gl;

public class Hat extends LogoAccessory {
    public Hat(SuperLogo logo) {super(logo);}

    @Override
    public MyImage getLogo() {
        MyImage image = super.getLogo();
        image.paintOver("img/hat.png", 280, 42);
        return image;
    }

    @Override
    public double getPrice() {return super.getPrice() + 1.20;}
}
