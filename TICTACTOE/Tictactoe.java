package TICTACTOE;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.util.Random;

import javax.swing.*;
import javax.swing.event.*;

public class Tictactoe implements AncestorListener {

    Random random = new Random();
    JFrame frame = new JFrame();
    JPanel title_panel = new JPanel();
    JPanel button_panel = new JPanel();
    JLabel textField = new JLabel();
    JButton[] buttons = new JButton[9];
    boolean player1_turn;
    
    Tictactoe(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(700, 700);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setLayout(new BorderLayout());
        frame.setVisible(true);
        
        textField.setBackground(new Color(25, 25, 25));
        textField.setForeground(new Color(25, 255, 0));
        textField.setFont(new Font("Ink Free", Font.BOLD, 75));
        textField.setText("Tic-Tac-Toe");
        textField.setHorizontalAlignment(JLabel.CENTER);
        textField.setOpaque(true);

        title_panel.setLayout(new BorderLayout());
        title_panel.setBounds(0, 0, 700, 100);

        title_panel.add(textField);
        frame.add(title_panel, BorderLayout.NORTH);
    }

    public void actionPerformed(Action e){

    }

    public void firstTurn(){

    }

    public void check(){

    }

    public void xWins(int a, int b, int c){

    }

    public void oWins(int a, int b, int c){

    }

    @Override
    public void ancestorAdded(AncestorEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ancestorAdded'");
    }

    @Override
    public void ancestorRemoved(AncestorEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ancestorRemoved'");
    }

    @Override
    public void ancestorMoved(AncestorEvent event) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'ancestorMoved'");
    }

}