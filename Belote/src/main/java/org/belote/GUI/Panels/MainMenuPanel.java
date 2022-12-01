package org.belote.GUI.Panels;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainMenuPanel extends JPanel {

   public final JButton lobbyButton;
   public final JButton exitButton;
    JLabel mainMenuText;
    JLabel mainMenuImage;

    public MainMenuPanel() {

        ImageIcon menuImage = new ImageIcon(getClass().getResource("/menu_image.png").getPath());

        mainMenuText = new JLabel("Belote");
        mainMenuText.setBounds(120, 50, 400, 100);
        mainMenuText.setHorizontalAlignment(SwingConstants.CENTER);
        mainMenuText.setVerticalAlignment(SwingConstants.CENTER);
        mainMenuText.setFont(new Font("MV Boli",Font.ITALIC, 100));

        mainMenuImage = new JLabel(menuImage);
        mainMenuImage.setBounds(64, 150, 512, 512);
        mainMenuImage.setHorizontalAlignment(SwingConstants.CENTER);
        mainMenuImage.setVerticalAlignment(SwingConstants.CENTER);

        lobbyButton = new JButton();
        lobbyButton.setBounds(233, 300, 175, 60);
        lobbyButton.setPreferredSize(new Dimension(175, 60));
        lobbyButton.setText("Lobby");
        lobbyButton.setFont(new Font("MV Boli", Font.BOLD, 30));


        exitButton = new JButton();
        exitButton.setBounds(233, 380, 175, 60);
        exitButton.setPreferredSize(new Dimension(175, 60));
        exitButton.setText("Exit");
        exitButton.setFont(new Font("MV Boli", Font.BOLD, 30));


        this.setBounds(320, 0, 640, 720);
        this.setBackground(new Color(0, 100, 0));
        this.setLayout(null);
        this.add(lobbyButton);
        this.add(exitButton);
        this.add(mainMenuText);
        this.add(mainMenuImage);

    }
}
