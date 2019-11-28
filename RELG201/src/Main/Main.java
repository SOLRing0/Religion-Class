package Main;

import javax.swing.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        Runnable r = () -> {
            try {
                StartGame.startgame();
            } catch (IOException e) {
                e.printStackTrace();
            }
        };
        SwingUtilities.invokeLater(r);
    }
}
