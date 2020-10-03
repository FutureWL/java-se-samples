package cn.huntercat.swingevent;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            ButtonFrame buttonFrame = new ButtonFrame();
            buttonFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            buttonFrame.setVisible(true);
        });
    }
}
