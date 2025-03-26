package org.example.structural.flyweight.banas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

/**
 Used when we need to create a large number of similar objects
 Intrinsic state
 Extrinsic state
 * */
public class FlyweightMain extends JFrame {
    JButton startDrawing;

    int windowWidth = 1750;
    int windowHeight = 1000;

    Color[] shapeColor = {Color.orange, Color.red, Color.yellow, Color.blue,
            Color.pink, Color.cyan, Color.magenta, Color.black, Color.gray};

    public static void main(String[] args) {

        new FlyweightMain();
    }

    public FlyweightMain() {
        this.setSize(windowWidth, windowHeight);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Flyweight Test");

        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        final JPanel drawingPanel = new JPanel();

        startDrawing = new JButton("Draw Stuff");

        contentPane.add(drawingPanel, BorderLayout.CENTER);
        contentPane.add(startDrawing, BorderLayout.SOUTH);

        startDrawing.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Graphics g = drawingPanel.getGraphics();
                long startTime = System.currentTimeMillis();

                for (int i = 0; i < 100000; i++) {

                    // Flyweight - reusing color as an intrinsic state - should be much faster
                    MyRect rect = RectFactory.getRect(getRandColor());
                    rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());

                }

                long endTime = System.currentTimeMillis();

                System.out.println("Flyweight took " + (endTime - startTime));

                startTime = System.currentTimeMillis();

                for (int i = 0; i < 100000; i++) {

                    //Drawing new one every time - slower
                    MyRect rect = new MyRect(getRandColor());
                    rect.draw(g, getRandX(), getRandY(), getRandX(), getRandY());

                    // Slower
                    //g.setColor(getRandColor());
                    //g.fillRect(getRandX(), getRandY(), getRandX(), getRandY());
                }

                endTime = System.currentTimeMillis();

                System.out.println("NOT Flyweight took " + (endTime - startTime));
            }
        });

        this.add(contentPane);
        this.setVisible(true);

    }

    private Color getRandColor() {
        Random rand = new Random();
        int randInt = rand.nextInt(9);
        return shapeColor[randInt];
    }

    private int getRandX() {
        return (int) (Math.random() * windowWidth);
    }

    private int getRandY() {
        return (int) (Math.random() * windowHeight);
    }
}
