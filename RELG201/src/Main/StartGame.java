package Main;

import Gui.Gui;

import javax.swing.*;
import java.io.IOException;

public class StartGame {
    public static void startgame() throws IOException {
        Gui gb = new Gui();
        JFrame f = new JFrame("RELG 201");
        f.setExtendedState(JFrame.MAXIMIZED_BOTH);
        f.add(gb.getGui());
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLocationByPlatform(true);
        f.pack();
        f.setMinimumSize(f.getSize());
        f.setVisible(true);
    }
}
