package fr.ensicaen.gl;

public abstract class LogoAccessory implements SuperLogo{
    protected final SuperLogo logo;

    protected LogoAccessory(SuperLogo logo) {this.logo = logo;}

    @Override
    public MyImage getLogo() {return logo.getLogo();}

    @Override
    public double getPrice() {return logo.getPrice();}
}
