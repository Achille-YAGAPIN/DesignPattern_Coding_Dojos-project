package fr.ensicaen.gl;

public class Crazy_Frog implements SuperLogo {
    private final String _image;
    private final double _price;

    public Crazy_Frog() {
        _image = "img/crazy_frog.jpg";
        _price = 3.65;
    }

    public MyImage getLogo() {
        return new MyImage(_image);
    }

    public double getPrice() {
        return _price;
    }
}
