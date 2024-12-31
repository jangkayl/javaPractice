package GAME.main;

import javax.swing.JFrame;

public class GameWindow extends JFrame{
    public GameWindow(GamePanel gamePanel){
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        add(gamePanel);
        setVisible(true);
    }
}
