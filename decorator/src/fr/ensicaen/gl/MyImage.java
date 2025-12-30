package fr.ensicaen.gl;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class MyImage extends JPanel {
    private BufferedImage _image;
    private final Dimension _size = new Dimension();

    public MyImage( String path ) {
        try {
            _image = ImageIO.read(new File(path));
            _size.setSize(_image.getWidth(), _image.getHeight());
        } catch (Exception e) {
            System.out.println("Error creating image with path " + path);
            e.printStackTrace(System.out);
        }
    }

    @Override
    protected void paintComponent( Graphics g ) {
        int x = (getWidth() - _size.width) / 2;
        int y = (getHeight() - _size.height) / 2;
        g.drawImage(_image, x, y, this);
    }

    public void display() {
        try {
            JFrame frame = new JFrame();
            frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
            frame.add(new JScrollPane(this));
            frame.setSize(_image.getWidth(), _image.getHeight());
            frame.setLocation(10, 10);
            frame.setVisible(true);
        } catch (Exception ignored) {
        }
    }

    public void paintOver( String otherImage, int xShift, int yShift ) {
        try {
            BufferedImage newImage = ImageIO.read(new File(otherImage));

            final int sizeX = newImage.getWidth();
            final int sizeY = newImage.getHeight();

            for (int x = 0; x < sizeX; x++) {
                for (int y = 0; y < sizeY; y++) {
                    int pixel = newImage.getRGB(x, y);
                    int alphaNew = (pixel >> 24) & 0xFF;
                    if (alphaNew > 0) {
                        if (((x + xShift) < _image.getWidth()) && ((y + yShift) < _image.getHeight())) {
                            double alpha = alphaNew / 255.0;
                            int pixelOrig = _image.getRGB(x + xShift, y + yShift);
                            int pixelFinal = getPixelFinal(pixelOrig, pixel, alpha);
                            _image.setRGB(x + xShift, y + yShift, pixelFinal);
                        }
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error creating image with path " + otherImage);
            e.printStackTrace(System.out);
        }
    }

    private static int getPixelFinal( int pixelOrig, int pixel, double alpha ) {
        int redOrig = ((pixelOrig >> 16) & 0xFF);
        int greenOrig = ((pixelOrig >> 8) & 0xFF);
        int blueOrig = (pixelOrig & 0xFF);
        int redNew = ((pixel >> 16) & 0xFF);
        int greenNew = ((pixel >> 8) & 0xFF);
        int blueNew = (pixel & 0xFF);
        int finalRed = (int) (redNew * alpha + redOrig * (1.0 - alpha));
        int finalGreen = (int) (greenNew * alpha + greenOrig * (1.0 - alpha));
        int finalBlue = (int) (blueNew * alpha + blueOrig * (1.0 - alpha));
        return finalRed * 65536 + finalGreen * 256 + finalBlue;
    }
}