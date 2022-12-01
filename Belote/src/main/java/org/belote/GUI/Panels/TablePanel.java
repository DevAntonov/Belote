package org.belote.GUI.Panels;

import javax.swing.*;
import java.awt.*;

public class TablePanel extends JPanel {

    JLabel tableName;
    JLabel scoreLabel;
    JTextField northAndSouthTeamPoints;
    JTextField eastAndWestTeamPoints;

    public TablePanel() {

        ImageIcon image = new ImageIcon(getClass().getResource("/menu_image2.png").getPath());
        JLabel tableImage = new JLabel(image);
        tableImage.setBounds(512, 220, 256, 256);
        tableImage.setHorizontalAlignment(SwingConstants.CENTER);
        tableImage.setVerticalAlignment(SwingConstants.CENTER);

        tableName = new JLabel();
        tableName.setBounds(10, 30, 200, 50);
        tableName.setHorizontalAlignment(SwingConstants.CENTER);
        tableName.setFont(new Font("MV Boli", Font.BOLD, 30));


        scoreLabel = new JLabel();
        scoreLabel.setBounds(10, 80, 200, 30);
        scoreLabel.setFont(new Font("Arial", Font.PLAIN, 20));
        scoreLabel.setHorizontalAlignment(SwingConstants.CENTER);
        scoreLabel.setText("0 - 0");


        this.setBounds(0, 0, 1280, 720);
        this.setBackground(new Color(0, 100, 0));
        this.setLayout(null);
        this.add(tableImage);
        this.add(tableName);
        this.add(scoreLabel);
    }

    public void setTableName(String name) {
        tableName.setText(name);
    }
}
