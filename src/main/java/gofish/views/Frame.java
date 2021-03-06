package gofish.views;

import gofish.models.Player;
import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {
    private int width, height, backgroundColor;

    public Frame(String name, int width, int height, int bgColor) {
        super(name);
        this.width = width;
        this.height = height;
        this.backgroundColor = bgColor;
        this.setMinimumSize(new Dimension(width, height));
        this.setBackground(new Color(bgColor));
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void loadPanel(JPanel panel) {
       // clear();
        // Load pane
        setContentPane(panel);
        pack();
        setVisible(true);
    }

    // probably don't need
    public void clear() {
        getContentPane().removeAll();
        revalidate();
        repaint();
    }
}