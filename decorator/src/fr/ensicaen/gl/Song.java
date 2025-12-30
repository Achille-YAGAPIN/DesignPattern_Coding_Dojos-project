package fr.ensicaen.gl;

public class Song extends LogoAccessory {
    public Song(SuperLogo logo) {super(logo);}

    @Override
    public MyImage getLogo() {
        MyImage image = super.getLogo();
        image.paintOver("img/song.png", 10, 10);
        return image;
    }

    @Override
    public double getPrice() {return super.getPrice() + 1.20;}
}
