package fr.ensicaen.gl;

public class ReneLaTaupe implements SuperLogo {
    private final String _image;
    private final double _price;

    public ReneLaTaupe() {
        _image = "img/rene_la_taupe.jpg";
        _price = 3.65;
    }

    public MyImage getLogo() {
        return new MyImage(_image);
    }

    public double getPrice() {
        return _price;
    }
}
