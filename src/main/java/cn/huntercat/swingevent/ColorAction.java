package cn.huntercat.swingevent;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorAction implements ActionListener {

    private Color backgroundColor;

    public ColorAction(Color backgroundColor) {
        this.backgroundColor = backgroundColor;
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
