package src;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.*;
import javax.imageio.ImageIO;
import javax.swing.*;

public class LoadAndShow extends JPanel {
    private final BufferedImage _image;
    private final Dimension _size = new Dimension();

    public LoadAndShow( BufferedImage image ) {
        _image = image;
        _size.setSize(image.getWidth(), image.getHeight());
    }

    public static void show( String path ) {
        try {
            BufferedImage image = ImageIO.read(new File(path));
            LoadAndShow test = new LoadAndShow(image);
            JFrame f = new JFrame();
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.add(new JScrollPane(test));
            f.setSize(image.getWidth(), image.getHeight());
            f.setLocation(10, 10);
            f.setVisible(true);
        } catch (Exception ignored) {
        }
    }

    @Override
    protected void paintComponent( Graphics g ) {
        int x = (getWidth() - _size.width) / 2;
        int y = (getHeight() - _size.height) / 2;
        g.drawImage(_image, x, y, this);
    }

    @Override
    public Dimension getPreferredSize() {
        return _size;
    }
}