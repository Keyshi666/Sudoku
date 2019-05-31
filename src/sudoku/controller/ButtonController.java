package sudoku.controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import sudoku.model.Game;


public class ButtonController implements ActionListener {
    private Game game;


    public ButtonController(Game game) {
        this.game = game;
    }


    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Новая игра"))
            game.newGame();
        else if (e.getActionCommand().equals("Проверить"))
            game.checkGame();
        else if (e.getActionCommand().equals("Выход"))
            System.exit(0);
        else if (e.getActionCommand().equals("Помощь"))
            game.setHelp(((JCheckBox)e.getSource()).isSelected());
        else
            game.setSelectedNumber(Integer.parseInt(e.getActionCommand()));
    }
}