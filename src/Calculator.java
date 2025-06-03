import java.awt.*;
import java.awt.event.*;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.JFrame;

public class Calculator {
    int boardWidth= 360;
    int boardHeight= 540;

    Color customLightBlue= new Color(162,187,207);
    Color customDarkBlue=new Color(32,91,122);
    Color customBlack= new Color (28,28,28);
    Color customOrange= new Color(255,149,0);

    JFrame frame= new JFrame("Calculator");
    JLabel displayLabel= new JLabel();
    JPanel displayPanel= new JPanel();

    Calculator() {
        frame.setVisible(true);
        frame.setSize(boardWidth,  boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

    }
}