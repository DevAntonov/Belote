package com.belote.client.GUI.Panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LobbyPanel extends JPanel implements MouseListener {

    public final JButton backButton;
    public final JButton joinButton;
    public final JButton createButton;
    String[] list;

    JList<String> tables;
    JScrollPane tablesPanel;

    public LobbyPanel() {

        list = new String[]{"Masa 1", "Masa 2", "Masa 3", "Masa 4"};

        tables = new JList<>(list);
        tables.setFont(new Font("Arial", Font.PLAIN, 25));
        tablesPanel = new JScrollPane(tables);
        tablesPanel.setBounds(100, 50, 780, 490);
        tablesPanel.setBorder(BorderFactory.createLineBorder(Color.BLACK, 3));
        tables.addMouseListener(this);

        tables.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


        joinButton = new JButton("Join");
        joinButton.setBounds(353, 600, 175, 60);
        joinButton.setFont(new Font("MV Boli", Font.BOLD, 30));
        joinButton.setEnabled(false);
        joinButton.addMouseListener(this);

        createButton = new JButton("Create");
        createButton.setBounds(553, 600, 175, 60);
        createButton.setFont(new Font("MV Boli", Font.BOLD, 30));

        backButton = new JButton("Back");
        backButton.setBounds(753, 600, 175, 60);
        backButton.setFont(new Font("MV Boli", Font.BOLD, 30));

        this.setBounds(0, 0, 1280, 720);
        this.setBackground(new Color(0, 100, 0));
        this.setLayout(null);
        this.add(tablesPanel);
        this.add(joinButton);
        this.add(createButton);
        this.add(backButton);
    }

    @Override
    public void mouseClicked(MouseEvent mouseEvent) {
        if (mouseEvent.getSource() == tables) {
            joinButton.setEnabled(true);
        }

        if (mouseEvent.getSource() == joinButton) {
            System.out.println(tables.getSelectedValue());
        }

    }

    @Override
    public void mousePressed(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseReleased(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseEntered(MouseEvent mouseEvent) {

    }

    @Override
    public void mouseExited(MouseEvent mouseEvent) {

    }
}
