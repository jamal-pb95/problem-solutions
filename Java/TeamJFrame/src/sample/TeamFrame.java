package sample;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

@SuppressWarnings("serial")
public class TeamFrame extends JFrame {
    public TeamFrame() throws IOException {
        Player player;
        Scanner hankeesData = new Scanner(new File("F:\\Projects\\problem-solving\\Java\\TeamJFrame\\src\\sample\\Hankees.txt"));

        for (int num = 1; num < 9; num++) {
            player = new Player(hankeesData.nextLine(), hankeesData.nextDouble());
            hankeesData.nextLine();
            addPlayerInfo(player);
        }

        setTitle("The Hankees");
        setLayout(new GridLayout(9, 2, 20, 3));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);

        hankeesData.close();
    }

    void addPlayerInfo(Player player) {
        add(new JLabel(" " + player.getName()));
        add(new JLabel(player.getAvgScoreString()));
    }
}

