package com.belote.client.GUI.Panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CreatePanel extends JPanel implements KeyListener{
    public final JButton cancelButton;
    public final JButton createButton;
    public final JTextField tableName;

    public CreatePanel() {

        createButton = new JButton("Create");
        createButton.setBounds(453, 400, 175, 60);
        createButton.setFont(new Font("MV Boli", Font.BOLD, 30));
        createButton.setEnabled(false);

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(653, 400, 175, 60);
        cancelButton.setFont(new Font("MV Boli", Font.BOLD, 30));

        tableName = new JTextField();
        tableName.setBounds(490, 300, 300, 50);
        tableName.setFont(new Font("Arial", Font.PLAIN, 25));
        tableName.addKeyListener(this);

        this.setBounds(0, 0, 1280, 720);
        this.setBackground(new Color(0, 100, 0));
        this.setLayout(null);
        this.add(createButton);
        this.add(cancelButton);
        this.add(tableName);
    }

    @Override
    public void keyTyped(KeyEvent keyEvent) {

    }

    @Override
    public void keyPressed(KeyEvent keyEvent) {

    }

    @Override
    public void keyReleased(KeyEvent keyEvent) {

        int length = tableName.getText().length();
        if (length > 2) {
            createButton.setEnabled(true);
        }

        if (length < 3 || length > 10) {
            createButton.setEnabled(false);
        }
    }
}
