package cn.huntercat.swing;

import javax.swing.*;
import java.awt.*;

public class NotHelloWorldFrame extends JFrame {

    public NotHelloWorldFrame() {
        add(new NotHelloWorldComponent());
        pack();
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            NotHelloWorldFrame frame = new NotHelloWorldFrame();
            frame.setTitle("NotHelloWorld");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
        });
    }
}
