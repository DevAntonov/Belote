package org.belote.GUI;

import org.belote.GUI.Panels.LobbyPanel;
import org.belote.GUI.Panels.MainMenuPanel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BeloteFrame extends JFrame implements ActionListener{
    JButton button;
    JButton button2;
    JButton button3;
    MainMenuPanel mainMenuPanel;
    LobbyPanel lobbyPanel;


    public BeloteFrame() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1280, 720);
        this.setResizable(false);
        this.setTitle("Belote");
        this.setLayout(null);

        ImageIcon imageIcon = new ImageIcon(getClass().getResource("/belote_icon.png").getPath());
        mainMenuPanel = new MainMenuPanel();
        lobbyPanel = new LobbyPanel();
        lobbyPanel.setVisible(false);

        mainMenuPanel.lobbyButton.addActionListener(this);
        mainMenuPanel.exitButton.addActionListener(this);
        lobbyPanel.backButton.addActionListener(this);


        this.getContentPane().setBackground(new Color(0, 100, 0));
        this.setIconImage(imageIcon.getImage());
        this.add(mainMenuPanel);
        this.add(lobbyPanel);
        this.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource() == mainMenuPanel.lobbyButton) {
            mainMenuPanel.setVisible(false);
            lobbyPanel.setVisible(true);
        }

        if (actionEvent.getSource() == mainMenuPanel.exitButton) {
            System.exit(0);
        }

        if (actionEvent.getSource() == lobbyPanel.backButton) {
            lobbyPanel.setVisible(false);
            mainMenuPanel.setVisible(true);
        }
    }
}
