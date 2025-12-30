package fr.ensicaen.gl;

public class Candy extends LogoAccessory {
    public Candy(SuperLogo logo) {super(logo);}

    @Override
    public MyImage getLogo() {
        MyImage image = super.getLogo();
        image.paintOver("img/candy.png", 441, 202);
        return image;
    }

    @Override
    public double getPrice() {return super.getPrice() + 1.20;}
}
