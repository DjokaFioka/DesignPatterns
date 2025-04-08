package org.example.behavioral.memento.banas;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 A way to store previous states of an Object easily
 Memento: The basic object that is stored in different states
 Originator: Sets and Gets values from the currently targeted Memento. Creates new Mementos and assigns current values to them
 Caretaker: Holds an ArrayList that contains all previous versions of the Memento. It can store and retrieve stored Mementos.
 * */
public class MementoMain extends JFrame {
    public static void main(String[] args) {
        new MementoMain();
    }

    private final JButton saveButton, undoButton, redoButton;
    private final JTextArea theArticle = new JTextArea(40, 60);

    Caretaker caretaker = new Caretaker(); //holds the list of mementos
    Originator originator = new Originator();

    int saveFiles = 0;
    int currentArticle = 0;

    public MementoMain() {
        this.setSize(750, 780);
        this.setTitle("Memento Design Pattern");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panelMain = new JPanel();
        panelMain.add(new JLabel("Article"));
        panelMain.add(theArticle);

        ButtonListener saveListener = new ButtonListener();
        ButtonListener undoListener = new ButtonListener();
        ButtonListener redoListener = new ButtonListener();

        saveButton = new JButton("Save");
        saveButton.addActionListener(saveListener);

        undoButton = new JButton("Undo");
        undoButton.addActionListener(undoListener);

        redoButton = new JButton("Redo");
        redoButton.addActionListener(redoListener);

        panelMain.add(saveButton);
        panelMain.add(undoButton);
        panelMain.add(redoButton);

        this.add(panelMain);
        this.setVisible(true);
    }

    class ButtonListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == saveButton) {
                String textInTextArea = theArticle.getText();
                originator.setArticle(textInTextArea);
                caretaker.addMemento(originator.storeInMemento());
                saveFiles++;
                currentArticle++;
                System.out.println("Save Files " + saveFiles);

                undoButton.setEnabled(true);
            } else if (e.getSource() == undoButton) {
                if (currentArticle > 0) {
                    currentArticle--;
                    String textBoxString = originator.restoreFromMemento(caretaker.getMemento(currentArticle));
                    theArticle.setText(textBoxString);
                    redoButton.setEnabled(true);
                } else {
                    undoButton.setEnabled(false);
                }
            } else if (e.getSource() == redoButton) {
                if ((saveFiles - 1) > currentArticle) {
                    currentArticle++;
                    String textBoxString = originator.restoreFromMemento(caretaker.getMemento(currentArticle));
                    theArticle.setText(textBoxString);
                    undoButton.setEnabled(true);
                } else {
                    redoButton.setEnabled(false);
                }
            }
        }
    }
}
