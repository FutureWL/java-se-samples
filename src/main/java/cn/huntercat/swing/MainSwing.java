package cn.huntercat.swing;

import javax.swing.*;
import java.awt.*;

public class MainSwing {
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            SimpleFrame simpleFrame = new SimpleFrame();
            simpleFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            simpleFrame.setVisible(true);
        });
    }
}



